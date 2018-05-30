package core.file;

public class Messages{

File messages = new File(Plugin.getDataFolder()+"/messages.yml");
FileConfiguration customConfig = YamlConfiguration.loadConfiguration(messages);
    
    
  public void saveCustomYml(FileConfiguration ymlConfig, File ymlFile) {
    try {
    ymlConfig.save(ymlFile);
      } catch (IOException e) {
      e.printStackTrace();
}
}


}
