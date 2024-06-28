package pl.elbarmaki.ecommerce.catalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class jdbcPlaygroundTest {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void iamAbleToQueryDb(){
        var mySqlQuery = "select now() curr_date";

        var result = jdbcTemplate.queryForObject(mySqlQuery, String.class);

        assert result.contains("2024");

    }

}
