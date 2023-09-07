package demo.practice.minecraftmod;

import demo.practice.minecraftmod.init.BlockInit;
import demo.practice.minecraftmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PracticeMod.MODID)
public class PracticeMod {
    public static final String MODID = "practicemod";

    public PracticeMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }

}
