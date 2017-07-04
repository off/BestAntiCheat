package com.glenjendary.bestanticheat;

/* BestAntiCheat Created} by Glenjendary on 5/07/2017. */

import com.glenjendary.bestanticheat.event.onPlayerMove;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {

    public void onEnable() {

        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();

        registerEvents();

        logger.info(pdfFile.getName() + " has been enabled with version "
                + pdfFile.getVersion());
    }

    public void registerEvents() {

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new onPlayerMove(this), this);
        pm.registerEvents(new onPlayerJoin(this), this);

    }

    public void onDisable() {

        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();

        logger.info(pdfFile.getName() + " has been disabled with version "
                + pdfFile.getVersion());


    }


}
