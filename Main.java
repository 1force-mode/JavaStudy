import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нужную фигуру");
        String shapeType = sc.nextLine();
        switch (shapeType) {
            case "круг" -> {
                circle circle = new circle("круг");
                circle.input();
                circle.perimeter();
                circle.area();
            }
            case "квадрат" -> {
                square square = new square("квадрат");
                square.input();
                square.perimeter();
                square.area();
            }
            case "прямоугольник" -> {
                rectangle rectangle = new rectangle("прямоугольник");
                rectangle.input();
                rectangle.perimeter();
                rectangle.area();
            }
        }

    }
}