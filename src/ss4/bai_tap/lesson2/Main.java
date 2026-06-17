package ss4.bai_tap.lesson2;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(false);
        fan2.setSpeed(Fan.MEDIUM);
        System.out.println("Fan 1:");
        System.out.println(fan1);
        System.out.println();
        System.out.println("Fan 2:");
        System.out.println(fan2);
    }
}
