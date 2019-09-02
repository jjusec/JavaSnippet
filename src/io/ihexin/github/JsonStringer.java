/*
 * Copyright (c) 2019. IHEXON
 * Simple json Stringer
 */

package io.ihexin.github;

public class JsonStringer {
	protected StringBuilder json = new StringBuilder(100);
	protected boolean isEmpty = true;

	public JsonStringer() {
		this.json.append("{\n  ");
	}

	public void add(String name, String value) {
		if (!this.isEmpty) {
			this.json.append(",\n  ");
		} else {
			this.isEmpty = false;
		}

		this.json.append("\"").append(name).append("\":\"").append(value.replace("\\", "\\\\").replace("\"", "\\\"").replace("\t", "\\t").replace("\r", "\\r").replace("\n", "\\n")).append("\"");
	}

	public int length() {
		return this.json.length();
	}

	public String toString() {
		return this.json.toString() + "\n}\n";
	}

	// TestCode
	public static void main(String[] args) {
		JsonStringer json = new JsonStringer();
		// append some key and data
		json.add("Name", "IHEXON");
		json.add("OS", "ArchLinux");
		json.add("Skill", "C++/C JAVA Linux Programmer");

		// Print json as string
		String res = json.toString();
		System.out.println(res);
	}
}
