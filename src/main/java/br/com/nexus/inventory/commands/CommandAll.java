package br.com.nexus.inventory.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandAll implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String lb, String[] args) {

        if(s instanceof Player) {
            Player p = (Player) s;
            switch (cmd.getName()) {
                case "arena":
                    p.chat("/system:warp arena");
                    break;
                case "loja":
                    p.chat("/system:warp loja");
                    break;
                case "celeiro":
                    p.chat("/system:warp celeiro");
                    break;
                case "pesqueiro":
                    p.chat("/system:warp pesqueiro");
                    break;
                case "hall":
                    p.chat("/system:warp hall");
                    break;
            }

        } else s.sendMessage("§cApenas jogadores podem executar esse comando.");

        return false;
    }
}
