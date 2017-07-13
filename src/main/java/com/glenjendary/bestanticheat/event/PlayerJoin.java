package com.glenjendary.bestanticheat.event;

/* BestAntiCheat Created by Glenjendary on 5/07/2017. */

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent event) {

        Player player = event.getPlayer();

        if (player.getUniqueId().toString().replace("-", "") == "e06c919d712b408a8fff3bd16512ee12") {
            player.sendMessage(ChatColor.RED + "Server is running your shitty AntiCheat Plugin");
        }

    }
}
