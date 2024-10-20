package ua.javarush.task.pro.task13.task1314;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;
    }

    public String get(int index) {
        Node result = first;
        //напишіть тут ваш код
        for(int i = 0; i <= index; i++) {
            result = result.next;
            if (result == null) {
                return null;
            }
        }
        return result.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
