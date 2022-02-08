package pl.javastart.specifikatory.zadanie2.model;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
            }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

    public void printInfo (int x, int y) {
        System.out.println("Współrzędne punktu X: " + this.x + " " + "Y: " + this.y);
    }

    public void printInfoAfterChange (int x, int y) {
        System.out.println("Po zmianie współrzędne punktów X: " + this.x + " " + "Y: " + this.y);
    }
}
