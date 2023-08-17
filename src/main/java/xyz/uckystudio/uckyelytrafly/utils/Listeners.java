package xyz.uckystudio.uckyelytrafly.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import xyz.uckystudio.uckyelytrafly.UckyElytraFly;

import static xyz.uckystudio.uckyelytrafly.utils.Tools.rc;

public class Listeners implements Listener {

   @EventHandler
   public void onInventoryClick(InventoryClickEvent event) {
      Player player = (Player) event.getWhoClicked();

      if (player.hasPermission("uckyelytrafly.bypass")) {
         return;
      }
      if (!player.getAllowFlight()) {
         return;
      }
      if (event.getRawSlot() != 6) {
         return;
      }
      ItemStack currentItem = event.getCurrentItem();
      if (currentItem == null || currentItem.getType() != Material.ELYTRA) {
         return;
      }
      player.setAllowFlight(false);
      player.sendMessage(rc(UckyElytraFly.instance.getConfig().getString("messages.removeElytra")));
   }
}

