package com.ajp.laptopshop;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    public Map<String, String[]> config;

    public Configuration(){
        config = new HashMap<>();
    }

    public void addConfigOption(String name, String[] options){
        config.put(name, options);
    }
}
