package com.psilocke.curiouslanterns.datagen;


import com.psilocke.curiouslanterns.CuriousLanterns;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;

public class ModBlockTagsProvider extends BlockTagsProvider{

	public ModBlockTagsProvider(GatherDataEvent event) {
		super(event.getGenerator().getPackOutput(), event.getLookupProvider(), CuriousLanterns.MOD_ID, event.getExistingFileHelper());
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addTags(Provider p_256380_) {
		// TODO Auto-generated method stub
		
	}
}
