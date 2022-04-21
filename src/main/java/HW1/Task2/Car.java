package HW1.Task2;

abstract class Car {
    private String name;
    private String color;
    private Engine engine;

    public Car(String name, String color, Engine engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    abstract void open();

    abstract void close();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}