import java.util.Scanner;

public class CLASSE5 {
    public static void classe5() {
        Scanner teclado = new Scanner(System.in);
        int soma=0, cont=0;
        int[] num = new int[10];
        double media;
        for (int aux=0; aux< num.length; aux++){
            System.out.println("Indique um número inteiro.");
            num[aux] = teclado.nextInt();
        }
        System.out.println("Números pares:");
        for (int aux=0; aux< num.length; aux++){
            if (num[aux]%2==0){
                soma += num[aux];
                cont++;
                System.out.println(num[aux]);
            }
        }
        media =(float) soma / cont;
        if (soma ==0) {
            media = 0;
            System.out.println("Nenhum dos números informados é par.");
        }
        System.out.println("Média: " + media);
        teclado.close();
    }
}

