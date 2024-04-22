
package com.mycompany.ecommercesystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hema
 */
public class CustomerDataGUI extends JFrame {
    public Cart cart; // Instance variable to store the cart
    public void setCart(Cart cart) {
          this.cart = cart;
      }
     JTextField customerIdField;
     JTextField nameField;
     JTextField addressField;
    public CustomerDataGUI() {
        setTitle("Customer Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel customerIdLabel = new JLabel("Customer ID:");
        panel.add(customerIdLabel);
        customerIdField = new JTextField();
        panel.add(customerIdField);
        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);
        nameField = new JTextField();
        panel.add(nameField);
        JLabel addressLabel = new JLabel("Address:");
        panel.add(addressLabel);
        addressField = new JTextField();
        panel.add(addressField);
        JButton createCustomerButton = new JButton("Create Customer");
        createCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createCustomer();
            }
        });
        panel.add(createCustomerButton);

        add(panel);
        setVisible(true);
    }
    public void createCustomer() {
        try {
            int customerId = Integer.parseInt(customerIdField.getText());
            String name = nameField.getText();
            String address = addressField.getText();
            Customer customer = new Customer(name, address,customerId);
            int numberOfProducts = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of products:"));
            cart = new Cart(numberOfProducts, customerId);
            System.out.println("creaated cart object");
            // Print customer information (for testing)
            System.out.println("Customer ID: " + customer.getCustomerId());
            System.out.println("Name: " + customer.getName());
            System.out.println("Address: " + customer.getAddress());
            System.out.println("Number of Products: " + numberOfProducts);
            dispose();
            displayAvailableProducts();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for Customer ID.");
        }
    }
    public void displayAvailableProducts() {
    JFrame frame = new JFrame("Available Products");
    JPanel panel = new JPanel(new GridLayout(availableProducts.length, 2));
    for (Product product : availableProducts) {
        JLabel label = new JLabel(product.getName() + ": $" + product.getPrice());
        panel.add(label);
        JButton addButton = new JButton("Add to Cart");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToCart(product);
            }
        });
        panel.add(addButton);
    }
    frame.add(panel);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setVisible(true);
}
    public Order order;
    public void placeOrder(int customerId, Product[] products, double totalPrice) {
     order = new Order(customerId, generateOrderId(), products, totalPrice);
}
    public void addToCart(Product product) {
        if (!(cart.getProductsN())) {
            cart.addProduct(product);
            System.out.println("the number of products is "+cart.getProductsN()+"the mac number is "+cart.getNProducts());
            System.out.println(product.getName() + " added to cart.");
        }else{  int response = JOptionPane.showConfirmDialog(null, "Cart is full and your order total is"+ 
                cart.getTotalPrice()+"Do you want to confirm the order?", "Order Confirmation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            placeOrder(cart.getCustomerId(), cart.getProducts(), cart.getTotalPrice());
            System.out.println("Order confirmed.");
            displayOrderSummary(order.getOrderId(), order.getCustomerId(), order.getProducts(), order.getTotalPrice());
        } else {
            System.out.println("Order canceled.");
        }
    }}
public void displayOrderSummary(int orderId, int customerId, Product[] products, double totalPrice) {
    JFrame frame = new JFrame("Order Summary");
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    JLabel orderIdLabel = new JLabel("Order ID: " + orderId);
    orderIdLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
    panel.add(orderIdLabel);
    JLabel customerIdLabel = new JLabel("Customer ID: " + customerId);
    customerIdLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
    panel.add(customerIdLabel);
    for (Product product : products) {
        JLabel productNameLabel = new JLabel("Product: " + product.getName());
        productNameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        JLabel productPriceLabel = new JLabel("Price: $" + product.getPrice());
        productPriceLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(productNameLabel);
        panel.add(productPriceLabel);
    }
    JLabel totalPriceLabel = new JLabel("Total Price: $" + totalPrice);
    totalPriceLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
    panel.add(totalPriceLabel);
    frame.add(panel);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setVisible(true);
}
private int generateOrderId() {
    int rand = (int)(Math.random()*10000)+1;
    return rand; 
}   
        
    private Product[] availableProducts;
    public void setProducts(Product[] products) {
        availableProducts = products;
    }
   public Product[] getAvailableProducts() {
        return availableProducts;
    }

}

