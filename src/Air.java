public class Air extends Transport implements Information {
    private int sweep;
    private int length;

    public Air(int power, int speed, int weight, String brand, int sweep, int length) {
        super(power, speed, weight, brand);
        this.sweep = sweep;
        this.length = length;
    }

    public Air () {

    }

    public int getSweep() {
        return sweep;
    }

    public void setSweep(int sweep) {
        this.sweep = sweep;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public void information() {
        System.out.println("Мощность: " + getPower() +" л/с, Максимальная скорость: " + getSpeed() + " км/ч, Масса: "
                + getWeight() + " кг, Марка: " + getBrand() + " Размах крыльев: " + getSweep() +
                ", Длина взлётно-посадочной полосы:" + getLength() + ", Мощность: " + power() + " кВ.");
    }

    @Override
    public double power() {
        return (double) getPower() * 0.74;
    }
}

