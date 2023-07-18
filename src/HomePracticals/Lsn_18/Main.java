package HomePracticals.Lsn_18;

import HomePracticals.Lsn_18.Exceptions.InsufficientStockException;
import HomePracticals.Lsn_18.Exceptions.ItemNotFoundException;

class Main {
    public static void main(String[] args) {
        ShoppingSystem shoppingSystem = new ShoppingSystem();

        try {
            shoppingSystem.purchaseItem("Microwave", 7);
        }catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            shoppingSystem.purchaseItem("Refrigerator", 2);
        }catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            shoppingSystem.purchaseItem("Toyota", 1);
        }catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
