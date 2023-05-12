import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner (System.in);

        // Entrada
        System.out.println("Insira a base do quadrado");
        double base = teclado.nextDouble();
        System.out.println("Insira a altura do quadrado");
        double altura = teclado.nextDouble();
        
        double area = base * altura ;
        double dobrodaArea =  2 * area; 

        // Processamento
        // Saida

        System.out.printf("O valor da Área calculada é de %.2f e Dobro da área é %.2f",area,dobrodaArea);
    }
}
