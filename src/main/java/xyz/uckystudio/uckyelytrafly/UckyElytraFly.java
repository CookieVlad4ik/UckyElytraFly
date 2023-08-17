package xyz.uckystudio.uckyelytrafly;

import java.util.Objects;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.uckystudio.uckyelytrafly.commands.MainCommand;
import xyz.uckystudio.uckyelytrafly.utils.Listeners;

public class UckyElytraFly extends JavaPlugin {
   public static UckyElytraFly instance;

   @Override
   public void onEnable() {
      saveDefaultConfig();
      getLogger().info(ChatColor.BLUE + "╔╗─╔╗╔═══╗╔╗──╔╗╔╗──╔╗╔═══╗╔════╗╔╗─╔╗╔═══╗╔══╗╔═══╗");
      getLogger().info(ChatColor.BLUE + "║║─║║║╔═╗║║║─╔╝╝║║──║║║╔═╗║║╔╗╔╗║║║─║║╚╗╔╗║╚╣╠╝║╔═╗║");
      getLogger().info(ChatColor.BLUE + "║║─║║║║─╚╝║╠═╣──║╚══╝║║╚══╗╚╝║║╚╝║║─║║─║║║║─║║─║║─║║");
      getLogger().info(ChatColor.YELLOW + "║║─║║║║─╔╗║║─╚╗╗╚═╗╔═╝╚══╗║──║║──║║─║║─║║║║─║║─║║─║║");
      getLogger().info(ChatColor.YELLOW + "║╚═╝║║╚═╝║║║──║║──║║──║╚═╝║──║║──║╚═╝║╔╝╚╝║╔╣╠╗║╚═╝║");
      getLogger().info(ChatColor.YELLOW + "╚═══╝╚═══╝╚╝──╚╝──╚╝──╚═══╝──╚╝──╚═══╝╚═══╝╚══╝╚═══╝");
      getLogger().info(ChatColor.GREEN + "Плагин успешно включен!");

      Bukkit.getPluginManager().registerEvents(new Listeners(), this);
      Objects.requireNonNull(getCommand("fly")).setExecutor(new MainCommand());
   }

   @Override
   public void onDisable() {
      getLogger().info(ChatColor.BLUE + "╔╗─╔╗╔═══╗╔╗──╔╗╔╗──╔╗╔═══╗╔════╗╔╗─╔╗╔═══╗╔══╗╔═══╗");
      getLogger().info(ChatColor.BLUE + "║║─║║║╔═╗║║║─╔╝╝║║──║║║╔═╗║║╔╗╔╗║║║─║║╚╗╔╗║╚╣╠╝║╔═╗║");
      getLogger().info(ChatColor.BLUE + "║║─║║║║─╚╝║╠═╣──║╚══╝║║╚══╗╚╝║║╚╝║║─║║─║║║║─║║─║║─║║");
      getLogger().info(ChatColor.YELLOW + "║║─║║║║─╔╗║║─╚╗╗╚═╗╔═╝╚══╗║──║║──║║─║║─║║║║─║║─║║─║║");
      getLogger().info(ChatColor.YELLOW + "║╚═╝║║╚═╝║║║──║║──║║──║╚═╝║──║║──║╚═╝║╔╝╚╝║╔╣╠╗║╚═╝║");
      getLogger().info(ChatColor.YELLOW + "╚═══╝╚═══╝╚╝──╚╝──╚╝──╚═══╝──╚╝──╚═══╝╚═══╝╚══╝╚═══╝");
      getLogger().info(ChatColor.RED + "Плагин успешно выключен!");
   }
}

