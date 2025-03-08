package CollectionAPI;

import java.util.LinkedList;

public class Linkedll {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add("Divya");
        System.out.println("Orignal LinkedList");
        System.out.println(l);
        System.out.println("------------------------------");
        System.out.println("Add first...");
        l.addFirst("Chaitanya");
        System.out.println((l));
        l.add(6, "Inert");
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.isEmpty());
        System.out.println(l.isEmpty());
        System.out.println(l.peek());
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());
        System.out.println("----------------------------");
        System.out.println(l.remove("Chaitanya"));
        System.out.println(l.lastIndexOf(l));
    }
}
