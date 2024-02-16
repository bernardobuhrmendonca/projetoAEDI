import java.util.Scanner;

public class CLASSE2 {
    public static void classe2(){
        Scanner teclado = new Scanner(System.in);
        int[] vet = new int[10];
        for (int aux=0; aux< vet.length; aux++){
            System.out.println("Indique um número inteiro.");
            vet[aux] = teclado.nextInt();
        }
        System.out.println("Números impares:");
        for (int aux=0; aux< vet.length; aux++){
            if (vet[aux]%2!=0){
                System.out.println(vet[aux]);
            }
        }
        teclado.close();
    }
}
