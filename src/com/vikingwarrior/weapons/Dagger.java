package com.vikingwarrior.weapons;

import com.vikingwarrior.interfaces.IWeapon;

public class Dagger implements IWeapon
{
    private final String name = "Dagger";
    private final int damage = 7;

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void attack()
    {
        System.out.println("Fires off the " + name + " and deals " + damage + " damage");
    }
}
