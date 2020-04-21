package io.github.darkenedfusion.HalfHealth;

import io.github.darkenedfusion.HalfHealth.Commands.HalfHealth;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){

        this.getCommand("halfhealth").setExecutor((CommandExecutor) new HalfHealth());

    }
    @Override
    public void onDisable(){

    }


}
