package ss10.bai_tap.lesson2;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);
        System.out.println("Danh sách:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.remove(2);
        System.out.println("Sau khi remove:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Contains 30: " + list.contains(30));
        System.out.println("Index of 40: " + list.indexOf(40));
    }
}
