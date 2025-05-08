
package org.example;

public class Main {
    public static void main(String[] args) {
        DBInitializer.initialize();
        new WandInventoryApp().launch();
    }
}
