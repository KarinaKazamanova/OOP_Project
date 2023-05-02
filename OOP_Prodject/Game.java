package OOP_Prodject;

public class Game {
    public static void main(String[] args) {

        Elf grog = new Elf("Grog");
        Elf mounk = new Elf("Mounk");

        Tank t = new Tank();
        t.modify(mounk);
        Killer k = new Killer();

        System.out.println("Elf-Tank\n" + mounk.toString());
        k.modify(grog);
        System.out.println("Elf-Killer\n" + grog.toString());

        Party<Character> party = new Party<>();
        party.addCharacter(mounk);
        party.addCharacter(grog);
        System.out.println(party.size());
        for (Character c : party) {
            c.speak();

        }

    }

}
