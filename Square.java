public class Square extends Shape{
    double a;

    public Square(String figure) {super(figure);}

    @Override
    void input(){
        System.out.println("Введите сторону квадрата:");
        a = sc.nextInt();
    }

    @Override
    public double perimeter(){
        P = a * 4;
        System.out.println("Периметр вашей фигуры - " + figure + ", равен " + P);
        return P;
    }

    @Override
    public double area(){
        S = Math.pow(a, 2);
        System.out.println("Площадь вашей фигуры - " + figure + ", равна " + S);
        return S;
    }
}
