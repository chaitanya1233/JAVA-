package CollectionAPI;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(23);
        ar.add(34);
        ar.add(34.5);
        ar.add(-32);
        ar.add("Chaitanya");
        ar.add("Om Dangare");

        // Opreations on ArrayList1
        System.out.println("Following is the arrayList...");
        System.out.println(ar);
        System.out.println("---------------------------------------------------");
        // Index based insertion in arrayList
        ar.add(2, "Manoj");
        ar.addFirst("Starting");
        ar.addLast("Ending");
        System.out.println(ar.indexOf("Manoj"));
        System.out.println(ar);
        System.out.println(ar.isEmpty());
        System.out.println(ar.remove("Ending"));
        System.out.println(ar.remove(5));
        System.out.println(ar.getFirst());
        System.out.println(ar.getLast());
        System.out.println(ar.size());
        System.out.println(ar.subList(2, 4));

        // New Arraylist
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Java");
        arr2.add("Python");
        arr2.add("C++");
        arr2.add("C programming");
        arr2.add("Cotlin");
        System.out.println(arr2);

    }
}
