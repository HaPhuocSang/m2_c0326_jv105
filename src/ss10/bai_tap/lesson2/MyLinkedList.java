package ss10.bai_tap.lesson2;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        numNodes++;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(element);
        newNode.next = temp.next;
        temp.next = newNode;
        numNodes++;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    @SuppressWarnings("unchecked")
    public E getFirst() {
        if (head == null) {
            return null;
        }
        return (E) head.data;
    }

    @SuppressWarnings("unchecked")
    public E getLast() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node removed;
        if (index == 0) {
            removed = head;
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            removed = temp.next;

            temp.next = removed.next;
        }
        numNodes--;
        return (E) removed.data;
    }

    public boolean remove(Object e) {
        int index = indexOf((E) e);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            clone.addLast((E) temp.data);
            temp = temp.next;
        }
        return clone;
    }
}
