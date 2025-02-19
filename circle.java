public class circle extends shape{

    public circle(String figure) {
        super(figure);
    }

    void input(){
        System.out.println("Введите радиус:");
        r = sc.nextInt();
    }
    @Override
    public double perimeter(){
        P = 2 * Pi * r;
        System.out.println("Периметр вашей фигуры - " + figure + ", равен " + P);
        return P;
    }
    public double area(){
        S = Pi * Math.pow(r, 2);
        System.out.println("Площадь вашей фигуры - " + figure + ", равна " + S);
        return S;
    }
}
