# **MavenMindustryPluginTemplate**

# RoadMap for new release

- [x] Add mindustry debugger (Added, use `./mvnw mindustry:debug` for debugging, see [MindustryMavenPlugin](https://github.com/SSTentacleSS/MindustryMavenPlugin) for details)
- [x] **Fix "No covered by lifecycle compile" error**

# Setup

1. Clone this repository first.
2. Install java (if not already installed).
3. Use './mvnw wrapper:wrapper' in this dirrectory (if you don't have maven installed globally).
4. Configure the parameters in `pom.xml`, <properties> section.
5. Bob’s your uncle!

**Note!** `src/resources/plugin.json` contains templates that are used by maven to substitute from pom.xml, no need to edit plugin.json!

# Basic Usage

See `src/tentacle/mindustry/example/Main.java` for some basic commands and event handlers.
Every main plugin class must extend `Plugin`.

# Building a Jar

Use `./mvnw clean package` or `mvn clean package` (if you have maven installed globally) or the built-in editors 'task explorer' -> 'package' task.
The output file will be in two versions

* `target/name_of_plugin.jar` - working plugin, with the necessary libraries included by the user
* `target/name_of_plugin-lib.jar` - the library, partially incapable of working because it has no required dependencies, is intended for inclusion in another plugin as an "lightweight" optional dependency

# Debugging

run `./mvnw mindustry:debug` or `mvn mindustry:debug` (if you have maven installed globally)

# Installing

Simply place the output jar from the step above in your server's `config/mods` directory and restart the server.
List your currently installed plugins/mods by running the `mods` command.



## **A Few Words From the Developer**

This project is completely focused on the convenience of your work when creating a plugin, if you have any ideas or suggestions for improving the code - always happy to hear your ideas, friends.
