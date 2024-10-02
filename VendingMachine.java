public class VendingMachine {
   
    private int bottles;
    
    public VendingMachine(){
       bottles = 20;
    }
 
    public boolean purchase(int amount){
      if(amount <= bottles){
       bottles -= amount;
       return true; 
      } else {
         return false;
       }
    }
   
    public int getInventory(){
       return bottles;
    }
 
    public void restock(int amount){
       bottles = bottles + amount;
    }
  
    public void report(){
       System.out.println("Inventory: " + bottles + " bottles");
    }
    
 }
 