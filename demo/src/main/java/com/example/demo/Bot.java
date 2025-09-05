package com.example.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Dictionary;
import java.util.Enumeration;

public class Bot {
    private final String alphabet="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    Dictionary<String, Double> probability = new Hashtable<>();

    private void setProbability(){
        probability.put("а",0.08);
        probability.put("б",0.0159);
        probability.put("в",0.0454);
        probability.put("г",0.0170);
        probability.put("д",0.0298);
        probability.put("е",0.0845);
        probability.put("ё",0.0004);
        probability.put("ж",0.0094);
        probability.put("з",0.0165);
        probability.put("и",0.0735);
        probability.put("й",0.0121);
        probability.put("к",0.0349);
        probability.put("л",0.0440);
        probability.put("м",0.0321);
        probability.put("н",0.0670);
        probability.put("о",0.1097);
        probability.put("п",0.0281);
        probability.put("р",0.0473);
        probability.put("с",0.0547);
        probability.put("т",0.0626);
        probability.put("у",0.0262);
        probability.put("ф",0.0026);
        probability.put("х",0.0097);
        probability.put("ц",0.0048);
        probability.put("ч",0.0144);
        probability.put("ш",0.0073);
        probability.put("щ",0.0036);
        probability.put("ъ",0.0004);
        probability.put("ы",0.0190);
        probability.put("ь",0.0174);
        probability.put("э",0.0032);
        probability.put("ю",0.0064);
        probability.put("я",0.0201);
    }
    public Bot(){
        System.out.println(alphabet);
        setProbability();
    }
    public String getNextLetter(){
        ArrayList<String> res;
        Enumeration<String> k = probability.keys();

        while (k.hasMoreElements()) {
            String key = k.nextElement();
            int code = (int) key.charAt(0);
            System.out.println("Key: " + key +" code: "+code+ ", Value: " + probability.get(key));
        }

        return "12";
    }
}
