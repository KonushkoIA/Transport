public class Passenger extends Terrestrial implements Information{
    private String body;
    private int passenger;



    public Passenger(int power, int speed, int weight, String brand, int wheel, int fuel, String body, int passenger) {
        super(power, speed, weight, brand, wheel, fuel);
        this.body = body;
        this.passenger = passenger;

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    @Override
    public double power() {
        return (double) getPower() * 0.74;
    }

    @Override
    public void information() {
        System.out.println("Мощность: " + getPower() +" л/с, Максимальная скорость: " + getSpeed() + " км/ч, Масса: "
                + getWeight() + " кг, Марка: " + getBrand() + ", Количество колёс: " + getWheel() + ", Расход топлива: "
                + getFuel() + " л/100 км, Тип кузова " + getBody() + ", Количество пассажиров " + getPassenger() +
                ", Мощность " + power() + " кВ.");
    }

    public void way (double time) {
        double way = (double) getSpeed() * time;
        String v = usedFuel(way);
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + ", двигаясь с максимальной скоростью "
                + getSpeed() + " км/ч проедет " + way + " км и израсходует " + v + " литров топлива.");
    }

    private String usedFuel(double way) {
        double v = (way / 100) * getFuel();
        return String.format("%.2f", v);
    }
}
