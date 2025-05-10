import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
            System.out.print("Digite o valor de A:");
                double realA = scanner.nextInt();
            System.out.print("Digite o valor de B:");
                int realB = scanner.nextInt();
            System.out.print("Digite o valor de C:");
                int realC = scanner.nextInt();
                    double delta = Math.pow(2, realB) -4*(realA*realC);
                        System.out.println(delta);
                            double X = (-realB + Math.sqrt(delta))/2*realA ;
                            double xN = (-realB - Math.sqrt(delta))/2*realA ;
                        double expoente = 2;            
                        double base = realA*X;
                            System.out.println(X);
                            System.out.println(xN);
                double resultado = Math.pow(expoente, base) + realB*X + realC;
                System.out.println(realA + ".X°2 " + realB + ".X " + realC + " = 0");
            
    }
}
