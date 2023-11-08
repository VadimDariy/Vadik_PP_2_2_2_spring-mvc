package web.model;

public class Cars {

   private int stateNumber;

   private  String engine;

    private  String model;

    public Cars(int stateNumber, String engine, String model) {
        this.stateNumber = stateNumber;
        this.engine = engine;
        this.model = model;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public String getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "stateNumber=" + stateNumber +
                ", engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
