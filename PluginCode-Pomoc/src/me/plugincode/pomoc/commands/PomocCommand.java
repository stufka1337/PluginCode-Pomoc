package me.plugincode.pomoc.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PomocCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command arg1, String arg2, String[] arg3) {
		Player p = (Player)s;
		p.sendMessage("1 Linia");
		p.sendMessage("2 Linia");
		p.sendMessage("3 Linia");
		p.sendMessage("4 Linia");
		p.sendMessage("5 Linia");
		p.sendMessage("6 Linia");
		p.sendMessage("7 Linia");
		p.sendMessage("8 Linia");
		p.sendMessage("9 Linia");
		p.sendMessage("10 Linia");
		return false;
	}

}
