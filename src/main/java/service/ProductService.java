package service;

import model.Product;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class ProductService {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public void save(User user){
        jdbcTemplate.execute("SELECT * from user ");
    }
}
