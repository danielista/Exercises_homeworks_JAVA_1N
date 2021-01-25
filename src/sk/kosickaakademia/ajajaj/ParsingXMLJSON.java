package sk.kosickaakademia.ajajaj;

import org.json.*;

public class ParsingXMLJSON {
    public static void main(String[] args) {

        JSONObject objektik = new JSONObject();
        try {
            objektik.put("player", "jon doe");
            objektik.put("name", "Milian");
            objektik.put("age", "32");
            objektik.put("sport", "hochey");
            objektik.put("active", "true");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONArray pole = new JSONArray();
        pole.put(Boolean.TRUE);
        pole.put("lorem ipsum");

        pole.put(objektik);


        System.out.println(pole);

    }
}
