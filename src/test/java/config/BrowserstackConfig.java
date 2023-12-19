package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties"
})

public interface BrowserstackConfig extends Config {

  @Key("project")
  String getProject();

  @Key("build")
  String getBuild();

  @Key("name")
  String getName();

  @Key("URL")
  String getURL();

}
