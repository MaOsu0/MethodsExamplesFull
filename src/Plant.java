public class Plant {
    String namePlant;
    double waterUsagePlant;
    Plant (String name, double waterUsage){
        namePlant = name;
        waterUsagePlant = waterUsage;
    }

    void printInfo(Plant plantName){
        System.out.println("Roślina " + plantName.namePlant + " zużywa dziennie " + plantName.waterUsagePlant +
                " litrów wody " + " tygodniowo " +(plantName.waterUsagePlant*7) + " litrów wody.");
    }
}
