package service;

import org.apache.flink.api.common.functions.MapFunction;
import org.json.JSONObject;

public class JsonParser implements MapFunction<String, String>{

    @Override
    public String map(String jsonString) throws Exception {
        System.out.println("json String "+jsonString);
        JSONObject jsonObject = new JSONObject(jsonString);
        String field1 = jsonObject.getString("personal");
        System.out.print("json field "+ field1);
        return field1;
    }
}
