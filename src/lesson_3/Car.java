package lesson_3;

public final class Car {
    private final String carName;
    private final String carPrice;

    public Car(String carName, String carPrice) {
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarPrice() {
        return carPrice;
    }
}
