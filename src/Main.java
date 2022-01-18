public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(90, 191, 1150, "Skoda", 4, 6, "Лифтбэк", 5);
        passenger.information();
        passenger.way(2.5);
        Cargo cargo = new Cargo(1,1,1,"Skoda",1,1,500);
        cargo.capacity(300);
        cargo.information();
        Civil civil = new Civil(2,2,2,"Skoda",2,2,2,true);
        civil.information();
        civil.passenger(2);
        Military military = new Military(4,3,3,"Skoda", 3,3,false,5);
        military.information();
        military.shot();
        military.bailout();
        Military military1 = new Military();
    }
}
