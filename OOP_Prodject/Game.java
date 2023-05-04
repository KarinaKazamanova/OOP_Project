package OOP_Prodject;

public class Game {
    public static void main(String[] args) {

        Elf grog = new Elf("Grog");
        Elf mounk = new Elf("Mounk");
        Elf trial = new Elf("Trial");

        Tank t = new Tank("Tank");
        t.modify(mounk);
        Killer k = new Killer("Killer");
        Healer h = new Healer(trial, "Healer");

        System.out.println("Elf-Tank\n" + mounk.toString());
        k.modify(grog);
        h.modify(trial);

        grog.doubleattack(mounk);

        System.out.println(mounk.getHealthPoints());

    }

}
