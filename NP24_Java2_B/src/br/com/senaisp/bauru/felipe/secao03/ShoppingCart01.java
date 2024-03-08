package br.com.senaisp.bauru.felipe.secao03;

public class ShoppingCart01 {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName + " wants to purchase a "+itemDesc;   
        System.out.println(message);
      double price = 5.00, tax = 0.05;
      int quantity = 3;
      
      double totalPrice = price * quantity * (1 + tax);
   
      message = custName + " wants to purchase "+ quantity + " of the " +itemDesc;
      message = "Total : $" + totalPrice;
      System.out.println(message); 
    }
}
