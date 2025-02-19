public class Rectangle extends Shape {
    double a, b;

    public Rectangle(String figure) {super(figure);}

    @Override
    void input(){
        System.out.println("Введите сторону a:");
        a = sc.nextInt();
        System.out.println("Введите сторону b:");
        b = sc.nextInt();
    }

    @Override
    public double perimeter(){
        P = 2 * (a + b);
        System.out.println("Периметр вашей фигуры - " + figure + ", равен " + P);
        return P;
    }

    @Override
    public double area(){
        S = a * b;
        System.out.println("Площадь вашей фигуры - " + figure + ", равна " + S);
        return S;
    }
}
