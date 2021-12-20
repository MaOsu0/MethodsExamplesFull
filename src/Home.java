public class Home {
    double waterHome;
    double fuelHome;

    Home (double water, double fuel){
        waterHome = water;
        fuelHome = fuel;
    }

    void printTakeShower(){
        System.out.println("W domu jest " + waterHome + " litrów wody i " + fuelHome + " litrów paliwa");
        System.out.println("Bierzemy prysznic i pozostało " + (waterHome = waterHome - 48) + " l wody, oraz " +
                fuelHome + " paliwa");

    }

    void printTakeBath (){
        System.out.println("W domu jest " + waterHome + " litrów wody i " + fuelHome + " litrów paliwa");
        System.out.println("Bierzemy kąpiel i pozostało " + (waterHome = waterHome - 86) + " l wody, oraz " +
                fuelHome + " paliwa");
    }

    void printwatchTv (int hours){
        System.out.println("W domu jest " + waterHome + " litrów wody i " + fuelHome + " litrów paliwa");
        System.out.println("Przez " + hours + " godzin oglądany jest TV zużywający " + (hours*0.06) +
                " litrów paliwa. Pozostało " + (fuelHome - (hours*0.06)) + " litrów paliwa");
    }
}
