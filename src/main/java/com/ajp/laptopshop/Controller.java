package com.ajp.laptopshop;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.net.URL;
import java.util.ArrayList;

@RestController
public class Controller {

    private ArrayList<Laptop> laptops;

    public Controller(){
        laptops = new ArrayList<>();

        Configuration configuration = new Configuration();
        configuration.addConfigOption("ram", new String[]{"8GB DDR4","16GB DDR4","32GB DDR4"});
        configuration.addConfigOption("capacity", new String[]{"120GB","256GB","500GB","1TB"});
        configuration.addConfigOption("screensize", new String[]{"14","15,4","18,4"});

        laptops.add(new Laptop(1, "Asus", "Zenbook UX410UA-GV028T", "Intel Core i5-7200", "8GB DDR4", "256GB", "Intel HD Graphics 620", "14", "1920x1080", "asus.jpeg", configuration));

        configuration = new Configuration();
        configuration.addConfigOption("ram", new String[]{"8GB DDR3","16GB DDR3","32GB DDR3"});
        configuration.addConfigOption("cpu", new String[]{"Intel Core i3-4550HQ","Intel Core i5-4660HQ","Intel Core i7-4770HQ"});
        configuration.addConfigOption("capacity", new String[]{"120GB","256GB","500GB","1TB"});

        laptops.add(new Laptop(2, "Apple", "MacBook Pro Retina", "Intel Core i7-4770HQ", "16GB DDR3", "256GB", "Intel Iris Pro", "15,4", "2880x1800", "mac.png", configuration));

        configuration = new Configuration();
        configuration.addConfigOption("ram", new String[]{"16GB DDR4","32GB DDR4","64GB DDR4"});
        configuration.addConfigOption("graphics", new String[]{"GeForce GTX 980M","GeForce GTX 1050M","GeForce GTX 1080M"});
        configuration.addConfigOption("capacity", new String[]{"256GB","500GB","1TB","2TB"});
        laptops.add(new Laptop(3, "MSI", "Gaming Series GT80", "Intel Core i7-5950HQ", "32GB DDR4", "1TB", "GeForce GTX 980M", "18,4", "1920x1080", "msi.jpeg", configuration));
    }

    @CrossOrigin
    @GetMapping("/laptop")
    public ArrayList<Laptop> laptop(@RequestParam(required = false, defaultValue = "-1") int id){
        ArrayList<Laptop> arr = new ArrayList<>();

        if(id != -1){
            for (Laptop laptop: laptops) {
                if(laptop.getId() == id){
                    arr.add(laptop);
                }
            }
        }else {
            arr = laptops;
        }


        return arr;
    }
}
