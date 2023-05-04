package OOP_Prodject;

public class Healer extends Profession implements Heallerskillable {
    protected Integer heal;

    public Healer(Character c, String prof) {
        super(prof, 10, 5, 5, 30, 1);
        Integer heal = c.getAttack() + c.getMana();
        this.heal = heal;

    }

    public void setHeal(Integer heal) {
        this.heal = heal;
    }

    public Integer getHeal() {
        return heal;
    }

    public void regenerationModifier(Character c) {
        c.setRegeneration(c.getRegeneration() + heal);
    }

    @Override
    public void modify(Character c) {
        this.professionModifier(c);
        this.healthModifier(c);
        this.maxHealthModifier(c);
        this.attackModifier(c);
        this.speedModifier(c);
        this.manaModifier(c);
        this.maxManaModifier(c);
        this.resistanceModifier(c);
        this.regenerationModifier(c);

    }

    @Override
    public void regenerate(Character c) {
        Integer total_health = c.getHealthPoints() + heal;
        if (total_health >= c.getMaxHealthPoints()) {
            c.setHealthPoints(c.getMaxHealthPoints());
        } else {
            c.setHealthPoints(c.getHealthPoints() + heal);
        }

    }

}
