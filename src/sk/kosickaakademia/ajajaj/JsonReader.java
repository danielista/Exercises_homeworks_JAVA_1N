package sk.kosickaakademia.ajajaj;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.Reader;


public class JsonReader {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();


        try {
            Reader reader = new FileReader("resource/wikiDataId.json");
            JSONObject object = (JSONObject) parser.parse(reader);
            JSONArray data = (JSONArray) object.get("data");

                for (int i = 0; i < data.size(); i++){
                    JSONObject temp = (JSONObject) data.get(i);
                    String city = (String) temp.get("city");
                    System.out.println("City: " + city);
                    String region = (String) temp.get("region");
                    System.out.println("Region: " + region);
                    String wikiDataID = (String) temp.get("wikiDataId");
                    System.out.println("Wiki Data: " + wikiDataID);
                    double latitude = (double) temp.get("latitude");
                    double longitude = (double) temp.get("longitude");
                    System.out.println("Latitude : " + latitude + "\n" + "Longitude: " + longitude);
                    System.out.println("-----------------------------------------");
                }


            } catch (Exception e) {
                e.printStackTrace();
            }


    }
}