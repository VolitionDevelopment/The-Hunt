package me.demerzel.command.impl;

import me.demerzel.command.Command;
import me.demerzel.command.CommandManager;
import me.demerzel.entity.EntityPlayer;
import me.demerzel.util.GameManager;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Demerzel on 2/1/16.
 */
public class Help extends Command {
    public Help(String... aliases){
        super(aliases);
    }

    @Override
    public boolean execute(String[] args, EntityPlayer player) {
        CommandManager manager = new CommandManager();
        ArrayList<String> used = new ArrayList<>();
        for(Command command : manager.getCommands()){

            if(used.contains(command.getName())){
                continue;
            }

            used.add(command.getName());
            System.out.println(StringUtils.capitalize(command.getName()) + " | " + command.getDescription());
        }

        return false;
    }
}
