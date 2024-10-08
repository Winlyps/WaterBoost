package winlyps.waterBoost

import org.bukkit.plugin.java.JavaPlugin

class WaterBoost : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(WaterBoostListener(this), this)
        logger.info("WaterBoost plugin enabled.")
    }

    override fun onDisable() {
        logger.info("WaterBoost plugin disabled.")
    }
}