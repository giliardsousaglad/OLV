package br.com.olv.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import java.util.Collections;
import java.util.List;

public abstract class AbstractJdbcDao<T> extends JdbcDaoSupport {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setAppJdbcTemplate(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}

	protected abstract RowMapper<T> rowMapper();

	protected int insert(String sql,  Object... args){
		return jdbcTemplate.update(sql, args);
	}

	protected T get(String sql, RowMapper<T> rowMapper, Object... id)  {
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}

	protected List<T> list(String sql, RowMapper<T> rowMapper, Object... args) {
		try{
            return jdbcTemplate.query(sql, rowMapper, args);
        } catch (EmptyResultDataAccessException ex) {
			return Collections.emptyList();
		}
    }

}
