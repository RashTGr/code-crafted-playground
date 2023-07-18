package HomePracticals.Lsn_23;

import java.util.ArrayList;

class GenericList<T> {
    private ArrayList<T> items;

    // constructor serves to initialize the object
    public GenericList() {
        this.items = new ArrayList<>();
    }

    public void add(T any) {
        items.add(any);
    }

    public int size() {
        return items.size();
    }

    // E allows this method to have its own type parameter
    // This is parameterized method example
    public <E> void getAll() {
        for (int i = 0; i < size(); i++) {
            E elements = (E) items.get(i);
            System.out.println(elements);
        }
    }

    public T get(int index) {
        return items.get(index);
    }


}
