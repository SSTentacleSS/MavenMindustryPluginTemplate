# MavenMindustryPluginTemplate

### **Setup**

1. Clone this repository first.
2. Install java (if not already installed).
3. Use './mvnw wrapper:wrapper' in this dirrectory (if you don't have maven installed globally).
4. Configure the parameters in `pom.xml`, <properties> section.
5. Bob’s your uncle!

### **For Visual Studio Code**

1. Go to settings and change following parameters:
* java.eclipse.downloadSources to true
* java.maven.downloadSources to true

2. Open your settings.xml file ~/.m2/settings.xml (create it if it doesn't exist) and  put folowing content:
```
<settings>
    <profiles>
        <profile>
            <id>downloadSources</id>
            <properties>
                <downloadSources>true</downloadSources>
                <downloadJavadocs>true</downloadJavadocs>
            </properties>
        </profile>
    </profiles>

    <activeProfiles>
        <activeProfile>downloadSources</activeProfile>
    </activeProfiles>
</settings>
```

### **Basic Usage**

See `src/tentacle/mindustry/example/Main.java` for some basic commands and event handlers.
Every main plugin class must extend `Plugin`.

### **Building a Jar**

Use `./mvnw clean package` (or use the built-in editors 'task explorer' -> 'package' task).
Output jar should be in `target/name_of_plugin.jar`.

### **Installing**

Simply place the output jar from the step above in your server's `config/mods` directory and restart the server.
List your currently installed plugins/mods by running the `mods` command.