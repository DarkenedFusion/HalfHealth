package io.github.darkenedfusion.HalfHealth.Commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class HalfHealth implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.getAttribute(Attribute.GENERIC_MAX_HEALTH);

        return true;
    }



    private void setMaxHealth(Player player){
        int MaxHealth = 5;



    }

}




