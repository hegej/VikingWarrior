package com.vikingwarrior.weapons;

import com.vikingwarrior.interfaces.IWeapon;

public class Crossbow implements IWeapon
{
    private final String name = "Crossbow";
    private final int damage = 10;

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
