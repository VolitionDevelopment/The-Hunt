package me.demerzel.command.impl;

import me.demerzel.command.Command;
import me.demerzel.entity.EntityPlayer;
import me.demerzel.util.Game;


public class Wallet extends Command {
    public Wallet(String[] aliases, String description) {
        super(aliases, description);
    }

    @Override
    public boolean execute(String[] args) {
        EntityPlayer player = Game.getPlayer();
        System.out.println("You currently have " + player.getMoney() + " gold.");
        return false;
    }
}
