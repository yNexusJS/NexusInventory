package br.com.nexus.inventory.inventory.kit;

import br.com.nexus.inventory.inventory.kit.subkit.InventoryRankKit;
import br.com.nexus.inventory.inventory.kit.subkit.InventoryEspeciaisItens;
import br.com.nexus.inventory.inventory.kit.subkit.InventoryVipKit;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class InventoryMainKit implements Listener {

    @EventHandler
    void toClickInventory(InventoryClickEvent e) {
        try {
            if (e.getCurrentItem() == null) return;
            if (e.getCurrentItem().getType() == Material.AIR) return;
            if (e.getInventory().getName().equalsIgnoreCase("§8Categorias de Kits")) {
                Player p = (Player) e.getWhoClicked();
                ItemStack item = e.getCurrentItem();
                String nameItem = item.getItemMeta().getDisplayName();
                switch (nameItem) {
                    case "§bKits vips":
                        new InventoryVipKit().openInventory(p);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP,1f, 1f);
                        break;
                    case "§bBásicos":
                        new InventoryRankKit().openInventory(p);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP,1f, 1f);
                        break;
                    case "§bCaixas Misteriosas":
                        new InventoryEspeciaisItens().openInventory(p);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP,1f, 1f);
                        break;
                }
                e.setCancelled(true);
            }
        } catch (Exception exception) {e.setCancelled(true);}
    }


    public void openInventory(Player p) {

        Inventory inventory = Bukkit.createInventory(null, 3*9, "§8Categorias de Kits");

        ItemStack basico = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta itemMetabasico = basico.getItemMeta();
        itemMetabasico.setDisplayName("§bBásicos");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§7Cada rank posui um kit de");
        lore.add("§7itens básicos exclusivo.");
        itemMetabasico.addItemFlags(ItemFlag.values());
        itemMetabasico.setLore(lore);
        basico.setItemMeta(itemMetabasico);

        ItemStack caixas = new ItemStack(Material.ENDER_CHEST);
        ItemMeta itemMetacaixas = caixas.getItemMeta();
        itemMetacaixas.setDisplayName("§bCaixas Misteriosas");
        ArrayList<String> lore1 = new ArrayList<>();
        lore1.add("§7Consiga itens especiais e raríssimos");
        lore1.add("§7abrindo Caixas Misteriosas.");
        lore1.add("");
        lore1.add("§eAdquira o Cash em: §b/discord");
        itemMetacaixas.setLore(lore1);
        caixas.setItemMeta(itemMetacaixas);

        ItemStack vips = new ItemStack(Material.DIAMOND_ORE);
        ItemMeta itemMetavips = vips.getItemMeta();
        itemMetavips.setDisplayName("§bKits vips");
        ArrayList<String> lore2 = new ArrayList<>();
        lore2.add("§7Cada vip possui o seu kit");
        lore2.add("§7próprio exclusivo.");
        lore2.add("");
        lore2.add("§eAdquira o VIP em: §b/discord");
        itemMetavips.setLore(lore2);
        vips.setItemMeta(itemMetavips);

        inventory.setItem(11, basico);
        inventory.setItem(13, vips);
        inventory.setItem(15, caixas);

        p.openInventory(inventory);
    }


}
