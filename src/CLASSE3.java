import java.util.Scanner;

public class CLASSE3 {
    public static void classe3() {
        Scanner teclado = new Scanner(System.in);
        int[] vet = new int[10];
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println("Indique um número inteiro.");
            teclado.nextInt();
        }
        System.out.println("O quadrado destes números são:");
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println(vet[aux] + "=" + Math.pow(vet[aux], 2));
        }
        teclado.close();
    }
}
