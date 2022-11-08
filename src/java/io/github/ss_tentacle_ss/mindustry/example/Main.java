package io.github.ss_tentacle_ss.mindustry.example;

import arc.Events;
import arc.util.CommandHandler;
import arc.util.Log;
import mindustry.Vars;
import mindustry.game.EventType;
import mindustry.gen.Call;
import mindustry.gen.Groups;
import mindustry.gen.Player;
import mindustry.mod.Plugin;

public class Main extends Plugin {

    public Main() {}

    @Override
    public void init() {
        // Warning, method calls cannot be unambiguously determined!
        // Any method can be called before or after init()
        // The only sure way to initialize a plugin is to use the main class constructor!

        Events.on(EventType.PlayerJoin.class, (event) -> {
            String playerConnectMessage = event.player.name + " connected!";
            
            Log.info(playerConnectMessage);
            Call.sendMessage(playerConnectMessage); // Call - class that tell server make something, in this example - send message for all players, that player connected
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
        handler.<Player>register("ping", "Pong!", (args, player) -> {
            player.sendMessage("PONG!!!");
        });
    }

    @Override
    public void registerServerCommands(CommandHandler handler) {
        handler.register("ping", "Pong!", (args) -> {
            Log.info("PONG!!!");
        });
    }
}