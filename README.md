# **MavenMindustryPluginTemplate**

# RoadMap for new release

- [ ] Nothing here yet, but you can fix it by opening your offer in the Pull Requests section!

**Made**:
- [x] Debugger, use `mvn mindustry:debug` for debugging, see [MindustryMavenPlugin](https://github.com/SSTentacleSS/MindustryMavenPlugin) for details.

# Conditionality

* Instead of `mvn` can be used 
    + Windows: `.\\mvnw.cmd`, `.\\mvnw`
    + U*ix: `./mvnw.sh`

# Setup

1. Clone/Use as template this repository first (with **all** branches!).
2. Install java (if not already installed).
3. Configure the `<project><properties></...></...>` in `pom.xml`.
4. (Optional) Use `mvn mindustry:generate-config -Deditor=<editor>`, avilable editors: `vscode`
4. Bob’s your uncle!

**Note!** [plugin.json](https://github.com/SSTentacleSS/MavenMindustryPluginTemplate/blob/release/src/resources/plugin.json) contains templates that are used by maven to substitute from pom.xml, no need to edit plugin.json!

# Basic Usage

See [Main.java](https://github.com/SSTentacleSS/MavenMindustryPluginTemplate/blob/release/src/java/io/github/ss_tentacle_ss/mindustry/example/Main.java) for some basic commands and event handlers.
Every main plugin class must extend `Plugin`.

# Building a Jar

1. Use `mvn clean package`
2. The output file will be in two versions

* `target/name_of_plugin.jar` - working plugin, with the necessary libraries included by the user
* `target/name_of_plugin-lib.jar` - the library, partially incapable of working because it has no required dependencies, is intended for inclusion in another plugin as an "lightweight" optional dependency

# Debugging

Run `mvn mindustry:debug`

# Installing

Simply place the output jar from the step above in your server's `config/mods` directory and restart the server.
List your currently installed plugins/mods by running the `mods` command.



## **A Few Words From the Developer**

This project is completely focused on the convenience of your work when creating a plugin, if you have any ideas or suggestions for improving the code - always happy to hear your ideas, friends.
