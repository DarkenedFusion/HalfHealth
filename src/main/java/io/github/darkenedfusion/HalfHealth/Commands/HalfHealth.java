package io.github.darkenedfusion.HalfHealth.Commands;

import org.bukkit.ChatColor;
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

        player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(5);

        return true;
    }



    private void playHealthTitle(Player player) {
        String title = ChatColor.DARK_RED + "Max heal is now 5!";
        String subTitle = null;
        int duration = 50;
        int fadeIn = 10;
        int fadeOut = 5;
        player.sendTitle(title, null, duration, fadeIn, fadeOut);
    }
}




