package com.ajp.laptopshop;

public class Laptop {
    public final long id;
    private String manufacturer;
    private String model;
    private String cpu;
    private String ram;
    private String capacity;
    private String graphics;
    private String screensize;
    private String resolution;
    private String img;
    private Configuration configuration;

    public Laptop(long id, String manufacturer, String model, String cpu, String ram, String capacity, String graphics, String screensize, String resolution, String img, Configuration configuration){
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.capacity = capacity;
        this.graphics = graphics;
        this.screensize = screensize;
        this.resolution = resolution;
        this.img = img;
        this.configuration = configuration;
    }

    public long getId(){
        return this.id;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getModel(){
        return this.model;
    }

    public String getCpu(){
        return this.cpu;
    }

    public String getRam(){
        return this.ram;
    }

    public String getCapacity(){
        return this.capacity;
    }

    public String getGraphics(){
        return this.graphics;
    }

    public String getScreensize(){
        return this.screensize;
    }

    public String getResolution() {
        return resolution;
    }

    public String getImg(){
        return this.img;
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
