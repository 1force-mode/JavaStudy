/*Иерархия фигур:
Создайте базовый класс Shape с наследниками — круг (Circle), квадрат (Square) и прямоугольник (Rectangle).
Каждый подкласс должен иметь методы для расчета площади и периметра.*/

//Формула расчета периметра круга: C = 2 · π · r, где C это периметр, r – радиус, π – число пи.
//Площадь круга определяется по формуле S = π ⋅ r^2.

//Периметр квадрата сторону (a) * 4
//Площадь квадрата (a)^2

//Периметр прямоугольника P = 2 ∙ (a + b), где a и b — длины сторон прямоугольника
//Площадь прямоугольника S = a * b

import java.util.Scanner;

public class Shape {
        Scanner sc = new Scanner(System.in);
        String figure;
        double P;
        double S;

        public Shape(String figure){
                this.figure = figure;
        }

        void input(){
                System.out.println("Введите значение:");
        }

        public double perimeter(){
                return 0;
        }

        public double area(){
                return 0;
        }
}
