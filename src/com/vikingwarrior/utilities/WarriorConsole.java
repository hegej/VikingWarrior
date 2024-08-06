package com.vikingwarrior.utilities;

import com.vikingwarrior.models.Warrior;

public class WarriorConsole
{
    public static void initialize()
    {
        System.out.println("The Viking Warrior\n");
        System.out.println("=======================");
    }

    public static void displayWarriorStat(Warrior warrior)
    {
        System.out.println("Viking Warrior: " + warrior.getName());
        System.out.println("Weapon: " + warrior.getWeapon().getName());
    }

    public static void displayAction(Warrior warrior, String action)
    {
        System.out.println(warrior.getName() + " " + action);
    }

    public static boolean confirmAction(String question)
    {
        System.out.print(question + " (y/n): ");
        return System.console().readLine().trim().toLowerCase().startsWith("y");
    }

    public static void endGame()
    {
        System.out.println("The Battle has ended!");
        System.out.println("The Viking Warrior has emerged victorious!");
    }
}
