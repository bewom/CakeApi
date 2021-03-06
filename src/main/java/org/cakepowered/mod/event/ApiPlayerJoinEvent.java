package org.cakepowered.mod.event;

import org.cakepowered.api.core.Game;
import org.cakepowered.api.entity.Player;
import org.cakepowered.api.event.PlayerJoinEvent;
import org.cakepowered.mod.util.ForgeInterface;

import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class ApiPlayerJoinEvent implements PlayerJoinEvent {

	public PlayerLoggedInEvent event;

	public ApiPlayerJoinEvent(PlayerLoggedInEvent e) {
		event = e;
	}

	@Override
	public Player getPlayer() {
		return ForgeInterface.getPlayer(event.player);
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
	public boolean hasEventResult() {
		return event.hasResult();
	}

	@Override
	public EventResult getEventResult() {
		return ForgeInterface.getEventResult(event.getResult());
	}

	@Override
	public boolean isEventCanceled() {
		return event.isCanceled();
	}
}
