package OOP_Prodject;

import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {

        Elf grog = new Elf("Grog");
        Elf mounk = new Elf("Mounk");
        Elf trial = new Elf("Trial");

        Tank t = new Tank("Tank");
        t.modify(mounk);
        Killer k = new Killer("Killer");
        Healer Healer = new Healer(trial, "Healer");

        System.out.println("Elf-Healer\n" + trial.toString());
        k.modify(grog);
        Healer.modify(trial);

        System.out.println(trial.getMana());

        Skill s_1 = new Elfskill();
        Skill s_2 = new Heallerskill();
        ArrayList<Skill> trial_skills = new ArrayList<Skill>();

        mounk.attack(mounk, grog);
        trial_skills.add(s_1);
        trial_skills.add(s_2);

        for (Skill s : trial_skills) {
            System.out.println("Мана trial: " + trial.getMana() + " Атака trial: " + trial.getAttack());
            s.skill(trial, grog);
            System.out.println("Здоровье grog: " + grog.getHealthPoints());

        }

    }

}
