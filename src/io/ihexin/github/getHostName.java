/*
* Simple method used to Get Host name
 */

package io.ihexin.github;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class getHostName {

	private String host = null;

	public getHostName() {

		// try InetAddress.LocalHost first;
		// NOTE -- InetAddress.getLocalHost().getHostName() will not work !!
		try {
			String res = InetAddress.getLocalHost().getHostName();
			if (res != null && ! res.isEmpty()) {
				host = res;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}


	// TestCode
	public static void main(String[] args) {
		System.out.println("Host Name:"+new getHostName().host);
	}

}
