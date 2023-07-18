package HomePracticals.Lsn_23;

import java.util.*;

public class Shopping<T> {
    private Set<T> setShoppingCart;
    private List<T> listShoppingCart;
    private Queue<T> queueShoppingCart;

    public Shopping() {
        this.setShoppingCart = new HashSet<>();
        this.listShoppingCart = new ArrayList<>();
        this.queueShoppingCart = new PriorityQueue<>();
    }

    public void add(T anything) {
        setShoppingCart.add(anything);
        listShoppingCart.add(anything);
        queueShoppingCart.add(anything);
    }

    public void remove(T item){
        setShoppingCart.remove(item);
        listShoppingCart.remove(item);
        queueShoppingCart.remove(item);
    }

    public void clearOff() {
        listShoppingCart.clear();
        queueShoppingCart.clear();
        setShoppingCart.clear();
    }

    public void printShoppingItems() {
        System.out.println("HashSet: " + setShoppingCart);
        System.out.println("ArrayList: " + listShoppingCart);
        System.out.println("PriorityQueue: " + queueShoppingCart);
    }

}


