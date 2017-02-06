package com.triadofcreation.concur.commands;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.source.ConsoleSource;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;

public class ConcurPluginExecutor implements CommandExecutor
{
	@Override
	public CommandResult execute(CommandSource src, CommandContext args) throws CommandException 
	{
		if(src instanceof Player)
		{
			Player player = (Player) src;
			src.sendMessage(Text.of("Hey!You!Yeah You! yeah I meant " + player.getName() + " I am Ashmit.... ALSO BACON!"));
			return CommandResult.success();
		}
		else if (src instanceof ConsoleSource)
		{
			Player player = (Player) src;
			src.sendMessage(Text.of("I See you used console this time " + player.getName() + "but I am Ashmit.. you cannot fool me :3.... ALSO DONUT!"));
			return CommandResult.success();
		}
		else{
			Player player = (Player) src;
			src.sendMessage(Text.of("Ok " + player.getName() + ".. You beat me, Ashmit has Fallen.. I dont know where you are..	"));
		}
		
		return CommandResult.empty();
	}

}
