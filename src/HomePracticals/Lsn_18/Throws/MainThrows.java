package HomePracticals.Lsn_18.Throws;

import HomePracticals.Lsn_18.Exceptions.InsufficientStockExceptionCh;
import HomePracticals.Lsn_18.Exceptions.ItemNotFoundExceptionCh;

public class MainThrows {
    public static void main(String[] args) {
        ThrowsShoppingSystem throwsShoppingSystem = new ThrowsShoppingSystem();

        try {
            throwsShoppingSystem.purchaseItem("mixer", 14);
        }catch (InsufficientStockExceptionCh e) {
            System.out.println(e.getMessage());
        }catch (ItemNotFoundExceptionCh e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            throwsShoppingSystem.purchaseItem("washingMachine", 20);
        }catch (InsufficientStockExceptionCh e) {
            System.out.println(e.getMessage());
        }catch (ItemNotFoundExceptionCh e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            throwsShoppingSystem.purchaseItem("Coffee maker", 1);
        }catch (InsufficientStockExceptionCh e) {
            System.out.println(e.getMessage());
        }catch (ItemNotFoundExceptionCh e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
