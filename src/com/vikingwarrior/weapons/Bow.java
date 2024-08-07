package com.vikingwarrior.weapons;

import com.vikingwarrior.interfaces.IWeapon;

public class Bow implements IWeapon
{
    private final String name = "Bow";
    private final int damage = 8;

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void attack()
    {
        System.out.println("Fires an arrow with the " + name + " and deals " + damage + " damage");
    }
}
