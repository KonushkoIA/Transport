public class Terrestrial extends Transport implements Information{
    private int wheel;
    private int fuel;

    public Terrestrial(int power, int speed, int weight, String brand, int wheel, int fuel) {
        super(power, speed, weight, brand);
        this.wheel = wheel;
        this.fuel = fuel;
    }



    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void information() {
        System.out.println("Мощность: " + getPower() +" л/с, Максимальная скорость: " + getSpeed() + " км/ч, Масса: "
                + getWeight() + " кг, Марка: " + getBrand() + ", Количество колёс: " + getWheel() + ", Расход топлива: "
                + getFuel() + " л/100 км, Мощность " + power() + " кВ.");
    }

    @Override
    public double power() {
        return (double) getPower() * 0.74;
    }
}
