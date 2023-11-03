package moi.jowlin.commands;

import moi.jowlin.Modo_Infectado;
import moi.jowlin.utils.MessageUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if (!(sender instanceof Player)) {
            //console
            help(sender);
            return true;
        }

        //jugador
        Player player = (Player) sender;

        // modoinfectado  arg(0) arg(1) arg(2) arg(3)
        if (args.length >= 1) {
            if (args[0].equalsIgnoreCase("vidas")) {
                // /moi vidas
                sender.sendMessage(MessageUtils.getColorMessage(Modo_Infectado.prefix+"&fTienes &a%servervariables_value_vidas% Vidas &fdisponibles."));
            } else if (args[0].equalsIgnoreCase("iniciar")) {
                // /moi iniciar
                if(!sender.hasPermission("moi.commands.iniciar"));
                sender.sendMessage(MessageUtils.getColorMessage(Modo_Infectado.prefix+"&cNo tienes permisos para usar ese comando"));
            } else if (args[0].equalsIgnoreCase("tiempo")) {

            } else {
                help(sender);
            }

        } else {
            // /moi
            help(sender);
        }

        return true;
    }


    // /moi help

    public void  help(CommandSender sender){
        sender.sendMessage(MessageUtils.getColorMessage("&f&l-----------&4&lMODO INFECTADO &8v1.0&f&l-----------"));
        sender.sendMessage(MessageUtils.getColorMessage("&e/moi iniciar &7Inicia el modo infectado"));
        sender.sendMessage(MessageUtils.getColorMessage("&e/moi tiempo &7Muestra el tiempo de cada ronda"));
        sender.sendMessage(MessageUtils.getColorMessage("&e/moi vidas &7Muestra las vidas del jugador"));
        sender.sendMessage(MessageUtils.getColorMessage("&f&l-----------&4&lMODO INFECTADO &8v1.0&f&l-----------"));

    }
}
