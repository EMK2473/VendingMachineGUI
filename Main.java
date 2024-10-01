import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int numToPurchase;
      int numToPurchase2;
      int numToRestock;
      
      numToPurchase = scnr.nextInt();
      numToRestock = scnr.nextInt();
      numToPurchase2 = scnr.nextInt();
      
      VendingMachine vendingMachine = new VendingMachine();
      vendingMachine.purchase(numToPurchase);
      vendingMachine.restock(numToRestock);
      vendingMachine.purchase(numToPurchase2);
      
      vendingMachine.report();
   }
}