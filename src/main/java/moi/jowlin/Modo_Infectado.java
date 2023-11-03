package moi.jowlin;

import moi.jowlin.commands.MainCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Modo_Infectado extends JavaPlugin {

    public static String prefix = "&4&lMODO INFECTADO &8>> ";
    private final String version = getDescription().getVersion();
    public void onEnable() {
        registerCommands();

        Bukkit.getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', prefix+"&bHa sido activado &fVersion: "+version));
        Bukkit.getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', prefix+"&f¡Es hora de divertirse!"));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', prefix+"&eHa sido desactivado &fVersion: "+version));
        Bukkit.getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&', prefix+"&fGracias por usar :)"));
    }

    public void registerCommands(){
        this.getCommand("modoinfectado").setExecutor(new MainCommand());
    }
}
