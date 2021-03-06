package org.cakepowered.api.block;

import org.cakepowered.api.core.References;

public enum Blocks {

	AIR("air"),
	STONE("stone"),
	GRASS("grass"),
	DIRT("dirt"),
	COBBLESTONE("cobblestone"),
	PLANKS("planks"),
	SAPLING("sapling"),
	BEDROCK("bedrock"),
	FLOWING_WATER("flowing_water"),
	WATER("water"),
	FLOWING_LAVA("lava"),
	LAVA("lava"),
	SAND("sand"),
	GRAVEL("gravel"),
	GOLD_ORE("gold_ore"),
	IRON_ORE("iron_ore"),
	COAL_ORE("coal_ore"),
	LOG("log"),
	LEAVES("leaves"),
	SPONGE("sponge"),
	GLASS("glass"),
	LAPIS_ORE("lapis_ore"),
	LAPIS_BLOCK("lapis_block"),
	DISPENSER("dispenser"),
	SANDSTONE("sandstone"),
	NOTEBLOCK("noteblock"),
	BED("bed"),
	GOLDEN_RAIL("golden_rail"),
	DETECTOR_RAIL("detector_rail"),
	STICKY_PISTON("stiky_piston"),
	WEB("web"),
	TALL_GRASS("tallgrass"),
	DEAD_BUSH("deadbush"),
	PISTON("piston"),
	PISTON_HEAD("piston_head"),
	WOOL("wool"),
	PISTON_EXTENSION("piston_extension"),
	YELLOW_FLOWER("yellow_flower"),
	RED_FLOWER("red_flower"),
	BROWN_MUSHROOM("blown_mushroom"),
	RED_MUSHROOM("red_mushroom"),
	GOLD_BLOCK("gold_block"),
	IRON_BLOCK("iron_block"),
	DOUBLE_STONE_SLAB("double_stone_slab"),
	STONE_SLAB("stone_slab"),
	BRICKS_BLOCK("brick_block"),
	TNT("tnt"),
	BOOKSELF("bookself"),
	MOSSY_COBBLESTONE("mossy_cobblestone"),
	OBSIDIAN("obsidian"),
	TORCH("torch"),
	FIRE("fire"),
	MOB_SPAWNER("mob_spawner"),
	OAK_STAIRS("oak_stairs"),
	CHEST("chest"),
	REDSTONE("redstone_wire"),
	DIAMOND_ORE("diamond_ore"),
	DIAMOND_BLOCK("diamond_block"),
	CRAFTING_TABLE("crafting_table"),
	WHEAT("wheat"),
	FARMLAND("farmland"),
	FURNACE("furnace"),
	LIT_FURNACE("lit_furnace"),
	STANDING_SIGN("standing_sign"),
	WOODEN_DOOR("wooden_door"),
	LADDER("ladder"),
	RAIL("rail"),
	STONE_STAIRS("stone_stairs"),
	WALL_SIGN("wall_sign"),
	LEVER("lever"),
	STONE_PRESSURE_PLATE("stone_pressure_plate"),
	IRON_DOOR("iron_door"),
	WOODEN_PRESSURE_PLATE("wooden_pressure_plate"),
	REDTONE_ORE("redstone_ore"),
	LIT_REDTONE_ORE("lit_redstone_ore"),
	UNLIT_REDTONE_TORCH("unlit_redstone_torch"),
	REDSTONE_TORCH("redstone_torch"),
	STONE_BUTTON("stone_button"),
	SNOW_LAYER("snow_layer"),
	ICE("ice"),
	SNOW("snow"),
	CACTUS("cactus"),
	CLAY("clay"),
	SUGAR_CANE("reeds"),
	JUKEBOX("jukebox"),
	FENCE("fende"),
	PUMPKIN("pumpkin"),
	NETHERACK("netherrack"),
	SOUL_SAND("soul_sand"),
	GLOWSTONE("glowstone"),
	PORTAL("portal"),
	LIT_PUMPKIN("lit_pumpkin"),
	CAKE("cake"),
	UNPOWERED_REPEATER("unpowered_repeater"),
	POWERED_REPEATER("powered_repeater"),
	STAINED_GLASS("stained_glass"),
	TRAPDOOR("trapdoor"),
	SILVERFISH_BLOCK("monster_egg"),
	STONEBRICK("stonebrick"),
	BROWN_MUSHROOM_BLOCK("brown_mushroom_block"),
	RED_MUSHROOM_BLOCK("red_mushroom_block"),
	IRON_BARS("iron_bars"),
	GLASS_PANE("glass_pane"),
	MELON_BLOCK("melon_block"),
	PUMPKIN_STEM("pumpkin_stem"),
	MELON_STEM("melon_stem"),
	VINE("vine"),
	FENCE_GATE("fence_gate"),
	BRICK_STAIRS("brick_stairs"),
	STONE_BRICK_STAIRS("stone_brick_stairs"),
	MYCELIUM("mycelium"),
	WATERLILY("waterlily"),
	NETHER_BRICK("nether_brick"),
	NETHER_BRICK_FENCE("nether_brick_fence"),
	NETHER_BRICK_STAIRS("nether_brick_stairs"),
	NETHER_WART("nether_wart"),
	ENCHANTING_TABLE("enchanting_table"),
	BREWING_STAND("brewing_stand"),
	CAULDRON("cauldron"),
	END_PORTAL("end_portal"),
	END_PORTAL_FRAME("end_portal_frame"),
	END_STONE("end_stone"),
	DRAGON_EGG("dragon_egg"),
	REDSTONE_LAMP("redstone_lamp"),
	LIT_REDSTONE_LAMP("lit_redstone_lamp"),
	DOUBLE_WOODEN_SLAB("double_wooden_slab"),
	WOODEN_SLAB("wooden_slab"),
	COCOA("cocoa"),
	SANDSTONE_STAIRS("sandstone_stairs"),
	EMERALD_ORE("emerald_ore"),
	ENDER_CHEST("ender_chest"),
	TRIPWIRE_HOOK("tripwire_hook"),
	TRIPWIRE("tripwire"),
	EMERALD_BLOCK("emerald_block"),
	SPRUCE_STAIRS("spruce_stairs"),
	BIRCH_STAIRS("birch_stairs"),
	JUNGLE_STAIRS("jungle_stairs"),
	COMMAND_BLOCK("command_block"),
	BEACON("beacon"),
	COBBLESTONE_WALL("cobblestone_wall"),
	FLOWER_POT("flower_pot"),
	CARROTS("carrots"),
	POTATOES("potatoes"),
	WOODEN_BUTTON("wooden_button"),
	SKULL("skull"),
	ANVIL("anvil"),
	TRAPPED_CHEST("trapped_chest"),
	LIGHT_WEIGHTED_PRESSURE_PLATE("light_weighted_pressure_plate"),
	HEAVY_WEIGHTED_PRESSURE_PLATE("heavy_weighted_pressure_plate"),
	UNPOWERED_COMPARATOR("unpowered_comparator"),
	POWERED_COMPARATOR("powered_comparator"),
	DAYLIGHT_DETECTOR("daylight_detector"),
	REDSTONE_BLOCK("redstone_block"),
	QUARTZ_ORE("quartz_ore"),
	HOPPER("hopper"),
	QUARTZ_BLOCK("quartz_block"),
	QUARTZ_STAIRS("quartz_stairs"),
	ACTIVATOR_RAIL("activator_rail"),
	DROPPER("dropper"),
	STAINED_HARDENED_CLAY("stained_hardened_clay"),
	STAINED_GLASS_PANE("stained_glass_pane"),
	LEAVES2("leaves2"),
	LOG2("log2"),
	ACACIA_STAIRS("acacia_stairs"),
	DARK_OAK_STAIRS("dark_oak_stairs"),
	SLIME("slime"),
	BARRIER("barrier"),
	IRON_TRAPDOOR("iron_trapdoor"),
	PRISMARINE("prismarine"),
	SEA_LANTERN("sea_lantern"),
	HAY_BLOCK("hay_block"),
	CARPET("carpet"),
	HARDENED_CLAY("hardened_clay"),
	COAL_BLOCK("coal_block"),
	PACKED_ICE("packed_ice"),
	DOUBLE_PLANT("double_plant"),
	STANDING_BANNER("standing_banner"),
	WALL_BANNER("wall_banner"),
	DAYLIGHT_DETECTOR_INVERTED("daylight_detector_inverted"),
	RED_SANDSTONE("red_sandstone"),
	RED_SANDSTONE_STAIRS("red_sandstone_stairs"),
	DOUBLE_STONE_SLAB2("double_stone_slab2"),
	STONE_SLAB2("stone_slab2"),
	SPRUCE_FENCE_GATE("spruce_fence_gate"),
	BIRCH_FENCE_GATE("birch_fence_gate"),
	JUNGLE_FENCE_GATE("jungle_fence_gate"),
	DARK_OAK_FENCE_GATE("dark_oak_fence_gate"),
	ACACIA_FENCE_GATE("acacia_fence_gate"),
	SPRUCE_FENCE("spruce_fence"),
	BIRCH_FENCE("birch_fence"),
	JUNGLE_FENCE("jungle_fence"),
	DARK_OAK_FENCE("dark_oak_fence"),
	ACACIA_FENCE("acacia_fence"),
	SPRUCE_DOOR("spruce_door"),
	BIRCH_DOOR("birch_door"),
	JUNGLE_DOOR("jungle_door"),
	ACACIA_DOOR("acacia_door"),
	DARK_OAK_DOOR("dark_oak_door");

	private final String name;

	Blocks(String name) {
		this.name = name;
	}

	public Block getBlock() {
		return References.GAME.getFinder().findBlock("minecraft", name);
	}

	/**
	 * @return the unique identifier of the block, usually used on "minecraft:" + getName()
	 */
	public String getName() {
		return name;
	}

	public String getUnlocalizedName() {
		return getBlock().getUnlocalizedName();
	}
}
