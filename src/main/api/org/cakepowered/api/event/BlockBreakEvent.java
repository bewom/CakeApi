package org.cakepowered.api.event;

import org.cakepowered.api.entity.Player;

public interface BlockBreakEvent extends BlockEvent {

	Player getPlayer();
}
