package dev.standalone.contentcalendar.controller;

import dev.standalone.contentcalendar.model.Content;
import dev.standalone.contentcalendar.model.Status;
import dev.standalone.contentcalendar.repository.ContentCollectionRepository;
import dev.standalone.contentcalendar.repository.ContentJdbcTemplateRepository;
import dev.standalone.contentcalendar.repository.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/content")
@CrossOrigin
public class ContentController {

//    this is in-memory repository
//    private final ContentCollectionRepository repository;
//    private final ContentJdbcTemplateRepository repository;
    private final ContentRepository repository;

    public ContentController(ContentRepository repository) {
        // As spring already has an instance of 'repository'
        // There is no need to do the code below
        // repository = new ContentCollectionRepository();
        // Should find a way to get the Repository instance that
        // the ApplicationContext (check Application class) is having
        this.repository = repository;
        // Check dependency injection for more info
    }

    // Make a request and find all the pieces of content in the system
    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Content findById(@PathVariable("id") Integer id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody Content content) {
        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found!");
        }
        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @GetMapping("/filter/{keyword}")
    public List<Content> findByTitle(@PathVariable String keyword) {
        return repository.findAllByTitleContains(keyword);
    }

    @GetMapping("/filter/status/{status}")
    public List<Content> findByStatus(@PathVariable Status status) {
        return repository.listByStatus(status);
    }


}
