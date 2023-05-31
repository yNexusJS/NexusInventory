package br.com.nexus.inventory.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandInformacoes implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {
            Player p = (Player) commandSender;
            if ("discord".equalsIgnoreCase(command.getName())) {
                p.sendMessage(new String[]{"§5§lRedeCrystal §f§l- §ainformações", "",
                        "§e§lDiscord: §bhttps://discord.gg/kWHgxCvUTN", ""});
            }
            if("youtube".equalsIgnoreCase(command.getName()) || "yt".equalsIgnoreCase(command.getName())) {
                p.sendMessage(new String[]{"§5§lRedeCrystal §f§l- §aTAG§4 [YT]", "",
                        "§a✔ Visualizações:§7 150", "§a✔ Inscritos:§7 400", "§a✔ Likes:§7 20", ""});
            }
            return true;
        } else commandSender.sendMessage("§cApenas jogadores podem executar esse comando.");

        return false;

    }
}
