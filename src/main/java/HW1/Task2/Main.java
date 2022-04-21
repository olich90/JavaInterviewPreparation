package HW1.Task2;

public class Main {
    public static void main(String[] args) {
        LightWeightCar lightWeightCar = new LightWeightCar("green", "VW", new Engine("VW"), 1200);
        lightWeightCar.open();
        lightWeightCar.start();
        lightWeightCar.move();
        lightWeightCar.stop();
        lightWeightCar.close();
        System.out.println(lightWeightCar.getEngine().getModel());

        Lorry lorry = new Lorry("red", "Mann", new Engine("Mann"), 4500);
        lorry.open();
        lorry.start();
        lorry.move();
        lorry.stop();
        lorry.close();
        System.out.println(lorry.getEngine().getModel());
    }
}