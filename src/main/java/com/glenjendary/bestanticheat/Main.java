package com.glenjendary.bestanticheat;

/* BestAntiCheat Created} by Glenjendary on 5/07/2017. */

import com.glenjendary.bestanticheat.event.PlayerJoin;
import com.glenjendary.bestanticheat.event.PlayerMove;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerMove(), this);
    }
}
