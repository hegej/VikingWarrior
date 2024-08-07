package com.vikingwarrior.weapons;

import com.vikingwarrior.interfaces.IWeapon;

public class Club implements IWeapon
{
    private final String name = "Club";
    private final int damage = 8;

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void attack()
    {
        System.out.println("Hits with the " + name + " and deals " + damage + " damage");
    }
}
