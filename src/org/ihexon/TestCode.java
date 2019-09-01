package org.ihexon;

import org.ihexon.jjson.JsonStringer;

public class TestCode {

    private static String res;

    private TestCode(){
        JsonStringer json = new JsonStringer();
        json.add ("name", "ihexon");
        json.add ("old", "18");
        json.add ("os", "LINUX");
        res=json.toString();
        System.out.println(res);
    }

    public static void main (String[] args) {
        new TestCode();
    }

}
