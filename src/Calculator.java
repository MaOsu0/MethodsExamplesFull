public class Calculator {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println("Wynik dodawania to: " + calculate.add(5,10));
        System.out.println(calculate.subtract(15,0.5));
        System.out.println(calculate.multiply(5432,1.5));
        calculate.printDivide(10,2);

    }
}
