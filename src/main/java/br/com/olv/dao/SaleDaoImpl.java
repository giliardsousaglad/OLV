package br.com.olv.dao;

import br.com.olv.api.config.AbstractJdbcDao;
import br.com.olv.api.model.Sale;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by giliard-ss on 22/08/2017.
 */
@Repository
public class SaleDaoImpl extends AbstractJdbcDao<Sale> implements SaleDao {

    public void insert(Sale sale) {
        final String sql = "insert into sale values (?)";
        insert(sql, sale.getCost());
    }

    @Override
    protected RowMapper<Sale> rowMapper() {
        return null;
    }
}
