package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    public Car(){
        tyres=4;
        doors=4;
    }

    public void displayCharacteristics(){
        System.out.println("color of car is: "+color +"\n"+"transmission is: "+transmission +"\n"+"make is: "+make +"\n"+"tyres are: "+tyres +"\n"+"doors are: " +doors);
    }

    public void accelarate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }



}
