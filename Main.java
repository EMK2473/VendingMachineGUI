import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        while (true) {
            String[] options = {"Customer", "Vendor", "Exit"};
            int userType = JOptionPane.showOptionDialog(null, "Current Bottles in inventory: " + vendingMachine.getInventory() + "\n" +
                "Choose one: Customer or Vendor", 
                "Vending Machine", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, options, options[0]);

                // if exit
                if(userType == 2){
                  int exitConfirmation = JOptionPane.showConfirmDialog(null, 
                    "Are you sure you want to exit?", 
                    "Exit Confirmation", 
                    JOptionPane.YES_NO_OPTION);
                  if (exitConfirmation == JOptionPane.YES_OPTION) {
                    System.exit(0);
                  }
                }

                // if customer
                else if(userType == 0){
                  boolean validInput = false;

                  while(!validInput){
                     String purchaseInput = JOptionPane.showInputDialog(null, "Current Bottles in inventory: " + vendingMachine.getInventory() + "\nHow many bottles would you like to purchase?");

                     if (purchaseInput == null) {
                        break;
                     }

                     try {
                        int purchaseAmountInt = Integer.parseInt(purchaseInput);

                        if (purchaseAmountInt < 0) {
                           JOptionPane.showMessageDialog(null, "Please enter a non-negative number.");
                           continue; 
                        }


                        boolean purchaseSuccess = vendingMachine.purchase(purchaseAmountInt);
                     
                        if (purchaseSuccess){
                           JOptionPane.showMessageDialog(null, "Thank you for your purchase!\n" + "Bottles left: " + vendingMachine.getInventory());
                        } else {
                           JOptionPane.showInternalMessageDialog(null, "Sorry, insufficient bottles in inventory :( ");
                        }

                        validInput = true;

                     } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                     }
                  }




                  // ask to continue or exit
                  int continueResponse = JOptionPane.showConfirmDialog(null, 
                     "Would you like to perform another action?", "Vending Machine", 
                     JOptionPane.YES_NO_OPTION);

                  if (continueResponse == JOptionPane.NO_OPTION) {
                     JOptionPane.showMessageDialog(null, 
                        "Thank you for using the Vending Machine!");
                     break;
                  }

               } 
               // if vendor
               else if (userType == 1) {
                  boolean validInput = false;

                  while(!validInput){
                     String restockInput = JOptionPane.showInputDialog(null, 
                     "Current Bottles in inventory: " + vendingMachine.getInventory() + 
                     "\nHow many bottles would you like to restock?");

                     if (restockInput == null) {
                        break; 
                     }

                     try {
                        int restockAmountInt = Integer.parseInt(restockInput);
                     
                        if (restockAmountInt < 0) {
                         JOptionPane.showMessageDialog(null, "Please enter a non-negative number.");
                         continue;
                     }

                     vendingMachine.restock(restockAmountInt);
                     JOptionPane.showMessageDialog(null, "Inventory restocked!\nBottles in inventory: " + vendingMachine.getInventory());

                     validInput = true;

                     } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                     }
                  }
               }

         }

      }
    }

