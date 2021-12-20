public class Converter {
    public static void main(String[] args) {
        UnitConv unitConv = new UnitConv();
        unitConv.printMToCn(10.0);
        unitConv.printCnToMm(15);

        TimeConv timeConv = new TimeConv();
        timeConv.printTime(14);

    }
}
