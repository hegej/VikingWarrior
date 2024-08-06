package com.vikingwarrior.models;

import com.vikingwarrior.interfaces.IWeapon;

public class Warrior
{
    private String name;
    private IWeapon weapon;

    public Warrior(String name, IWeapon weapon)
    {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName()
    {
        return name;
    }

    public IWeapon getWeapon()
    {
        return weapon;
    }

    public void attack()
    {
        System.out.println("Warrior " + name + " attacks with " + weapon.getName());
        weapon.attack();
    }

    public void changeWeapon(IWeapon newWeapon)
    {
        System.out.println("\nWarrior " + name + " changes weapon to " + newWeapon.getName());
        this.weapon = newWeapon;
    }
}
