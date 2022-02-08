package pl.javastart.specifikatory.zadanie1.logic;

import pl.javastart.specifikatory.zadanie1.model.Telephone;

public class Charger {

    private void increaseChargeLevelby1 (Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }

    public void chargeBatteryBy1(Telephone telephone) {
        if (telephone.getChargeLevel() < 100) {
            increaseChargeLevelby1(telephone);
            System.out.println("Telefon po naładowaniu o 1 %");
            System.out.println(telephone.printInfo());
        } else {
            System.out.println("Nie można bardziej nałądować telefonu");
            System.out.println(telephone.printInfo());
        }
    }

    private void increaseChargeLevelby5 (Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel() + 5);
    }

    public void chargeBatteryBy5(Telephone telephone) {
        if (telephone.getChargeLevel() < 96) {
            increaseChargeLevelby5(telephone);
            System.out.println("Telefon po naładowaniu o 5 %");
            System.out.println(telephone.printInfo());
        } else {
            System.out.println("Nie można bardziej nałądować telefonu");
            System.out.println(telephone.printInfo());
        }
    }
}