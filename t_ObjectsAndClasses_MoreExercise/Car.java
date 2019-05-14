package u_ObjectsAndClasses_MoreExercise;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires = new ArrayList<>();
    private double averageTirePressure;


    public Car(String model, Engine engine, Cargo cargo, Tire tire1, Tire tire2
            , Tire tire3, Tire tire4) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        tires.add(tire1);
        tires.add(tire2);
        tires.add(tire3);
        tires.add(tire4);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Tire getTire(int index) {
        return tires.get(index);
    }

    public void setTire(Tire tire, int index) {
        tires.add(index, tire);
    }

    public double getAverageTirePressure(List<Tire> tires) {
        double totalPressure = 0;

        for (Tire tire : tires) {
            totalPressure += tire.getTirePressure();
        }

        double averageTirePressure = totalPressure / 4;

        return averageTirePressure;
    }

    public void setAverageTirePressure(double averageTirePressure) {
        this.averageTirePressure = averageTirePressure;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }
}
