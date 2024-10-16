import com.vikingwarrior.models.Warrior;
import com.vikingwarrior.interfaces.IWeapon;
import com.vikingwarrior.weapons.*;
import com.vikingwarrior.utilities.WarriorConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        List<IWeapon> weapons = new ArrayList<>();
        weapons.add(new Crossbow());
        weapons.add(new Axe());
        weapons.add(new Bow());
        weapons.add(new Club());
        weapons.add(new Dagger());

        Random random = new Random();
        IWeapon randomWeapon = weapons.get(random.nextInt(weapons.size()));
        Warrior warrior = new Warrior("Uhtred Ragnarsson", randomWeapon);

        WarriorConsole.initialize();
        WarriorConsole.displayWarriorStat(warrior);
        WarriorConsole.displayAction(warrior, "enters the battle, ready to attack!");
        warrior.attack();

        while (true)
        {
            if (!WarriorConsole.confirmAction("Do you want to change weapon?")) {
                break;
            }
            IWeapon newWeapon;
            do {
                newWeapon = weapons.get(random.nextInt(weapons.size()));
            } while (newWeapon.getClass() == warrior.getWeapon().getClass());

            warrior.changeWeapon(newWeapon);
            WarriorConsole.displayWarriorStat(warrior);
            WarriorConsole.displayAction(warrior, "prepares an attack with the new weapon!");
            warrior.attack();
        }

        WarriorConsole.endGame();
    }
}