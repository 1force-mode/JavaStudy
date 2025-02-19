public class square extends shape{

    public square(String figure) {super(figure);}

    void input(){
        System.out.println("Введите сторону a:");
        a = sc.nextInt();
    }
    @Override
    public double perimeter(){
        P = a * 4;
        System.out.println("Периметр вашей фигуры - " + figure + ", равен " + P);
        return P;
    }
    public double area(){
        S = Math.pow(a, 2);
        System.out.println("Площадь вашей фигуры - " + figure + ", равна " + S);
        return S;
    }
}
