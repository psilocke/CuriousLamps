package com.psilocke.curiouslanterns.datagen;

import com.psilocke.curiouslanterns.CuriousLanterns;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CuriousLanterns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
	private DataGenerators() {}

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		
		ModBlockTagsProvider blockTags = new ModBlockTagsProvider(event);
		
		gen.addProvider(true, new ModCuriosDataProvider(event));
		gen.addProvider(event.includeServer(), blockTags);
		gen.addProvider(true, new ModItemTagsProvider(event, blockTags));
	}
}
