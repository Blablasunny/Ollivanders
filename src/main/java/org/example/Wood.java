
package org.example;

public class Wood {
    int id;
    String type;
    String supplier;

    public Wood(int id, String type, String supplier) {
        this.id = id;
        this.type = type;
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Wood{id=" + id + ", type='" + type + "', supplier='" + supplier + "'}";
    }
}
