package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:emulator.properties"
})

public interface EmulatorConfig extends Config {

  @Key("platformName")
  String getPlatformName();

  @Key("platformVersion")
  String getPlatformVersion();

  @Key("deviceName")
  String getDeviceName();

  @Key("appPackage")
  String getAppPackage();

  @Key("appActivity")
  String getAppActivity();

}
