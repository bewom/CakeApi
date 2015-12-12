package org.cakepowered.api.nbt;

public interface NBTCompund extends NBTBase {

	public void removeTag(String name);

	public boolean containsTag(String name);

	public void setInteger(String name, int id);

	public void setLong(String name, long id);

	public void setFloat(String name, float id);

	public void setDouble(String name, double id);

	public void setString(String name, String id);

	public void setIntegerArray(String name, int[] id);

	public void setByte(String name, byte id);

	public void setByteArray(String name, byte[] id);

	public void setCompound(String name, NBTCompund id);

	public void setBoolean(String name, boolean id);

	public int getInteger(String name);

	public long getLong(String name);

	public float getFloat(String name);

	public double getDouble(String name);

	public String getString(String name);

	public int[] getIntegerArray(String name);

	public byte getByte(String name);

	public byte[] getByteArray(String name);

	public NBTCompund getCompound(String name);

	public boolean getBoolean(String name);
}
