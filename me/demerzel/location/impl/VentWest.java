package me.demerzel.location.impl;

import me.demerzel.entity.EntityPlayer;
import me.demerzel.location.Location;


public class VentWest extends Location {
    public VentWest(){
        super("West vent", "It is becoming impossible to breathe! The air is poisoned!");
    }

    @Override
    public void run(EntityPlayer player) {
        player.modHealth(-5);
    }
}
