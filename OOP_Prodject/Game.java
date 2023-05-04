package OOP_Prodject;

public class Game {
    public static void main(String[] args) {

        Elf grog = new Elf("Grog");
        Elf mounk = new Elf("Mounk");

        Tank t = new Tank("Tank");
        t.modify(mounk);
        Killer k = new Killer("Killer");

        System.out.println("Elf-Tank\n" + mounk.toString());
        k.modify(grog);
        System.out.println("Elf-Killer\n" + grog.toString());

        Party<Character> party = new Party<>();
        party.addCharacter(grog);
        party.addCharacter(mounk);
        System.out.println(party.size());
        for (Character c : party) {
            System.out.println(c.getSpeed());

        }
        party.sort();
        for (Character c : party) {
            System.out.println(c.getSpeed());

        }

    }

}
