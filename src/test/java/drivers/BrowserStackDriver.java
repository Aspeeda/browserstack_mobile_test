package drivers;

import com.codeborne.selenide.WebDriverProvider;
import lombok.SneakyThrows;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;
//
//public class BrowserStackDriver implements WebDriverProvider{
//    static Config config = ConfigFactory.create(Config.class);


//    @SneakyThrows
//    @Override
//    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
//        MutableCapabilities mutableCapabilities = new MutableCapabilities();
//        mutableCapabilities.merge(capabilities);
//
//        mutableCapabilities.setCapability("app", config.);
//        mutableCapabilities.setCapability("device", config.device());
//        mutableCapabilities.setCapability("os_version", config.osVersion());
//
//        // Set your access credentials
//        mutableCapabilities.setCapability("browserstack.user", config.login());
//        mutableCapabilities.setCapability("browserstack.key", config.password());
//        mutableCapabilities.setCapability("project", config.projectName());
//        mutableCapabilities.setCapability("build", config.buildName());
//        mutableCapabilities.setCapability("name", config.testName());
//
//         Initialise the remote Webdriver using BrowserStack remote URL
//         and desired capabilities defined above
//        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
//    }
//
//    public static URL getBrowserstackUrl() {
//        try {
//            return new URL(config.baseUrl());
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

