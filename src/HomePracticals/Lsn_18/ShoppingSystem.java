package HomePracticals.Lsn_18;

import HomePracticals.Lsn_18.Exceptions.InsufficientStockException;
import HomePracticals.Lsn_18.Exceptions.ItemNotFoundException;

public class ShoppingSystem {

    private String[] availableProducts = null;
    private int[] productStock;

    // Initializing array within the constructor ensures it is initialized just ONCE when the object is created
    public ShoppingSystem() {
        availableProducts = new String[]
                {"Refrigerator", "Microwave", "Toaster", "Blender", "Mixer", "Dishwasher", "WashingMachine"};
        productStock = new int[]{3, 4, 5, 10, 15, 16, 17};
    }


    // Item purchase method
    public void purchaseItem(String item, int quantityRequest) {
        // Checking if any of the array data.txt is empty - null
        if (availableProducts == null || productStock == null){
            throw new NullPointerException("Data is missing for the products.");
        }
        // Additional check point for 0 and negative quantity
        if (quantityRequest <= 0){
            throw new IllegalArgumentException("Invalid quantity: " + quantityRequest +"\nYou cannot request 0 or negative quantity.");
        }

        if (isProductAvailable(item)){
            System.out.print("\n\"" + item + "\" is found in the stock list, ");
            if (isSufficientStock(item, quantityRequest)){
                System.out.println("and the requested quantity is available in the stock.\nYour request is proceeded. Thank you for your purchase.\n");
            }else {
                throw new InsufficientStockException("Unfortunately, the requested quantity (" + quantityRequest + ") is not available in the stock for \"" + item + "\".\n");
            }
        }else {
            throw new ItemNotFoundException("Unfortunately, \"" + item + "\" not found in our stock list.\n");
        }
    }

    // Identify product index in the array of available products
    public int findProductIndex(String item){
        for (int i = 0; i < availableProducts.length; i++) {
            if (availableProducts[i].equalsIgnoreCase(item)){
                // If product is found
                return i;
            }
        }
        return -1; // If product is not found
    }

    // Stock versus Requested quantity
    public boolean isSufficientStock(String item, int qtyRequest){
        if (qtyRequest <= productStock[findProductIndex(item)]){
            return true;
        }
        System.out.println("and stock for \"" + item + "\" is " + productStock[findProductIndex(item)] + ".");
        return false;
    }

    // Product availability check
    public boolean isProductAvailable(String item) {
        if (-1 != findProductIndex(item)) {
            return true;
        }
        return false;
    }
}
