package main;

import javax.xml.ws.*;
import ws.*;

public class Main {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:8080/ws/demo", new DemoImpl());
			System.out.println("Connection done");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
