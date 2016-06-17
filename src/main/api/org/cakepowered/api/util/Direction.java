package org.cakepowered.api.util;

import org.cakepowered.api.util.vector.Vector3i;

public enum Direction {

	DOWN(0, -1, 0), UP(0, 1, 0), NORTH(0, 0, -1), SOUTH(0, 0, 1), WEST(-1, 0, 0), EAST(1, 0, 0);

	public static final Direction[] VALID_DIRECTIONS = { DOWN, UP, NORTH, SOUTH, WEST, EAST };
	public static final Direction[] OPPOSITES = { UP, DOWN, SOUTH, NORTH, EAST, WEST };
	public static final int[][] rotation = { { 0, 1, 5, 4, 2, 3 }, { 0, 1, 4, 5, 3, 2 }, { 5, 4, 2, 3, 0, 1 }, { 4, 5, 2, 3, 1, 0 }, { 2, 3, 1, 0, 4, 5 }, { 3, 2, 0, 1, 4, 5 }, { 0, 1, 2, 3, 4, 5 } };

	private final Vector3i offsets;

	Direction(int x, int y, int z) {
		offsets = new Vector3i(x, y, z);
	}

	public int getOffsetX() {
		return offsets.getX();
	}

	public int getOffsetY() {
		return offsets.getY();
	}

	public int getOffsetZ() {
		return offsets.getZ();
	}

	public Direction opposite() {
		return OPPOSITES[ordinal()];
	}

	public static Direction getDirection(int i) {
		return values()[i % VALID_DIRECTIONS.length];
	}

	public Vector3i toVecInt() {
		return offsets.copy();
	}

	public static String[] names() {
		return new String[] { DOWN.name().toLowerCase(), UP.name().toLowerCase(), NORTH.name()
				.toLowerCase(), SOUTH.name().toLowerCase(), WEST.name().toLowerCase(), EAST.name()
						.toLowerCase() };
	}

	public static String[] namesUpper() {
		return new String[] { DOWN.name(), UP.name(), NORTH.name(), SOUTH.name(), WEST.name(), EAST.name() };
	}
}
