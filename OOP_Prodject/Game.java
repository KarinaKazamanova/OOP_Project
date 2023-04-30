package OOP_Prodject;

public class Game {
    public static void main(String[] args) {

        Dwarf grog = new Dwarf("Grog");
        Elf mounk = new Elf("Mounk");
        mounk.attack(mounk, grog);
        grog.attack(grog, mounk);
        System.out.println("Grog: " + grog.getHealthPoints());
        System.out.println("Mounk: " + mounk.getHealthPoints());
        mounk.attack(mounk, grog);
        grog.attack(grog, mounk);
        System.out.println("Grog: " + grog.getHealthPoints());
        System.out.println("Mounk: " + mounk.getHealthPoints());
    }

}
