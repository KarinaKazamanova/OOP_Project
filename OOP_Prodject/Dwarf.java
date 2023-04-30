package OOP_Prodject;

import java.util.Random;

public class Dwarf extends Character {

    public Dwarf(String name) {
        // Необходимо установить стартовые характеристики
        super(name, 10, 0, 1, 5);

    }

    @Override
    public void speak() {
        Random r = new Random();
        int phrase_number = r.nextInt(0, 5);

        switch (phrase_number) {
            case 0:
                System.out.println(String.format("У вас, эльфов, нет чести, нет уважения, нет пива!"));
                break;
            case 1:
                System.out.println(String.format("Когда я быть маленький мальчишка и жить в Гимпельштультсхеме..."));
                break;
            case 2:
                System.out.println(String.format("Как говорил мой дед: 'Я не твой дед!!!'"));
                break;
            case 3:
                System.out.println(String.format("Нам - гномам - нечего обсуждать с эльфами"));
                break;
            case 4:
                System.out.println(String.format("Мы гномы, наше дело маленькое - пить пиво и ненавидеть эльфов"));
                break;
        }

    }

    @Override

    public String toString() {
        return String.format("Имя: %s\nУровень: %d\nОпыт: %d\nЗдоровье: %d\nНаносимый урон: %d\n",
                name, level, experience_points, health_points, attack);
    }
}
