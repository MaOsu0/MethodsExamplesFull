package pl.javastart.specifikatory.zadanie2.logic;

import pl.javastart.specifikatory.zadanie2.model.Point;


public class PointController {

    public void addX(Point points) {
        points.printInfo(points.getX(), points.getY());
        System.out.println("Wartość X zwiększona o 1");
        points.setX(points.getX() + 1);
        points.printInfoAfterChange(points.getX(), points.getY());
    }

    public void addY(Point points) {
        points.printInfo(points.getX(), points.getY());
        System.out.println("Wartość Y zwiększona o 1");
        points.setY(points.getY() + 1);
        points.printInfoAfterChange(points.getX(), points.getY());
    }

    public void minusX(Point points) {
        points.printInfo(points.getX(), points.getY());
        System.out.println("Wartość X zmniejszona o 1");
        points.setX(points.getX() - 1);
        points.printInfoAfterChange(points.getX(), points.getY());;
    }

    public void minusY(Point points) {
        points.printInfo(points.getX(), points.getY());
        System.out.println("Wartość Y zmniejszona o 1");
        points.setY(points.getY() - 1);
        points.printInfoAfterChange(points.getX(), points.getY());
    }

    public void choseAction (String action, Point point) {
        switch (action) {
            case "X+":
                System.out.println("Wybrano X+");
                addX(point);
                break;
            case "X-":
                System.out.println("Wybrano X-");
                minusX(point);
                break;
            case "Y+":
                System.out.println("Wybrano Y+");
               addY(point);
                break;
            case "Y-":
                System.out.println("Wybrano Y-");
                minusY(point);
                break;
            default:
                System.out.println("Nie poprawny zapis operacji");
        }


    }


}
