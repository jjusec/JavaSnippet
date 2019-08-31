package org.ihexon.jjson;
public class JsonStringer {
	
	private StringBuilder json = new StringBuilder(100);
	private boolean isEmpty = true;
	
	private JsonStringer() {
		this.json.append("{\n ");
	}
	
	public void add(String name,String value) {
		if (!this.isEmpty) {
			this.json.append(",\n ");
		}else {
			this.isEmpty = false;
			}
		this.json.append("\"").append(name).append("\":\"").append(
				value.replace("\\", "\\\\").replace("\"", "\\\"").
				replace("\t", "\\t").replace("\r", "\\r").
				replace("\n", "\\n")).append("\"");
	}
	public int length() {
		return this.json.length();
	}
	
	public String toString() {
		return this.json.toString()+"\n}\n";
	}
	
	
	

}
