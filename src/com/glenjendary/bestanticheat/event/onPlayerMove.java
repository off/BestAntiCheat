package com.glenjendary.bestanticheat.event;

/* BestAntiCheat Created} by Glenjendary on 5/07/2017. */

import com.glenjendary.bestanticheat.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class onPlayerMove implements Listener {

    private Main plugin;

    public onPlayerMove(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerMove (PlayerMoveEvent event) {

        if (!(event.getPlayer() instanceof Player)) {
            return;
        }

        Player player = event.getPlayer();


        if (player.isFlying() && !player.getAllowFlight()) {
            event.setCancelled(true);
            player.kickPlayer(ChatColor.RED + "Flying is not allowed on this server!");

            for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                all.sendMessage(ChatColor.GREEN + "Another hacker (" + player + ") kicked by the worlds greatest anticheat!");
            }
        }

    }

}
