public class UnitConv {
    double a;

    double metersToCentimeters(double x) {
        double mToCnConv = x * 100;
        return mToCnConv;
    }

    void printMToCn(double ilośćMetrów) {
        System.out.println(ilośćMetrów + " metrów to " + metersToCentimeters(ilośćMetrów) + " cm");
    }

    void printCnToMm (double ilośćCentymetrów){
        System.out.println(ilośćCentymetrów + " centymetrów to " + (ilośćCentymetrów*10) + " mm");
    }


}
