package br.com.nexus.inventory.inventory.warp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class InventoryWarp implements Listener {

    @EventHandler
    void toClickInventory(InventoryClickEvent e) {
        try {
            if (e.getCurrentItem() == null) return;
            if (e.getCurrentItem().getType() == Material.AIR) return;
            if (e.getInventory().getName().equalsIgnoreCase("§8/ir")) {
                Player p = (Player) e.getWhoClicked();
                ItemStack item = e.getCurrentItem();
                String nameItem = item.getItemMeta().getDisplayName();
                switch (nameItem) {
                    case "§aSpawn":
                        p.chat("/spawn");
                        p.closeInventory();
                        break;
                    case "§aÁrea VIP":
                        p.chat("/vip");
                        p.closeInventory();
                        break;
                    case "§aMinas":
                        p.chat("/mina");
                        p.closeInventory();
                        break;
                    case "§aArena":
                        p.chat("/arena");
                        p.closeInventory();
                        break;
                    case "§aLoja":
                        p.chat("/loja");
                        p.closeInventory();
                        break;
                    case "§aCeleiro":
                        p.chat("/celeiro");
                        p.closeInventory();
                        break;
                    case "§aPesqueiro":
                        p.chat("/pesqueiro");
                        p.closeInventory();
                        break;
                    case "§aHall da fama":
                        p.chat("/hall");
                        p.closeInventory();
                        break;
                }
                e.setCancelled(true);
            }
        } catch (Exception ignored) {e.setCancelled(true);}

    }


    public void openInventoryWarp(Player p) {

        Inventory inventory = Bukkit.createInventory(null, 4 * 9, "§8/ir");

        ItemStack spawn = new ItemStack(Material.NETHER_STAR);
        ItemMeta itemMetaspawn = spawn.getItemMeta();
        itemMetaspawn.setDisplayName("§aSpawn");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§7Retorne à área central do servidor.");
        lore.add("");
        lore.add("§fComando: §7/spawn");
        lore.add("");
        lore.add("§aClique para ir!");
        itemMetaspawn.setLore(lore);
        spawn.setItemMeta(itemMetaspawn);

        ItemStack minas = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta itemMetaminas = minas.getItemMeta();
        itemMetaminas.setDisplayName("§aMinas");
        ArrayList<String> lore2 = new ArrayList<>();
        lore2.add("§7Acesse a mina disponível para");
        lore2.add("§7o seu rank.");
        lore2.add("");
        lore2.add("§fComando: §7/mina");
        lore2.add("");
        lore2.add("§aClique para ir!");
        itemMetaminas.addItemFlags(ItemFlag.values());
        itemMetaminas.setLore(lore2);
        minas.setItemMeta(itemMetaminas);

        ItemStack vip = new ItemStack(Material.DIAMOND);
        ItemMeta itemMetavip = vip.getItemMeta();
        itemMetavip.setDisplayName("§aÁrea VIP");
        ArrayList<String> lore3 = new ArrayList<>();
        lore3.add("§7Acesse a área exclusiva para");
        lore3.add("§7jogadores com algum grupo VIP.");
        lore3.add("");
        lore3.add("§fComando: §7/vip");
        lore3.add("");
        lore3.add("§aClique para ir!");
        itemMetavip.setLore(lore3);
        vip.setItemMeta(itemMetavip);

        ItemStack arena = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta itemMetaarena = arena.getItemMeta();
        itemMetaarena.setDisplayName("§aArena");
        ArrayList<String> lore4 = new ArrayList<>();
        lore4.add("§7Acesse a arena e trave batalhas");
        lore4.add("§7épicas e desafiadoras.");
        lore4.add("");
        lore4.add("§fComando: §7/arena");
        lore4.add("");
        lore4.add("§aClique para ir!");
        itemMetaarena.addItemFlags(ItemFlag.values());
        itemMetaarena.setLore(lore4);
        arena.setItemMeta(itemMetaarena);

        ItemStack loja = new ItemStack(Material.EMERALD);
        ItemMeta itemMetaloja = loja.getItemMeta();
        itemMetaloja.setDisplayName("§aLoja");
        ArrayList<String> lore5 = new ArrayList<>();
        lore5.add("§7Acesse a loja localizada no spawn");
        lore5.add("§7onde você poderá comprar e vender");
        lore5.add("§7diversos itens.");
        lore5.add("");
        lore5.add("§fComando: §7/loja");
        lore5.add("");
        lore5.add("§aClique para ir!");
        itemMetaloja.setLore(lore5);
        loja.setItemMeta(itemMetaloja);

        ItemStack celeiro = new ItemStack(Material.HAY_BLOCK);
        ItemMeta itemMetaceleiro = celeiro.getItemMeta();
        itemMetaceleiro.setDisplayName("§aCeleiro");
        ArrayList<String> lore6 = new ArrayList<>();
        lore6.add("§7Acesse o celeiro localizado no spawn");
        lore6.add("§7onde você poderá comprar seu");
        lore6.add("§7próprio cavelo usando cash.");
        lore6.add("");
        lore6.add("§fComando: §7/celeiro");
        lore6.add("");
        lore6.add("§aClique para ir!");
        itemMetaceleiro.setLore(lore6);
        celeiro.setItemMeta(itemMetaceleiro);

        ItemStack pesqueiro = new ItemStack(Material.FISHING_ROD);
        ItemMeta itemMetapesqueiro = pesqueiro.getItemMeta();
        itemMetapesqueiro.setDisplayName("§aPesqueiro");
        ArrayList<String> lore7 = new ArrayList<>();
        lore7.add("§7Acesse o pesqueiro localizado no spawn");
        lore7.add("");
        lore7.add("§fComando: §7/pesqueiro");
        lore7.add("");
        lore7.add("§aClique para ir!");
        itemMetapesqueiro.setLore(lore7);
        pesqueiro.setItemMeta(itemMetapesqueiro);

        ItemStack hall = new ItemStack(Material.GOLD_INGOT);
        ItemMeta itemMetahall = hall.getItemMeta();
        itemMetahall.setDisplayName("§aHall da fama");
        ArrayList<String> lore8 = new ArrayList<>();
        lore8.add("§7Conheça os jogadores destaque");
        lore8.add("");
        lore8.add("§fComando: §7/hall");
        lore8.add("");
        lore8.add("§aClique para ir!");
        itemMetahall.setLore(lore8);
        hall.setItemMeta(itemMetahall);

        inventory.setItem(10, spawn);
        inventory.setItem(12, minas);
        inventory.setItem(14, vip);
        inventory.setItem(16, arena);
        inventory.setItem(19, loja);
        inventory.setItem(21, celeiro);
        inventory.setItem(23, pesqueiro);
        inventory.setItem(25, hall);

        p.openInventory(inventory);
    }

}
