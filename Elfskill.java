
import OOP_Kazamanova.OOP_Prodject.Character;

public class Elfskill extends Skill {

    public void skill(Character a_c, Character d_c) {
        a_c.attack(a_c, d_c);
        a_c.attack(a_c, d_c);
        a_c.setMana(a_c.getMana() - 3);
    }
}
