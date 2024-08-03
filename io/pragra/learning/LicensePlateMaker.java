package io.pragra.learning;

import java.util.HashMap;
import java.util.Map;

public class LicensePlateMaker {
    public static void main(String[] args) {
        HashMap<String,String> licenseMap = new HashMap<>();

        licenseMap.put("DL", "DL4CAF5032");
        licenseMap.put("MH", "MH12DE1433");
        licenseMap.put("KA", "KA03MK1002");
        licenseMap.put("TN", "TN10BC1234");
        licenseMap.put("AP", "AP12BC4321");

        System.out.println("All the License plates: ");
        System.out.println("License plate for Delhi: "+ licenseMap.get("DL"));
        System.out.println("License plate for Maharashtra: "+ licenseMap.get("MH"));
        System.out.println("License plate for Karnataka: "+ licenseMap.get("KA"));
        System.out.println("License plate for TamilNadu: "+ licenseMap.get("TN"));
        System.out.println("License plate for AndraPradesh: "+ licenseMap.get("AP"));

        System.out.println("Fetching all keys: ");

        for(String key : licenseMap.keySet())
        {
            System.out.println(key);
        }

        for(Map.Entry<String,String> entry: licenseMap.entrySet())
        {
            entry.setValue("AAA111");
        }

        System.out.println("Updated Entries:");
        for (Map.Entry<String, String> entry : licenseMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        licenseMap.putIfAbsent("DL", "DL5CAF6063");
        licenseMap.putIfAbsent("GJ", "GJ1HC1234");


        System.out.println("All map entries:");
        for (Map.Entry<String, String> entry : licenseMap.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
