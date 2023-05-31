package br.com.nexus.inventory;

import br.com.nexus.inventory.commands.CommandAll;
import br.com.nexus.inventory.commands.CommandInformacoes;
import br.com.nexus.inventory.commands.CommandKit;
import br.com.nexus.inventory.commands.CommandWarp;
import br.com.nexus.inventory.inventory.kit.InventoryMainKit;
import br.com.nexus.inventory.inventory.kit.subkit.InventoryEspeciaisItens;
import br.com.nexus.inventory.inventory.kit.subkit.InventoryRankKit;
import br.com.nexus.inventory.inventory.kit.subkit.InventoryVipKit;
import br.com.nexus.inventory.inventory.warp.InventoryWarp;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage("§6[NexusInventory] §7load inventorys...");
        getCommand("warp").setExecutor(new CommandWarp());
        getCommand("celeiro").setExecutor(new CommandAll());
        getCommand("hall").setExecutor(new CommandAll());
        getCommand("pesqueiro").setExecutor(new CommandAll());
        getCommand("arena").setExecutor(new CommandAll());
        getCommand("loja").setExecutor(new CommandAll());
        Bukkit.getPluginManager().registerEvents(new InventoryWarp(), this);
        Bukkit.getConsoleSender().sendMessage("§6[NexusInventory] §aLoaded inventário WARPS");
        getCommand("kit").setExecutor(new CommandKit());
        getServer().getPluginManager().registerEvents(new InventoryMainKit(), this);
        getServer().getPluginManager().registerEvents(new InventoryEspeciaisItens(), this);
        getServer().getPluginManager().registerEvents(new InventoryRankKit(), this);
        getServer().getPluginManager().registerEvents(new InventoryVipKit(), this);
        Bukkit.getConsoleSender().sendMessage("§6[NexusInventory] §aLoaded inventário KITS");
        getCommand("discord").setExecutor(new CommandInformacoes());
        getCommand("yt").setExecutor(new CommandInformacoes());
        getCommand("youtube").setExecutor(new CommandInformacoes());
        Bukkit.getConsoleSender().sendMessage("§6[NexusInventory] §aLoaded comandos informacionais");
    }

    @Override
    public void onDisable() {

         
    }
}
