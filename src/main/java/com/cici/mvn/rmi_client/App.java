package com.cici.mvn.rmi_client;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spitter.client.rmi.SpitterRmiClient;
import com.habuma.spitter.domain.Spittle;
import com.habuma.spitter.service.rmi.HelloService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException, RemoteException, NotBoundException
    {
    	ApplicationContext ctx = 
		        new ClassPathXmlApplicationContext("rmi-client-context.xml");
		
        System.out.println( "Hello World!" );
        HelloService service=(HelloService) ctx.getBean("helloService");
        Spittle sp=service.sayHello("kkk");
        System.out.println(sp.getWhen());
    }
}
