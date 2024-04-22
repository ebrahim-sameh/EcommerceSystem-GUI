
package com.mycompany.ecommercesystem;
import com.mycompany.ecommercesystem.CustomerDataGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hema
 */
public class EcommerceSystem {

    public static void main(String[] args) {
        ElectronicProduct smartphone = new ElectronicProduct("Samsung", 1,1, "smartphone", 599.9 );
        ClothingProduct tshirt = new ClothingProduct("Medium","Cotton",2, "T-shirt", 19.99);
        BookProduct oopBook = new BookProduct("O’Reilly","X Publications",3, "OOP", 39.99);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CustomerDataGUI gui = new CustomerDataGUI();
                gui.setProducts(new Product[]{smartphone, tshirt, oopBook});
                System.out.println("setted the avail prods");
                System.out.println(gui.getAvailableProducts());
//                gui.displayAvailableProducts();

            }
        });
    }
}

