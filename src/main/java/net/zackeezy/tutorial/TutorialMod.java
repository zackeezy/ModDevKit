package net.zackeezy.tutorial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.zackeezy.tutorial.item.ItemBase;
import net.zackeezy.tutorial.item.ModItems;
import net.zackeezy.tutorial.proxy.*;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

@Mod(modid = TutorialMod.modId, name = TutorialMod.name, version = TutorialMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class TutorialMod {

    public static final String modId = "tutorial";
    public static final String name = "Tutorial Mod";
    public static final String version = "1.0.0";

    public static ItemBase ingotCopper;

    @SidedProxy(serverSide = "net.zackeezy.tutorial.proxy.CommonProxy", clientSide = "net.zackeezy.tutorial.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static TutorialMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
