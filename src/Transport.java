public class Transport {

    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    @Override
    public String toString() {
        return modelName;
    }

}
