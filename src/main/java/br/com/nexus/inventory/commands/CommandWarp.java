package br.com.nexus.inventory.commands;

import br.com.nexus.inventory.inventory.warp.InventoryWarp;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandWarp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            new InventoryWarp().openInventoryWarp(p);
        } else commandSender.sendMessage("§cApenas jogadores podem executar esse comando.");

        return false;
    }
}
