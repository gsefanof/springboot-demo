package ru.homecredit.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String index() {
    return "Hello from IBS-MC-DEMO Spring Boot!";
  }

  @RequestMapping("/info2")
  public String info2() {
    return "Hostname info: " + getClientHost();
  }

  private String getClientHost() {
    InetAddress addr = null;
    try {
      addr = InetAddress.getLocalHost();
    } catch (UnknownHostException ex) {
      System.out.println("Error: " + ex);
    }

    return ((addr != null) ? addr.getHostName() + "  :  " + addr.getHostAddress() : " Network is unreachable ");
  }

}