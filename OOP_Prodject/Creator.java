package OOP_Prodject;

import java.util.ArrayList;

public class Creator {
    public Character create(ArrayList<String> data) throws Exception {
        if (dataCheck(data)) {
            throw new LackOfDataException();
        } else if (data.size() > 8) {
            throw new ExcessOfDataException();

        } else {
            Character c = createCharacter(data.get(0), data.get(2));
            c.setHealthPoints(c.getHealthPoints() + Integer.parseInt(data.get(3)));
            c.setAttack(c.getAttack() + Integer.parseInt(data.get(4)));
            c.setSpeed(c.getSpeed() + Integer.parseInt(data.get(5)));
            c.setResist(c.getResist() + Integer.parseInt(data.get(6)));
            c.setMana(c.getMana() + Integer.parseInt(data.get(7)));
            profModify(data.get(1), c);
            return c;

        }

    }

    private Character createCharacter(String race, String name) {
        Character c = null;
        switch (race) {
            case "Elf":
                c = new Elf(name);
            case "Dwarf":
                c = new Dwarf(name);
            case "Human":
                c = new Human(name);
            case "Goblin":
                c = new Goblin(name);

        }
        return c;
    }

    private Boolean dataCheck(ArrayList<String> data) {
        Boolean flag = false;
        for (String d : data) {
            if (d.equals("")) {
                flag = true;
            }
        }

        return flag;
    }

    private void profModify(String prof, Character c) {
        switch (prof) {
            case "Warrior":
                Warrior warrior = new Warrior(prof);
                warrior.modify(c);
            case "Killer":
                Killer killer = new Killer(prof);
                killer.modify(c);
            case "Tank":
                Tank tank = new Tank(prof);
                tank.modify(c);
            case "Magician":
                Magician mag = new Magician(prof);
                mag.modify(c);
            case "Healer":
                Healer healer = new Healer(prof);
                healer.modify(c);
            case "Barbarian":
                Barbarian barbarian = new Barbarian(prof);
                barbarian.modify(c);
        }
    }
}
