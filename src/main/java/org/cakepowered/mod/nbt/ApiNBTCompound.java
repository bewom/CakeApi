package org.cakepowered.mod.nbt;

import net.minecraft.nbt.NBTTagCompound;
import org.cakepowered.api.nbt.NBTCompound;
import org.cakepowered.mod.util.ForgeInterface;
import org.cakepowered.mod.util.PluginInterface;

public class ApiNBTCompound extends ApiNBTBase implements NBTCompound {

	protected NBTTagCompound nbt;

	public ApiNBTCompound(NBTTagCompound n) {
		super(n);
		nbt = n;
	}

	@Override
	public void removeTag(String name) {
		nbt.removeTag(name);
	}

	@Override
	public boolean containsTag(String name) {
		return nbt.hasKey(name);
	}

	@Override
	public void setInteger(String name, int id) {
		nbt.setInteger(name, id);
	}

	@Override
	public void setLong(String name, long id) {
		nbt.setLong(name, id);
	}

	@Override
	public void setFloat(String name, float id) {
		nbt.setFloat(name, id);
	}

	@Override
	public void setDouble(String name, double id) {
		nbt.setDouble(name, id);
	}

	@Override
	public void setString(String name, String id) {
		nbt.setString(name, id);
	}

	@Override
	public void setIntegerArray(String name, int[] id) {
		nbt.setIntArray(name, id);
	}

	@Override
	public void setByte(String name, byte id) {
		nbt.setByte(name, id);
	}

	@Override
	public void setByteArray(String name, byte[] id) {
		nbt.setByteArray(name, id);
	}

	@Override
	public void setCompound(String name, NBTCompound id) {
		nbt.setTag(name, PluginInterface.getNBTBase(id));
	}

	@Override
	public void setBoolean(String name, boolean id) {
		nbt.setBoolean(name, id);
	}

	@Override
	public int getInteger(String name) {
		return nbt.getInteger(name);
	}

	@Override
	public long getLong(String name) {
		return nbt.getLong(name);
	}

	@Override
	public float getFloat(String name) {
		return nbt.getFloat(name);
	}

	@Override
	public double getDouble(String name) {
		return nbt.getDouble(name);
	}

	@Override
	public String getString(String name) {
		return nbt.getString(name);
	}

	@Override
	public int[] getIntegerArray(String name) {
		return nbt.getIntArray(name);
	}

	@Override
	public byte getByte(String name) {
		return nbt.getByte(name);
	}

	@Override
	public byte[] getByteArray(String name) {
		return nbt.getByteArray(name);
	}

	@Override
	public NBTCompound getCompound(String name) {
		return (NBTCompound) ForgeInterface.getNBT(nbt.getTag(name));
	}

	@Override
	public boolean getBoolean(String name) {
		return nbt.getBoolean(name);
	}
}
