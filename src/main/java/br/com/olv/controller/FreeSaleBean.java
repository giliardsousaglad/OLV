package br.com.olv.controller;

import br.com.olv.api.model.Sale;
import org.springframework.web.context.annotation.SessionScope;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by giliard-ss on 18/08/2017.
 */
@ManagedBean
@ViewScoped
public class FreeSaleBean {
    private List<Sale> sales;

    public void init(){
        sales = new ArrayList<Sale>();

        for(int i=1;i<=17;i++){
            Sale sale = new Sale();
            sale.setCost(29.50);
            sale.setDescription("Test one of product brazilian");
            sales.add(sale);
        }
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
