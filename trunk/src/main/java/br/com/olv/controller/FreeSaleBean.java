package br.com.olv.controller;

import br.com.olv.api.model.Sale;
import br.com.olv.dao.SaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by giliard-ss on 18/08/2017.
 */

@Controller
@SessionScope
public class FreeSaleBean {
    private List<Sale> sales;

    @Autowired
    private SaleDao saleDao;

    public void init(){
        sales = new ArrayList<Sale>();

        for(int i=1;i<=17;i++){
            Sale sale = new Sale();
            sale.setCost(29.50);
            sale.setDescription("Test one of product brazilian");
            sales.add(sale);
        }
        saleDao.insert(sales.get(0));
    }

    public void page(){
        sales = new ArrayList<Sale>();

        for(int i=1;i<=4;i++){
            Sale sale = new Sale();
            sale.setCost(29.50);
            sale.setDescription("Gilaird sousa dos santosn");
            sales.add(sale);
        }
    }


    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
