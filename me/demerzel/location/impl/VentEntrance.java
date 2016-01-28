package me.demerzel.location.impl;

import me.demerzel.location.Location;
import me.demerzel.util.Player;


public class VentEntrance extends Location {
    public VentEntrance(){
        super("Vent Opening", "You crawl into the vents. The air is hard to breathe in here. You feel a pain in your chest. There are two ways you can go: <West> and <East>");
    }

    @Override
    public void run(Player player) {

    }
}
