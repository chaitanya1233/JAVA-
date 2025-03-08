package CollectionAPI;

import java.util.ArrayDeque;

public class ArrayDequeues {
    public static void main(String[] args) {
        ArrayDeque adq = new ArrayDeque();
        adq.add(10);
        adq.add(20);
        adq.add(30);
        System.out.println(adq);
        System.out.println("-------------------------");
        adq.add("Chaitanya");
        adq.add("kale");
        adq.add("Jagannath");
        System.out.println(adq);
        System.out.println("------------------------------");
        adq.addFirst("First");
        adq.addLast("Last");
        System.out.println(adq);

        // Offer -> Not mandetory to save the changes in the arrayDequeue object
        adq.offer(3);
        adq.offerFirst("VeryFirstoffer");
        adq.offer("VeryLastOffer");
        System.out.println(adq);
        System.out.println("------------------------------");

        // get() -> To get the perticular object from the ArrayDeque object...
        Object x = adq.getFirst();
        Object y = adq.getLast();
        System.out.println(x);
        System.out.println(y);
    }
}
