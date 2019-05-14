package u_ObjectsAndClasses_MoreExercise;

public class Tire {
    private double tirePressure;
    private int tireAge;

    public Tire(double tirePressure, int tireAge) {

        this.tirePressure = tirePressure;
        this.tireAge = tireAge;
    }

    public double getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(double tire1Pressure) {
        this.tirePressure = tire1Pressure;
    }

    public int getTireAge() {
        return tireAge;
    }

    public void setTireAge(int tireAge) {
        this.tireAge = tireAge;
    }
}
