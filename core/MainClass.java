package core;

public class MainClass extends JavaPlugin{
	public void onEnable()
	{
		System.out.println("Ladowanie core...");
		this.saveDefaultConfig();
	}
	public void onDisable()
	{
		System.out.println("Wylaczanie core...");
	}
	List<String> help = this.getConfig().getStringList("help");
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		Player p = (Player) sender;
    if(cmd.getName().equalsIgnoreCase("help")){
			sender.sendMessage(help);					
		}
    if(cmd.getName().equalsIgnoreCase("gamemode")){
      if(args.length==0){
      p.sendMessage(this.getConfig().getString("usage").replace("{USAGE}", "/gamemode <tryb> [gracz]").replace("&", "§"));
      
      }
      if(args.length==1){
        if(args[0].equals(0) | args[0].equalsIgnoreCase("s")){
          p.setGameMode(GameMode.SURVIVAL);
          p.sendMessage(this.getConfig().getString("gamemodeMSG").replace("{GAMEMODE}", "SURVIVAL").replace("&", "§"));
        }
	if(args[0].equals(1) | args[0].equalsIgnoreCase("c")){
          p.setGameMode(GameMode.SURVIVAL);
          p.sendMessage(this.getConfig().getString("gamemodeMSG").replace("{GAMEMODE}", "CREATIVE").replace("&", "§"));
        }
	if(args[0].equals(2) | args[0].equalsIgnoreCase("a")){
          p.setGameMode(GameMode.SURVIVAL);
          p.sendMessage(this.getConfig().getString("gamemodeMSG").replace("{GAMEMODE}", "ADVENTURE").replace("&", "§"));
        }
      }
    }
	}
	
	}
