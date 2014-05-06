package net.codestory;

import net.codestory.http.*;

public class AngularServer {
  public static void main(String[] args) {
    new WebServer(routes -> routes
        .get("/hello/:name", (context, name) -> "Hello, " + name.toUpperCase() + "!")
    ).start();
  }
}
