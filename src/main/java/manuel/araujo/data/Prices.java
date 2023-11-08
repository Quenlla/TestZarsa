package manuel.araujo.data;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;


@Entity
public class Prices implements Serializable {

    private @Id @GeneratedValue int id;

    @Column(
            name="BRAND_ID"
    )
    private int brandID;
    @Column( name="START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name="END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(
            name="PRICE_LIST"
    )
    private int priceList;
    @Column(
            name="PRODUCT_ID"
    )
    private int productID;
    @Column(
            name="PRIORITY"
    )
    private int priority;
    @Column(
            name="PRICE"
    )
    private double price;
    @Column(
            name="CURR"
    )
    private String curr;


    public Prices(int id, int brandID, Date startDate, Date endDate, int priceList, int productID, int priority, double price, String curr) {
        this.id = id;
        this.brandID = brandID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.productID = productID;
        this.priority = priority;
        this.price = price;
        this.curr = curr;
    }

    public Prices() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPriceList() {
        return priceList;
    }

    public void setPriceList(int priceList) {
        this.priceList = priceList;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }
}
