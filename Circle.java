public class Circle extends Shape{
    double r;
    double Pi = 3.14;

    public Circle(String figure) {
        super(figure);
    }

    @Override
    void input(){
        System.out.println("Введите радиус круга:");
        r = sc.nextInt();
    }

    @Override
    public double perimeter(){
        P = 2 * Pi * r;
        System.out.println("Периметр вашей фигуры - " + figure + ", равен " + P);
        return P;
    }

    @Override
    public double area(){
        S = Pi * Math.pow(r, 2);
        System.out.println("Площадь вашей фигуры - " + figure + ", равна " + S);
        return S;
    }
}
