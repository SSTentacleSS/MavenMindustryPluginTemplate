package tentacle.mindustry.example;

import arc.Events;
import arc.util.CommandHandler;
import arc.util.Log;
import mindustry.Vars;
import mindustry.game.EventType;
import mindustry.gen.Call;
import mindustry.gen.Groups;
import mindustry.mod.Plugin;

public class Main extends Plugin {

    /**
     * who really needs to run the plugin without a server?
     */
    public static void main(String[] args) {
        throw new Error("This plugin cannot be run outside the server!");
    }

    /**
     * It is recommended not to use the constructor due to multiple
     * multiple construct calls and possible errors when loading server
     */
    public Main() {}

    @Override
    public void init() {
        Events.on(EventType.PlayerJoin.class, (event) -> {
            String playerConnectMessage = event.player.name + " connected!";
            
            Log.info(playerConnectMessage);
            Call.sendMessage(playerConnectMessage);
        });

        Events.on(EventType.PlayerLeave.class, (event) -> {
            String playerConnectMessage = event.player.name + " disconnected!";
            
            Log.info(playerConnectMessage);
            Call.sendMessage(playerConnectMessage);
        });

        Log.info("Plugin Loaded!");
        Log.info(Vars.state.toString()); // Vars - global storage of game data constants, tiles, server kernel, map, etc
        Log.info(Groups.unit.size()); // Groups - global storage of players, units, weather, etc 
    }

    @Override
    public void registerClientCommands(CommandHandler handler) {
        handler.register("ping", "Pong!", (runner, a) -> {
            
        });
    }
}