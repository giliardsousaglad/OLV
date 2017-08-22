package br.com.olv.dao;

import br.com.olv.api.model.Sale;
import org.springframework.stereotype.Repository;

/**
 * Created by giliard-ss on 22/08/2017.
 */

public interface SaleDao {
    /**
     *
     * @param sale
     */
    void insert(Sale sale);
}
