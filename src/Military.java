public class Military extends Air implements Information{
    private boolean bailout;
    private int rocket;

    public Military(int power, int speed, int weight, String brand, int sweep, int length, boolean bailout, int rocket) {
        super(power, speed, weight, brand, sweep, length);
        this.bailout = bailout;
        this.rocket = rocket;
    }

    public Military() {

    }

    public boolean isBailout() {
        return bailout;
    }

    public void setBailout(boolean bailout) {
        this.bailout = bailout;
    }

    public int getRocket() {
        return rocket;
    }

    public void setRocket(int rocket) {
        this.rocket = rocket;
    }

    @Override
    public void information() {
        System.out.println("Мощность: " + getPower() +" л/с, Максимальная скорость: " + getSpeed() + " км/ч, Масса: "
                + getWeight() + " кг, Марка: " + getBrand() + ", Количество ракет: " + getRocket() + ", Наличие системы катапультирования: "
                + isBailout() + ", Мощность: " + power() + " кВ.");
    }

    @Override
    public double power() {
        return (double) getPower() * 0.74;
    }

    public void shot() {
        if (getRocket() > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void bailout() {
        if (isBailout()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
