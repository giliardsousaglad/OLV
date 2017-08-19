package br.com.olv.api.model;

import java.util.List;

/**
 * Created by giliard-ss on 18/08/2017.
 */
public class SaleGroup {
    private List<Sale> saleGroup;

    public List<Sale> getSaleGroup() {
        return saleGroup;
    }

    public void setSaleGroup(List<Sale> saleGroup) {
        this.saleGroup = saleGroup;
    }
}
