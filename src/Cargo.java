public class Cargo extends Terrestrial implements Information{
    private int capacity;

    public Cargo(int power, int speed, int weight, String brand, int wheel, int fuel, int capacity) {
        super(power, speed, weight, brand, wheel, fuel);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void capacity(int cargo) {
        if (cargo <= getCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    public void information() {
        System.out.println("Мощность: " + getPower() +" л/с, Максимальная скорость: " + getSpeed() + " км/ч, Масса: "
                + getWeight() + " кг, Марка: " + getBrand() + ", Количество колёс: " + getWheel() + ", Расход топлива: "
                + getFuel() + " л/100 км, Грузоподъёмность: " + getWheel() + ", Мощность: " + power() + " кВ.");
    }

    @Override
    public double power() {
        return (double) getPower() * 0.74;
    }
}
