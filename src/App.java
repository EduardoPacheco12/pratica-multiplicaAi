import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor que deseja: ");
        int valor = input.nextInt();

        System.out.println("Tabela de multiplicação de " + valor);
        System.out.println(valor + " x 1 = " + (valor * 1));
        System.out.println(valor + " x 2 = " + (valor * 2));
        System.out.println(valor + " x 3 = " + (valor * 3));
        System.out.println(valor + " x 4 = " + (valor * 4));
        System.out.println(valor + " x 5 = " + (valor * 5));
        System.out.println(valor + " x 6 = " + (valor * 6));
        System.out.println(valor + " x 7 = " + (valor * 7));
        System.out.println(valor + " x 8 = " + (valor * 8));
        System.out.println(valor + " x 9 = " + (valor * 9));
    }
}
