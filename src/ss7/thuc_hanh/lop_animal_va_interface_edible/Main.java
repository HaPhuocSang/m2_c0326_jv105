package ss7.thuc_hanh.lop_animal_va_interface_edible;

import ss7.thuc_hanh.lop_animal_va_interface_edible.fruit.Apple;
import ss7.thuc_hanh.lop_animal_va_interface_edible.fruit.Fruit;
import ss7.thuc_hanh.lop_animal_va_interface_edible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
