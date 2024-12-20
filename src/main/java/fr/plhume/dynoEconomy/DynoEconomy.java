package fr.plhume.dynoEconomy;

import org.bukkit.plugin.java.JavaPlugin;

public final class DynoEconomy extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DynoEconomy is enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("DynoEconomy is disabled");
    }
}
