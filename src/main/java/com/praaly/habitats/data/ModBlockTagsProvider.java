package com.praaly.habitats.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;

public class ModBlockTagsProvider extends ForgeBlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, existingFileHelper);
    }
}
