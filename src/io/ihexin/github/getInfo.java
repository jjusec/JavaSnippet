/*
 * Copyright (c) 2019. IHEXON
 * Simple class used to get system information.
 */

package io.ihexin.github;

public class getInfo {

	// get running jre version
	public String getJreVersion(){
		String jre=null;
		jre = System.getProperty("java.version");
		return jre;
	}
	// get os name
	public String getOsName(){
		String host_os=null;
		host_os = System.getProperty("os.name");
		return host_os;
	}
	// get environment vars
	public String getEnv(String cmd){
		String res=null;
		res=System.getenv(cmd);
		return res;
	}


	//TestCode
	public static void main(String[] args) {
		System.out.println("OS:" + new getInfo().getOsName());
		System.out.println("JRE VERSION:" + new getInfo().getJreVersion());
		System.out.println("PATH:"+ new getInfo().getEnv("PATH"));
		System.out.println("PWD :"+ new getInfo().getEnv("PWD"));

	}
}
