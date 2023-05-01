package OOP_Prodject;

public class Game {
    public static void main(String[] args) {

        Dwarf grog = new Dwarf("Grog");
        Elf mounk = new Elf("Mounk");
        mounk.attack(mounk, grog);
        grog.attack(grog, mounk);
        mounk.speak();
        grog.toString();
        Tank t = new Tank();
        t.modify(mounk);
        Killer k = new Killer();

        System.out.println("Elf-Tank\n" + mounk.toString());
        k.modify(mounk);
        System.out.println("Elf-Killer\n" + mounk.toString());

    }

}
