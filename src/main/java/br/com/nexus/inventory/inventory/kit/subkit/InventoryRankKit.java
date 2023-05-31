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

public class InventoryRankKit implements Listener {

    @EventHandler
    public void onClickInventory(InventoryClickEvent e) {
        try {
            if (e.getCurrentItem() == null) return;
            if (e.getCurrentItem().getType() == Material.AIR) return;
            if (e.getInventory().getName().equalsIgnoreCase("§8Kits - Ranks")) {
                ItemStack itemStack = e.getCurrentItem();
                Player p = (Player) e.getWhoClicked();
                if (itemStack.getItemMeta().getDisplayName().equalsIgnoreCase("§cVoltar")) {
                    new InventoryMainKit().openInventory(p);
                    e.setCancelled(true);
                    return;
                }
                switch (itemStack.getItemMeta().getDisplayName()) {
                    case "§cTerra":
                        p.chat("/system:kit terra");
                        p.closeInventory();
                        break;
                    case "§8Carvão":
                        p.chat("/system:kit carvao");
                        p.closeInventory();
                        break;
                    case "§9Lápis":
                        p.chat("/system:kit lapis");
                        p.closeInventory();
                        break;
                    case "§fFerro":
                        p.chat("/system:kit ferro");
                        p.closeInventory();
                        break;
                    case "§4Redstone":
                        p.chat("/system:kit redstone");
                        p.closeInventory();
                        break;
                    case "§6Ouro":
                        p.chat("/system:kit ouro");
                        p.closeInventory();
                        break;
                    case "§bDiamante":
                        p.chat("/system:kit diamante");
                        p.closeInventory();
                        break;
                    case "§aEsmeralda":
                        p.chat("/system:kit Esmeralda");
                        p.closeInventory();
                        break;
                    case "§5Crystal":
                        p.chat("/system:kit crystal");
                        p.closeInventory();
                        break;
                }
                e.setCancelled(true);
            }
        } catch (Exception ignored) { e.setCancelled(true); }
    }

    public void openInventory(Player p) {

        Inventory inventory = Bukkit.createInventory(null, 6 * 9, "§8Kits - Ranks");

        ItemStack terra = new ItemBuilder(Material.DIRT).setName("§cTerra")
                .setLore("§7Clique para §fcoletar o seu kit §7.", "", "§7Exclusivo para §cTerra§7.").toItemStack();
        ItemStack carvao = new ItemBuilder(Material.COAL_ORE).setName("§8Carvão")
                .setLore("§7Clique para §fcoletar o seu kit§7.", "", "§7Exclusivo para §8Carvão§7.").toItemStack();
        ItemStack lapis = new ItemBuilder(Material.LAPIS_ORE).setName("§9Lápis")
                .setLore("§7Clique para §fcoletar o seu kit§7.", "", "§7Exclusivo para §9Lápis§7.").toItemStack();
        ItemStack redstone = new ItemBuilder(Material.REDSTONE_ORE).setName("§4Redstone")
                .setLore("§7Clique para §fcoletar o seu kit§7.", "", "§7Exclusivo para §4Redstone§7.").toItemStack();
        ItemStack ferro = new ItemBuilder(Material.IRON_ORE).setName("§fFerro")
                .setLore("§7Clique para §fcoletar o seu kit§7.", "", "§7Exclusivo para §fFerro§7.").toItemStack();
        ItemStack ouro = new ItemBuilder(Material.GOLD_ORE).setName("§6Ouro")
                .setLore("§7Clique para §fcoletar o seu kit§7.", "", "§7Exclusivo para §6Ouro§7.").toItemStack();
        ItemStack diamante = new ItemBuilder(Material.DIAMOND_ORE).setName("§bDiamante")
                .setLore("§7Clique para §fcoletar o seu kit§7.", "", "§7Exclusivo para §bDiamante§7.").toItemStack();
        ItemStack esmeralda = new ItemBuilder(Material.EMERALD_ORE).setName("§aEsmeralda")
                .setLore("§7Clique para §fcoletar o seu kit§7.", "", "§7Exclusivo para §aEsmeralda§7.").toItemStack();
        ItemStack crystal = new ItemBuilder(Material.NETHER_BRICK).setName("§5Crystal")
                .setLore("§7Clique para §fcoletar o seu kit§7.", "", "§7Exclusivo para §5Crystal§7.").toItemStack();
        ItemStack voltar = new ItemBuilder(Material.ARROW).setName("§cVoltar").toItemStack();

        inventory.setItem(10, terra);
        inventory.setItem(12, carvao);
        inventory.setItem(14, lapis);
        inventory.setItem(16, ferro);
        inventory.setItem(28, redstone);
        inventory.setItem(30, ouro);
        inventory.setItem(32, diamante);
        inventory.setItem(34, esmeralda);
        inventory.setItem(4 + (5 * 9), crystal);
        inventory.setItem(5 * 9, voltar);

        p.openInventory(inventory);
    }

}
