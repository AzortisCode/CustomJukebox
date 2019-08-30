package com.azortis.customjukebox;

import com.azortis.azortislib.AzortisLib;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomJukebox extends JavaPlugin {

    private AzortisLib azortisLib;
    private Metrics metrics;

    @Override
    public void onEnable(){
        this.azortisLib = new AzortisLib(this, "CustomJukebox", "§6[§eCustomJukebox§6]§r");
        this.metrics = new Metrics(this);

    }

    @Override
    public void onDisable(){
        azortisLib.close();
    }
}
