package HomePracticals.Lsn_26;

public class ProductDiscount {
    private String name;
    private Category category;
    private int price;

    public ProductDiscount(String name, Category category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public Category getCategory() {
        return category;
    }


    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return  "name:'" + name + '\n' +
                "category:'" + category + '\n' +
                "price:" + price;
    }
}
