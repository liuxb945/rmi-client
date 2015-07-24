package com.habuma.spitter.client.rmi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.habuma.spitter.service.rmi.HelloService;

public class SpitterRmiClient {

  public void getSpittles() {
	  //helloService.sayHello("smth");
  }

  @Autowired
  HelloService helloService;

}
