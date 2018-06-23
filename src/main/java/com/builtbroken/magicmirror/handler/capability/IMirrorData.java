package com.builtbroken.magicmirror.handler.capability;

import com.builtbroken.magicmirror.handler.TeleportPos;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by StrikerRocker on 22/6/18.
 */
public interface IMirrorData {

    /**
     * Checks if the player has a location stored for use
     *
     * @return
     */
    boolean hasLocation();
    /**
     * Gets the location to teleport the user to
     *
     * @return
     */
    TeleportPos getLocation();

    /**
     * Sets the player's teleport location
     *
     * @param potentialTP
     */
    void setLocation(TeleportPos potentialTP);

    /**
     * Gets the cost of teleporting for the user
     * @param player
     * @return
     */
    float getXpTeleportCost(EntityPlayer player);

    /**
     * Sets the player's teleport location
     *
     * @param player
     * @param potentialTP
     */
    void setLocation(EntityPlayer player, TeleportPos potentialTP);
}