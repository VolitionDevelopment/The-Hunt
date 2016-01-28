package me.demerzel.location.impl;

import me.demerzel.entity.EntityPlayer;
import me.demerzel.location.Location;


public class VentEast extends Location {
    public VentEast(){
        super("East Vent", "The air clears up. You can breathe easily now.");
        addState(1, "East Vent Examine Text");
    }

    @Override
    public void run(EntityPlayer player) {

    }
}
