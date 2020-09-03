package entity;

import java.sql.Date;

public class Item {
    private int id;
    private String name;
    private float price;
    private int qty;
    private Date createDate;
    private String info;

    public Item(int id, String name, float price, int qty, Date createDate, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.createDate = createDate;
        this.info = info;
    }

    public Item() {
    }
}
