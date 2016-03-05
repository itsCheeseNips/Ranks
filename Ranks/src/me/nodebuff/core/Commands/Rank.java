
package me.nodebuff.core.Commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Rank  implements CommandExecutor {
	public ArrayList<String> owner = new ArrayList<String>();
	public ArrayList<String> admin = new ArrayList<String>();
	public ArrayList<String> jradmin = new ArrayList<String>();
	public ArrayList<String> srmod = new ArrayList<String>();
	public ArrayList<String> jrmod = new ArrayList<String>();
	public ArrayList<String> hhelper = new ArrayList<String>();
	public ArrayList<String> helper = new ArrayList<String>();
	public ArrayList<String> mod = new ArrayList<String>(); 
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.AQUA + "[!]" + ChatColor.GRAY + " This command is for players only!");
			return true;
		}
		if (commandLabel.equalsIgnoreCase("ranks")) {
			Player p = (Player) sender;
			if (args.length == 0);
					sender.sendMessage(
							ChatColor.AQUA + "[!]" + ChatColor.GRAY + " lolgg!");

			@SuppressWarnings("deprecation")
			Player t = Bukkit.getPlayer(args[0]);
			if (t == null) {
				p.sendMessage(ChatColor.RED + "No player online found.");

				return true;
			}
			if (args[1].equalsIgnoreCase("owner")) {
				owner.add(Player.class.getName());

				if (args[1].equalsIgnoreCase("admin")) {
					admin.add(Player.class.getName());

					if (args[1].equalsIgnoreCase("jradmin")) {
						jradmin.add(Player.class.getName());
					}
					if (args[1].equalsIgnoreCase("srmod")) {
						srmod.add(Player.class.getName());
					}
					if (args[1].equalsIgnoreCase("jrmod")) {
						srmod.add(Player.class.getName());
					}
					if (args[1].equalsIgnoreCase("HHelper")) {
						hhelper.add(Player.class.getName());
					}
					if (args[1].equalsIgnoreCase("Helper")) {
						helper.add(Player.class.getName());
						p.
					}

				}

			}

		}

		return false;
	}
}