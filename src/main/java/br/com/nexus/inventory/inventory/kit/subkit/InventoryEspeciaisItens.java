package br.com.nexus.inventory.inventory.kit.subkit;

import br.com.nexus.inventory.inventory.kit.InventoryMainKit;
import br.com.nexus.inventory.util.ItemBuilder;
import com.nextplugins.cash.api.NextCashAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryEspeciaisItens implements Listener {

    @EventHandler
    public void onClickInventory(InventoryClickEvent e) {
        try {
            if (e.getCurrentItem() == null) return;
            if (e.getCurrentItem().getType() == Material.AIR) return;
            if (e.getInventory().getName().equalsIgnoreCase("§8Categorias - Especiais")) {
                ItemStack itemStack = e.getCurrentItem();
                Player p = (Player) e.getWhoClicked();
                if (itemStack.getItemMeta().getDisplayName().equalsIgnoreCase("§cVoltar")) {
                    new InventoryMainKit().openInventory(p);
                    e.setCancelled(true);
                    return;
                }
                if (itemStack.getItemMeta().getDisplayName().equalsIgnoreCase("§eCaixa Misteriosa §8(1x)")) {
                    switch (itemStack.getType()) {
                        case ENDER_CHEST:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 100) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(100);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit epica1 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                        case ENDER_PORTAL_FRAME:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 200) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(200);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit divina1 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                        case QUARTZ_ORE:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 350) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(350);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit hallo1 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                    }
                    p.closeInventory();
                }
                if (itemStack.getItemMeta().getDisplayName().equalsIgnoreCase("§eCaixa Misteriosa §8(3x)")) {
                    switch (itemStack.getType()) {
                        case ENDER_CHEST:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 300) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(300);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit epica3 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                        case ENDER_PORTAL_FRAME:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 600) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(600);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit divina3 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                        case QUARTZ_ORE:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 700) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(700);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit hallo3 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                    }
                }
                if (itemStack.getItemMeta().getDisplayName().equalsIgnoreCase("§eCaixa Misteriosa §8(5x)")) {
                    switch (itemStack.getType()) {
                        case ENDER_CHEST:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 500) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(500);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit epica5 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                        case ENDER_PORTAL_FRAME:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 1000) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(1000);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit divina5 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                        case QUARTZ_ORE:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 1750) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(1750);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit hallo5 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                    }
                    p.closeInventory();
                }
                if (itemStack.getItemMeta().getDisplayName().equalsIgnoreCase("§eCaixa Misteriosa §8(10x)")) {
                    switch (itemStack.getType()) {
                        case ENDER_CHEST:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 700) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(700);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit epica10 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                        case ENDER_PORTAL_FRAME:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 1250) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(1250);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit divina10 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                        case QUARTZ_ORE:
                            if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 2275) {
                                p.sendMessage("§aCompra confirmada.");
                                NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(2275);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit hallo10 " + p.getName());
                            } else p.sendMessage("§cVocê não tem cash suficiente.");
                            break;
                    }
                    p.closeInventory();
                }
                if (itemStack.getItemMeta().getDisplayName().equalsIgnoreCase("§aLivro Especial")) {
                    if (NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().getBalance() >= 1225) {
                        p.sendMessage("§aCompra confirmada.");
                        NextCashAPI.getInstance().findAccountByOwner(p.getName()).get().withdrawAmount(1225);
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "darkit superarea " + p.getName());
                    } else p.sendMessage("§cVocê não tem cash suficiente.");
                    p.closeInventory();
                }
                e.setCancelled(true);
            }
        } catch (Exception ignored) {e.setCancelled(true);}

    }

    public void openInventory(Player p) {

        Inventory inventory = Bukkit.createInventory(null, 6 * 9, "§8Categorias - Especiais");

        ItemStack epicaI = new ItemBuilder(Material.ENDER_CHEST, 1)
                .setName("§eCaixa Misteriosa §8(1x)")
                .setLore("§fTipo: Épica", "", "§7Quantidade:§f 1", "§7Preço:§6 100 Cash.")
                .toItemStack();

        ItemStack epicaIII = new ItemBuilder(Material.ENDER_CHEST, 3)
                .setName("§eCaixa Misteriosa §8(3x)")
                .setLore("§fTipo: Épica", "", "§7Quantidade:§f 3", "§7Preço:§6 300 Cash.")
                .toItemStack();

        ItemStack epicaV = new ItemBuilder(Material.ENDER_CHEST, 5)
                .setName("§eCaixa Misteriosa §8(5x)")
                .setLore("§fTipo: Épica", "", "§7Quantidade:§f 5", "§7Preço:§6 500 Cash.")
                .toItemStack();

        ItemStack epicaVV = new ItemBuilder(Material.ENDER_CHEST, 10)
                .setName("§eCaixa Misteriosa §8(10x)")
                .setLore("§fTipo: Épica", "", "§7Quantidade:§f 10", "§7Preço:§6 700 Cash.")
                .toItemStack();

        ItemStack divinaI = new ItemBuilder(Material.ENDER_PORTAL_FRAME, 1)
                .setName("§eCaixa Misteriosa §8(1x)")
                .setLore("§fTipo: Divina", "", "§7Quantidade:§f 1", "§7Preço:§6 200 Cash.")
                .toItemStack();

        ItemStack divinaIII = new ItemBuilder(Material.ENDER_PORTAL_FRAME, 3)
                .setName("§eCaixa Misteriosa §8(3x)")
                .setLore("§fTipo: Divina", "", "§7Quantidade:§f 3", "§7Preço:§6 600 Cash.")
                .toItemStack();

        ItemStack divinaV = new ItemBuilder(Material.ENDER_PORTAL_FRAME, 5)
                .setName("§eCaixa Misteriosa §8(5x)")
                .setLore("§fTipo: Divina", "", "§7Quantidade:§f 5", "§7Preço:§6 1000 Cash.")
                .toItemStack();

        ItemStack divinaVV = new ItemBuilder(Material.ENDER_PORTAL_FRAME, 10)
                .setName("§eCaixa Misteriosa §8(10x)")
                .setLore("§fTipo: Divina", "", "§7Quantidade:§f 10", "§7Preço:§6 1250 Cash.")
                .toItemStack();

        ItemStack halloweenI = new ItemBuilder(Material.QUARTZ_ORE, 1)
                .setName("§eCaixa Misteriosa §8(1x)")
                .setLore("§fTipo: §c§lAssustadora", "", "§7Quantidade:§f 1", "§7Preço:§6 350 Cash.")
                .toItemStack();

        ItemStack halloweenIII = new ItemBuilder(Material.QUARTZ_ORE, 3)
                .setName("§eCaixa Misteriosa §8(3x)")
                .setLore("§fTipo: §c§lAssustadora", "", "§7Quantidade:§f 3", "§7Preço:§6 700 Cash.")
                .toItemStack();

        ItemStack halloweenV = new ItemBuilder(Material.QUARTZ_ORE, 5)
                .setName("§eCaixa Misteriosa §8(5x)")
                .setLore("§fTipo: §c§lAssustadora", "", "§7Quantidade:§f 5", "§7Preço:§6 1750 Cash.")
                .toItemStack();

        ItemStack halloweenVV = new ItemBuilder(Material.QUARTZ_ORE, 10)
                .setName("§eCaixa Misteriosa §8(10x)")
                .setLore("§fTipo: §c§lAssustadora", "", "§7Quantidade:§f 10", "§7Preço:§6 2275 Cash.")
                .toItemStack();

        ItemStack voltar = new ItemBuilder(Material.ARROW).setName("§cVoltar").toItemStack();
        ItemStack superArea = new ItemBuilder(Material.ENCHANTED_BOOK).setName("§aLivro Especial")
                .setLore("§7Super área I", "", "§7Quantidade:§f 1", "§7Preço:§6 1225 Cash").toItemStack();

        inventory.setItem(10, epicaI);
        inventory.setItem(10 + 9, epicaIII);
        inventory.setItem(10 + 9 + 9, epicaV);
        inventory.setItem(10 + 9 + 9 + 9, epicaVV);

        inventory.setItem(12, divinaI);
        inventory.setItem(12 + 9, divinaIII);
        inventory.setItem(12 + 9 + 9, divinaV);
        inventory.setItem(12 + 9 + 9 + 9, divinaVV);

        inventory.setItem(14, halloweenI);
        inventory.setItem(14 + 9, halloweenIII);
        inventory.setItem(14 + 9 + 9, halloweenV);
        inventory.setItem(14 + 9 + 9 + 9, halloweenVV);

        inventory.setItem(9 + 9 + 9 + 9 + 9, voltar);
        inventory.setItem(7 + 9, superArea);

        p.openInventory(inventory);

    }

}
