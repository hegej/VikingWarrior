package com.vikingwarrior.weapons;

import com.vikingwarrior.interfaces.IWeapon;

public class Axe implements IWeapon
{
    private final String name = "Axe";
    private final int damage = 14;

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void attack()
    {
        System.out.println("Swings the " + name + " and deals " + damage + " damage");
    }
}
