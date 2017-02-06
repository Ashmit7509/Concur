package com.triadofcreation.concur;

import org.slf4j.Logger;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Text;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.triadofcreation.concur.commands.ConcurPluginExecutor;

@Plugin(id = "concur", name = "Concur Ashmit", version = "1.0")
public class Concur {
	
	@Inject
	private Logger logger;
	
	public Logger getLogger() {
		return logger;
	}
	
    @Listener
    public void onInitialize(GameInitializationEvent event)
    {
    	this.getLogger().info("Concur By Ashmit Test Phase Initializing.....");
    	
    	CommandSpec concurCommandSpec = CommandSpec.builder()
    		.description(Text.of("Says Stuff Based on Where Command Entered"))
    		.executor(new ConcurPluginExecutor())
    		.build();
    	
    	Sponge.getCommandManager().register(this, concurCommandSpec, Lists.newArrayList("ashmit", "concur", "ttoc"));
    			
    	
    	this.getLogger().info("Concur By Ashmit Loaded");
    }
}
