
package org.example;

import java.util.Date;

public class Customer {
    int id;
    String name;
    Date purchaseDate;

    public Customer(int id, String name, Date purchaseDate) {
        this.id = id;
        this.name = name;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', purchaseDate=" + purchaseDate + "}";
    }
}
