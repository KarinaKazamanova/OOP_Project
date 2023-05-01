package OOP_Prodject;

public class Character implements Attackable, Healable, Speakable {
    protected String name;
    protected Integer health_points;
    protected Integer experience_points;
    protected Integer level;
    protected Integer attack;
    protected Integer max_health_points;
    protected Integer speed;
    protected Integer mana;
    protected Integer max_mana;
    protected Integer resistance;
    protected Integer max_resistance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealthPoints() {
        return health_points;
    }

    public void setHealthPoints(Integer health_points) {
        this.health_points = health_points;

    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getMaxHealthPoints() {
        return max_health_points;
    }

    public void setMaxHealthPoints(Integer max_hp) {
        this.max_health_points = max_hp;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getMaxMana() {
        return max_mana;
    }

    public void setMaxMana(Integer max_mana) {
        this.max_mana = max_mana;
    }

    public Integer getResist() {
        return resistance;
    }

    public void setResist(Integer resistance) {
        this.resistance = resistance;
    }

    public Integer getMaxResist() {
        return max_resistance;
    }

    public void setMaxResist(Integer max_resistance) {
        this.max_resistance = max_resistance;
    }

    public Character(String name, Integer health_points, Integer exp, Integer level, Integer attack,
            Integer max_health_points, Integer speed, Integer mana, Integer max_mana, Integer resistance,
            Integer max_resistance) {
        this.name = name;
        this.health_points = health_points;
        this.experience_points = exp;
        this.level = level;
        this.attack = attack;
        this.max_health_points = max_health_points;
        this.speed = speed;
        this.mana = mana;
        this.max_mana = max_mana;
        this.resistance = resistance;
        this.max_resistance = max_resistance;

    }

    public Character(String name) {
        this(name, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    @Override
    public String toString() {
        return String.format(
                "Имя: %s\nУровень: %d\nОпыт: %d\nНаносимый урон: %d\nЗдоровье: %d\nМана: %d\nСкорость: %d\n",
                name, level, experience_points, attack, health_points, mana, speed);
    }

    @Override
    public void attack(Character a_c, Character d_c) {
        Integer damage = a_c.getAttack();
        if (d_c.getResist() > 0) {
            if (d_c.getResist() > a_c.getAttack()) {
                d_c.setResist(d_c.getResist() - damage);
            } else {
                d_c.setHealthPoints(d_c.getResist() + d_c.getResist() - damage);
                d_c.setResist(0);
            }
            if (a_c.getAttack() < d_c.getHealthPoints()) {
                d_c.setHealthPoints(d_c.getHealthPoints() - damage);
            } else {
                d_c.setHealthPoints(0);
            }

        }
    }

    @Override
    public void heal(Character h_c, Integer healling_points) {
        {
            h_c.setHealthPoints(h_c.getHealthPoints() + healling_points);
        }
    }

    @Override
    public void resistRecover(Character h_c) {
        h_c.setResist(h_c.getMaxResist());
    }

    @Override
    public void speak() {
        // Надо прописать, что он говорит ,но можно оставить и пустым, а для
        // конкретного класса персов прописать свое
        throw new UnsupportedOperationException("Unimplemented method 'speak'");
    }

}