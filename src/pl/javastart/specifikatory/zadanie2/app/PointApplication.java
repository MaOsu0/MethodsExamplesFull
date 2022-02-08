package pl.javastart.specifikatory.zadanie2.app;

import pl.javastart.specifikatory.zadanie2.logic.PointController;
import pl.javastart.specifikatory.zadanie2.model.Point;

import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {
        Point[] points = new Point[5];
        Scanner scanner = new Scanner(System.in);
        PointController pointController = new PointController();

        points[0] = new Point();


        System.out.println("Wybierz wybierz obiekt ze współrzędnymi z zakresu od 0 do " + points.length);
        int pointIndex = scanner.nextInt();

        System.out.println("Nadaj najpierw współrzędną X, a następnie Y");
        points[pointIndex] = new Point(scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();

        System.out.println("Wybierz następującą operację: \"X+\", \"X-\", \"Y+\", \"Y-\"");
        String action = scanner.nextLine();
        pointController.choseAction(action, points[pointIndex]);


    }
}
