package com.rays.abc;

import java.net.MalformedURLException;
import java.net.URL;

public class URlExample {
	
	public static void main(String[] args) throws Exception {
		URL u = new URL("https://github.com/namanmeena05");
		
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		
		
		
	}

}
