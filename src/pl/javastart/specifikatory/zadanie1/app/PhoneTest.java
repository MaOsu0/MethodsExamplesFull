package pl.javastart.specifikatory.zadanie1.app;

import pl.javastart.specifikatory.zadanie1.model.Telephone;
import pl.javastart.specifikatory.zadanie1.logic.Charger;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.printInfo());
        Charger charger = new Charger();

        charger.chargeBatteryBy1(telephone);
        charger.chargeBatteryBy5(telephone);
        charger.chargeBatteryBy5(telephone);
        charger.chargeBatteryBy5(telephone);
        charger.chargeBatteryBy5(telephone);
        charger.chargeBatteryBy5(telephone);


    }
}
