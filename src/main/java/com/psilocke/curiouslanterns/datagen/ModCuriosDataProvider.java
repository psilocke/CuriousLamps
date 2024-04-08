package com.psilocke.curiouslanterns.datagen;

import com.psilocke.curiouslanterns.CuriousLanterns;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import top.theillusivec4.curios.api.CuriosDataProvider;

public class ModCuriosDataProvider extends CuriosDataProvider {

	public ModCuriosDataProvider(GatherDataEvent event) {
		super(CuriousLanterns.MOD_ID, event.getGenerator().getPackOutput(), event.getExistingFileHelper(), event.getLookupProvider());
	}

	@Override
	public void generate(Provider registries, ExistingFileHelper fileHelper) {
		// TODO Auto-generated method stub
		this.createSlot("belt").size(1);
	}

}
