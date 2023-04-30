package OOP_Prodject;

public class Character implements Attackable, Healable, Speakable {
    protected String name;
    protected Integer health_points;
    protected Integer experience_points;
    protected Integer level;
    protected Integer attack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealthPoints() {
        return health_points;
    }

    public void setHealPoints(Integer health_points) {
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

    public Character(String name, Integer health_points, Integer exp, Integer level, Integer attack) {
        this.name = name;
        this.health_points = health_points;
        this.experience_points = exp;
        this.level = level;
        this.attack = attack;

    }

    public Character(String name) {
        this(name, 0, 0, 0, 0);
    }

    @Override
    public String toString() {
        return String.format("Имя: %s\nУровень: %d\nОпыт: %d\nЗдоровье: %d\nНаносимый урон: %d\n",
                name, level, experience_points, health_points, attack);
    }

    @Override
    public void attack(Character a_c, Character d_c) {
        Integer damage = a_c.getAttack();
        if (a_c.getAttack() < d_c.getHealthPoints()) {
            d_c.setHealPoints(d_c.getHealthPoints() - damage);
        } else {
            d_c.setHealPoints(0);
        }

    }

    @Override
    public void heal(Character h_c, Integer healling_points) {
        {
            h_c.setHealPoints(h_c.getHealthPoints() + healling_points);
        }
    }

    @Override
    public void speak() {
        // Надо прописать, что он говорит ,но можно оставить и пустым, а для
        // конкретного класса персов прописать свое
        throw new UnsupportedOperationException("Unimplemented method 'speak'");
    }

}