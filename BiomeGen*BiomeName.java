package net.minecraft.src;

import java.util.List;

public class BiomeGenFun extends BiomeGenBase {

    public BiomeGenFun(int i) {
        super(i);
        //this removes all friendly/passive mobs
        spawnableCreatureList.clear();
    }
}
