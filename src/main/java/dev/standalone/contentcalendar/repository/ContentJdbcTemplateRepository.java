package dev.standalone.contentcalendar.repository;

import dev.standalone.contentcalendar.model.Content;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ContentJdbcTemplateRepository {

    private final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

//    private static Content mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return new Content(rs.getInt("id"),
//        rs.getString("title"),
//        rs.getString("desc"),
//        rs.getString("status"),
//        rs.getString("content_type"),
//        rs.getTimestamp("date_created"),
//        rs.getTimestamp("date_updated"),
//        rs.getString("url"));
//    }
//
//    public List<Content> getAllContent() {
//        String sql = "SELECT * FROM Content";
//        List<Content> contents = jdbcTemplate.query(sql, ContentJdbcTemplateRepository::mapRow);
//        return contents;
//    }


}
