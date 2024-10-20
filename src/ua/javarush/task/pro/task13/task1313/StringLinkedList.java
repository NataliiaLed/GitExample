package ua.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишіть тут ваш код
        Node first = (last.prev == null) ?this.first: last.prev;
        Node n = new Node();
        n.value = value;
        n.prev = first;
        n.next = last;
        first.next = n;
        last.prev = n;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
