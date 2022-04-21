package HW1.Task2;

class Lorry extends Car implements Movable {

    int weight;

    public Lorry(String name, String color, Engine engine, int weight) {
        super(name, color, engine);
        this.weight = weight;
    }

    @Override
    void open() {
        System.out.println("Lorry is open");
    }

    @Override
    public void start() {
        System.out.println("Lorry is starting");
    }

    @Override
    public void move() {
        System.out.println("Lorry is moving");
    }

    @Override
    public void stop() {
        System.out.println("Lorry is stopped");
    }

    @Override
    void close() {
        System.out.println("Lorry is closed");
    }
}