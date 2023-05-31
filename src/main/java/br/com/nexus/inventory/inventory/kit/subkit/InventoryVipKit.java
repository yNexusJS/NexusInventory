package br.com.nexus.inventory.inventory.kit.subkit;

import br.com.nexus.inventory.inventory.kit.InventoryMainKit;
import br.com.nexus.inventory.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class InventoryVipKit implements Listener {

    @EventHandler
    void toClickInventory(InventoryClickEvent e) {
        try {
            if (e.getCurrentItem() == null) return;
            if (e.getCurrentItem().getType() == Material.AIR) return;
            if (e.getInventory().getName().equalsIgnoreCase("§8Kits - VIP")) {
                Player p = (Player) e.getWhoClicked();
                ItemStack item = e.getCurrentItem();
                String nameItem = item.getItemMeta().getDisplayName();
                switch (nameItem) {
                    case "§b[MVP§d++§b] Mensal":
                        p.chat("/system:kit mvppplus");
                        p.closeInventory();
                        break;
                    case "§b[MVP§d++§b] Semanal":
                        p.chat("/system:kit mvpmsemana");
                        p.closeInventory();
                        break;
                    case "§b[MVP§d++§b] Diário":
                        p.chat("/system:kit mvppdiario");
                        p.closeInventory();
                        break;
                    case "§b[MVP] Mensal":
                        p.chat("/system:kit mvp");
                        p.closeInventory();
                        break;
                    case "§b[MVP] Semanal":
                        p.chat("/system:kit mvpsemanal");
                        p.closeInventory();
                        break;
                    case "§b[MVP] Diário":
                        p.chat("/system:kit mvpdiario");
                        p.closeInventory();
                        break;
                    case "§a[VIP] Mensal":
                        p.chat("/system:kit vip");
                        p.closeInventory();
                        break;
                    case "§a[VIP] Semanal":
                        p.chat("/system:kit vipsemanal");
                        p.closeInventory();
                        break;
                    case "§a[VIP] Diário":
                        p.chat("/system:kit vipdiario");
                        p.closeInventory();
                        break;
                    case "§cVoltar":
                        new InventoryMainKit().openInventory(p);
                        break;
                }
                e.setCancelled(true);
            }
        } catch (Exception exception) {e.setCancelled(true);}
    }

    public void openInventory(Player p) {

        Inventory inventory = Bukkit.createInventory(null, 6*9, "§8Kits - VIP");

        ItemStack itemStack = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b[MVP§d++§b] Mensal");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§7Clique para §fcoletar o kit mensal§7.");
        lore.add("");
        lore.add("§7Exclusivo para §bMVP§d++§7.");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        ItemStack itemStack1 = new ItemStack(Material.DIAMOND_ORE);
        ItemMeta itemMeta1 = itemStack1.getItemMeta();
        itemMeta1.setDisplayName("§b[MVP§d++§b] Semanal");
        ArrayList<String> lore1 = new ArrayList<>();
        lore1.add("§7Clique para §fcoletar o kit semanal§7.");
        lore1.add("");
        lore1.add("§7Exclusivo para §bMVP§d++§7.");
        itemMeta1.setLore(lore1);
        itemStack1.setItemMeta(itemMeta1);

        ItemStack itemStack2 = new ItemStack(Material.DIAMOND);
        ItemMeta itemMeta2 = itemStack2.getItemMeta();
        itemMeta2.setDisplayName("§b[MVP§d++§b] Diário");
        ArrayList<String> lore2 = new ArrayList<>();
        lore2.add("§7Clique para §fcoletar o kit diário§7.");
        lore2.add("");
        lore2.add("§7Exclusivo para §bMVP§d++§7.");
        itemMeta2.setLore(lore2);
        itemStack2.setItemMeta(itemMeta2);

        ItemStack mvpMensal = new ItemBuilder(Material.GOLD_BLOCK)
                .setName("§b[MVP] Mensal")
                .setLore("§7Clique para §fcoletar o kit mensal§7.", "", "§7Exclusivo para §b[MVP]§7.")
                .toItemStack();
        ItemStack mvpSemanal = new ItemBuilder(Material.GOLD_ORE)
                .setName("§b[MVP] Semanal")
                .setLore("§7Clique para §fcoletar o kit semanal§7.", "", "§7Exclusivo para §b[MVP]§7.")
                .toItemStack();
        ItemStack mvpDiario = new ItemBuilder(Material.GOLD_INGOT)
                .setName("§b[MVP] Diário")
                .setLore("§7Clique para §fcoletar o kit diário§7.", "", "§7Exclusivo para §b[MVP]§7.")
                .toItemStack();

        ItemStack vipMensal = new ItemBuilder(Material.IRON_BLOCK)
                .setName("§a[VIP] Mensal")
                .setLore("§7Clique para §fcoletar o kit mensal§7.", "", "§7Exclusivo para §a[VIP]§7.")
                .toItemStack();
        ItemStack vipSemanal = new ItemBuilder(Material.IRON_ORE)
                .setName("§a[VIP] Semanal")
                .setLore("§7Clique para §fcoletar o kit semanal§7.", "", "§7Exclusivo para §a[VIP]§7.")
                .toItemStack();
        ItemStack vipDiario = new ItemBuilder(Material.IRON_INGOT)
                .setName("§a[VIP] Diário")
                .setLore("§7Clique para §fcoletar o kit diário§7.", "", "§7Exclusivo para §a[VIP]§7.")
                .toItemStack();

        ItemStack voltar = new ItemBuilder(Material.ARROW).setName("§cVoltar").toItemStack();

        inventory.setItem(15+9+9, itemStack2);
        inventory.setItem(15+9, itemStack1);
        inventory.setItem(15, itemStack);

        inventory.setItem(13+9+9, mvpDiario);
        inventory.setItem(13+9, mvpSemanal);
        inventory.setItem(13, mvpMensal);

        inventory.setItem(11+9+9, vipDiario);
        inventory.setItem(11+9, vipSemanal);
        inventory.setItem(11, vipMensal);
        inventory.setItem(4+(5*9), voltar);

        p.openInventory(inventory);
    }

}
