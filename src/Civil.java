public class Civil extends Air implements Information{
    private int passenger;
    private boolean business;

    public Civil(int power, int speed, int weight, String brand, int sweep, int length, int passenger, boolean business) {
        super(power, speed, weight, brand, sweep, length);
        this.passenger = passenger;
        this.business = business;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }

    @Override
    public void information() {
        System.out.println("Мощность: " + getPower() +" л/с, Максимальная скорость: " + getSpeed() + " км/ч, Масса: "
                + getWeight() + " кг, Марка: " + getBrand() + ", Количество пассажиров: " + getPassenger() + ", Наличие бизнесс класса: "
                + isBusiness() + ", Мощность: " + power() + " кВ.");
    }

    @Override
    public double power() {
        return (double) getPower() * 0.74;
    }

    public void passenger(int passenger) {
        if (passenger <= getPassenger()) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}
