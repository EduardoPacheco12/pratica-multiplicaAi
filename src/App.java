import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor que deseja: ");
        int valor = input.nextInt();

        System.out.println("Tabela de multiplicação de " + valor);
        for(int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
        
    }
}
