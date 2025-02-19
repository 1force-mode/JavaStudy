import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нужную фигуру");
        String shapeType = sc.nextLine();
        switch (shapeType) {
            case "круг" -> {
                Circle Circle = new Circle("круг");
                Circle.input();
                Circle.perimeter();
                Circle.area();
            }
            case "квадрат" -> {
                Square Square = new Square("квадрат");
                Square.input();
                Square.perimeter();
                Square.area();
            }
            case "прямоугольник" -> {
                Rectangle Rectangle = new Rectangle("прямоугольник");
                Rectangle.input();
                Rectangle.perimeter();
                Rectangle.area();
            }
        }

    }
}