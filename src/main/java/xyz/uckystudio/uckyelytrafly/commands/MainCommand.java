package xyz.uckystudio.uckyelytrafly.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import xyz.uckystudio.uckyelytrafly.UckyElytraFly;

import static xyz.uckystudio.uckyelytrafly.utils.Tools.rc;

public class MainCommand implements CommandExecutor {
   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
      if (!(sender instanceof Player)) {
         sender.sendMessage(rc(UckyElytraFly.instance.getConfig().getString("messages.onlyPlayers")));
         return true;
      } else {
         Player player = (Player)sender;
         if (!player.hasPermission("uckyelytrafly.fly")) {
            player.sendMessage(rc(UckyElytraFly.instance.getConfig().getString("messages.noPerms")));
            return true;
         } else {
            ItemStack chestplate = player.getInventory().getChestplate();
            if ((chestplate == null || chestplate.getType() != Material.ELYTRA) && !player.hasPermission("uckyelytrafly.bypass")) {
               player.sendMessage(rc(UckyElytraFly.instance.getConfig().getString("messages.noElytra")));
            } else {
               player.setAllowFlight(!player.getAllowFlight());
               String message = player.getAllowFlight() ? rc(UckyElytraFly.instance.getConfig().getString("messages.flyOn")) : rc(UckyElytraFly.instance.getConfig().getString("messages.flyOff"));
               player.sendMessage(message);
            }

            return true;
         }
      }
   }
}
