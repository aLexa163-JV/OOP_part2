public class Car extends Transport implements Maintainable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        super.check();
        checkEngine();
    }
}
