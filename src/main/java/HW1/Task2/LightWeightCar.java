package HW1.Task2;

class LightWeightCar extends Car implements Movable {

    int weight;

    public LightWeightCar(String name, String color, Engine engine, int weight) {
        super(name, color, engine);
        this.weight = weight;
    }

    @Override
    void open() {
        System.out.println("LightWeightCar is open");
    }

    @Override
    public void start() {
        System.out.println("LightWeightCar is starting");
    }

    @Override
    public void move() {
        System.out.println("LightWeightCar is moving");
    }

    @Override
    public void stop() {
        System.out.println("LightWeightCar is stopped");
    }

    @Override
    void close() {
        System.out.println("LightWeightCar is closed");
    }
}