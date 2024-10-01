import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        while (true) {
            String[] options = {"Customer", "Vendor", "Exit"};
            int userType = JOptionPane.showOptionDialog(null, 
                "Choose one: Customer or Vendor", 
                "Vending Machine", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, options, options[0]);

                if(userType == 2){
                  System.exit(0);
                }

        }
    }
}
