import java.util.Scanner;

public class CLASSE1 {
    public static void classe1() {
        int[] vet = new int[10];
        Scanner teclado = new Scanner(System.in);
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println("indique um número inteiro.");
            vet[aux] = teclado.nextInt();
        }
        System.out.print("Números divisíveis por 5 e 7: ");
        for (int aux = 0; aux < vet.length; aux++) {
            if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0) {
                System.out.println(vet[aux]);
            }
        }
    }
}