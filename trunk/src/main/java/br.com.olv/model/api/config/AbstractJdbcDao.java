package br.com.giliar.model.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

/**
 * Created by giliard-ss on 03/04/2017.
 */
public abstract class AbstractJdbcDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private void setJdbcTemplate(){
        this.jdbcTemplate = new JdbcTemplate(getDataSouce());
    }

    private DataSource getDataSouce(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");
        return dataSource;
    }


}
