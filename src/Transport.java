public class Transport implements Maintainable {

    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    @Override
    public String toString() {
        return modelName;
    }

    @Override
    public void check() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
