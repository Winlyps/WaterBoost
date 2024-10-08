package winlyps.waterBoost

import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class WaterBoostListener(private val plugin: WaterBoost) : Listener {

    @EventHandler
    fun onPlayerMove(event: PlayerMoveEvent) {
        val player: Player = event.player

        // Check if the player is in water
        if (player.location.block.type == Material.WATER) {
            // Apply water breathing effect for 15 seconds (300 ticks)
            player.addPotionEffect(PotionEffect(PotionEffectType.WATER_BREATHING, 300, 0))
        }
    }
}