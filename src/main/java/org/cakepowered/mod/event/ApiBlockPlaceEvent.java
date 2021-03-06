package org.cakepowered.mod.event;

import org.cakepowered.api.core.Game;
import org.cakepowered.api.entity.Player;
import org.cakepowered.api.block.Block;
import org.cakepowered.api.event.BlockPlaceEvent;
import org.cakepowered.api.util.Vector3;
import org.cakepowered.api.world.World;
import org.cakepowered.mod.util.ForgeInterface;

import net.minecraftforge.event.world.BlockEvent.PlaceEvent;

public class ApiBlockPlaceEvent implements BlockPlaceEvent {

	public PlaceEvent event;

	public ApiBlockPlaceEvent(PlaceEvent e) {
		event = e;
	}

	@Override
	public Vector3 getPosition() {
		return ForgeInterface.getVector3(event.getPos());
	}

	@Override
	public World getWorld() {
		return ForgeInterface.getWorld(event.getWorld());
	}

	@Override
	public Game getGame() {
		return ForgeInterface.getGame();
	}

	@Override
	public boolean isEventCancelable() {
		return event.isCancelable();
	}

	@Override
	public void setEventCanceled(boolean value) {
		event.setCanceled(value);
	}

	@Override
	public boolean isEventCanceled() {
		return event.isCanceled();
	}

	@Override
	public boolean hasEventResult() {
		return event.hasResult();
	}

	@Override
	public EventResult getEventResult() {
		return ForgeInterface.getEventResult(event.getResult());
	}

	@Override
	public Player getPlayer() {
		return ForgeInterface.getPlayer(event.getPlayer());
	}

	@Override
	public Block getBlock() {
		return ForgeInterface.getBlock(event.getState().getBlock());
	}
}
