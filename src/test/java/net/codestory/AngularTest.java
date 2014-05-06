package net.codestory;

import net.codestory.http.*;
import net.codestory.simplelenium.*;

import org.junit.*;

public class AngularTest extends SeleniumTest {
  private WebServer webServer = new WebServer().startOnRandomPort();

  @Override
  public String getDefaultBaseUrl() {
    return "http://localhost:" + webServer.port();
  }

  @Test
  public void display_hello_world() {
    goTo("/");

    // TODO
  }
}
