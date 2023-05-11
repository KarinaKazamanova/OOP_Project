
import OOP_Kazamanova.OOP_Prodject.Character;

public class Heallerskill extends Skill {

    @Override
    public void skill(Character a, Character c) {
        Integer regeneration = a.getMana() + a.getAttack();
        Integer total_health = c.getHealthPoints() + regeneration;
        if (total_health >= c.getMaxHealthPoints()) {
            c.setHealthPoints(c.getMaxHealthPoints());
        } else {
            c.setHealthPoints(total_health);
        }

    }

    @Override
    public String toString() {
        return String.format(
                "Навык 'лечение' позволяет восстанавливать себе или союзнику жизни в размере атака + текущая мана");
    }
}
