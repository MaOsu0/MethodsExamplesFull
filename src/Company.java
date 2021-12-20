public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee("imię1", "nazwisko1", 2000, 1);

        PrintEmployee printEmployee1 = new PrintEmployee();

        printEmployee1.printEmployee(employee1);


//        Employee pracownik1 = new Employee("imię 1",);
//        pracownik1.firstName = "Imię 1";
//        pracownik1.lastName = "NAzwisko 1";
//        pracownik1.bornYear = 2000;
//        pracownik1.seniority = 1;
//
//        System.out.println("Imię " + pracownik1.firstName + " nazwisko " + pracownik1.lastName);
    }
}
