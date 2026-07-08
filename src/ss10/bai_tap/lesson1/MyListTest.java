package ss10.bai_tap.lesson1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);
        System.out.println("Danh sách:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Remove: " + list.remove(2));
        System.out.println("Sau khi remove:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Index of 15: " + list.indexOf(15));
        System.out.println("Size: " + list.size());

        MyList<Integer> clone = list.clone();
        System.out.println("Clone:");
        for (int i = 0; i < clone.size(); i++) {
            System.out.print(clone.get(i) + " ");
        }
        System.out.println();
        list.clear();
        System.out.println("Size sau clear: " + list.size());
    }
}
