import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int pararemetroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int pararemetroDois = sc.nextInt();

        try {
            contar(pararemetroUm, pararemetroDois);            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primero");
        }

        sc.close();
    }

    static void contar(int pararemetroUm, int pararemetroDois) throws ParametrosInvalidosException{
        if (pararemetroUm > pararemetroDois) {
            throw new ParametrosInvalidosException();
        }
        
        int contagem = pararemetroDois - pararemetroUm;
        for (int i=1; i<=contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
