package OOP_Prodject;

public class Profession {
    protected Integer health_modifier;
    protected Integer attack_modifier;
    protected Integer speed_modifier;
    protected Integer mana_modifier;
    protected Integer resist_modifier;

    public Integer getHealthModifier() {
        return health_modifier;
    }

    public void setHealthModifier(Integer h_m) {
        this.health_modifier = h_m;
    }

    public Integer getAttackModifier() {
        return attack_modifier;
    }

    public Profession(Integer h_m, Integer a_m, Integer s_m, Integer m_m, Integer r_m) {
        this.health_modifier = h_m;
        this.attack_modifier = a_m;
        this.speed_modifier = s_m;
        this.mana_modifier = m_m;
        this.resist_modifier = r_m;
    }

    public void healthModifier(Character c) {
        c.setHealthPoints(c.getHealthPoints() + this.helth_modifier);
    }

    public void maxHealthModifier(Character c) {
        c.setMaxHealthPoints(c.getMaxHealthPoints() + this.helth_modifier);
    }

    public void attackModifier(Character c) {
        c.setAttack(c.getAttack() + this.helth_modifier);
    }

    public void speedModifier(Character c) {
        c.setSpeed(c.getSpeed() + this.helth_modifier);
    }

    public void manaModifier(Character c) {
        c.setMana(c.getMana() + this.helth_modifier);
    }

    public void maxManaModifier(Character c) {
        c.setMaxMana(c.getMaxMana() + this.helth_modifier);
    }

    public void resistanceModifier(Character c) {
        c.setResist(c.getResist() + this.helth_modifier);
    }

    public void maxResistanceModifier(Character c) {
        c.setMaxResist(c.getMaxResist() + this.helth_modifier);
    }

}
