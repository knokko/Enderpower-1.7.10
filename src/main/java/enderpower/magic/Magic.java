package enderpower.magic;

import java.util.ArrayList;
import java.util.List;

import enderpower.mobs.EntityUndeadMage;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;

public class Magic extends WorldSavedData{

	private int mana = 0;
	private int geemana = 0;
	private int fiemana = 0;
	private int doumana = 0;
	private int endermana = 0;
	private int siemana = 0;
	public List undeadMages = new ArrayList();
	public static final String IDENTIFIER = "enderpower";

	public Magic(String identifier) {
		super(identifier);
		
	}
	public Magic(){
		super(IDENTIFIER);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		mana = nbt.getInteger("mana");
		geemana = nbt.getInteger("geemana");
		fiemana = nbt.getInteger("fiemana");
		doumana = nbt.getInteger("doumana");
		endermana = nbt.getInteger("endermana");
		siemana = nbt.getInteger("siemana");
		
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("mana", mana);
		nbt.setInteger("geemana", geemana);
		nbt.setInteger("fiemana", fiemana);
		nbt.setInteger("doumana", doumana);
		nbt.setInteger("endermana", endermana);
		nbt.setInteger("siemana", siemana);
	}
	
	public int getEnderMana() {
		return this.endermana;
	}
	public int getDouMana() {
		return this.doumana;
		
	}
	public int getSieMana(){
		return this.siemana;
	}
	public int mana() {
		markDirty();
		return mana++;
	}
	
	public static Magic get(World world) {
		Magic data = (Magic)world.loadItemData(Magic.class, IDENTIFIER);
		if (data == null) {
			data = new Magic();
			world.setItemData(IDENTIFIER, data);
		}
		return data;
	}
	public int getGeeMana(){
		return this.geemana;
	}
	
	public int getThauMana() {
		return this.mana;
	}
	public int getFieMana(){
		return this.fiemana;
	}
	public boolean useMana(int mana, int geemana, int fiemana, int doumana, int endermana, int siemana){
		if(this.mana >= mana && this.geemana >= geemana && this.fiemana >= fiemana && this.endermana >= endermana && this.siemana >= siemana && this.doumana >= doumana){
			this.mana -= mana;
			this.geemana -= geemana;
			this.fiemana -= fiemana;
			this.doumana -= doumana;
			this.endermana -= endermana;
			this.siemana -= siemana;
			this.markDirty();
			return true;
		}
		else{
			return false;
		}
		
	}
	public void setMana(int mana, int geemana, int fiemana, int doumana, int endermana, int siemana){
		this.mana = mana;
		this.geemana = geemana;
		this.fiemana = fiemana;
		this.doumana = doumana;
		this.endermana = endermana;
		this.siemana = siemana;
		this.markDirty();
		
	}
	

	public void editMana(int mana, int geemana, int fiemana, int doumana, int endermana, int siemana){
		this.mana += mana;
		this.geemana += geemana;
		this.fiemana += fiemana;
		this.doumana += doumana;
		this.endermana += endermana;
		this.siemana += siemana;
		this.markDirty();
	}
	public void addMage(EntityUndeadMage mage){
		undeadMages.add(mage);
		markDirty();
	}

}
