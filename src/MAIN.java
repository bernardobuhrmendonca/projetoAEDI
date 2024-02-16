import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique a opção desejada.");
        System.out.println("1 - Determinar se 10 números são divisíveis por 5 e 7.");
        System.out.println("2 - Determinar dentre 10 números indicados quais são ímpares.");
        System.out.println("3 - Determinar o quadrado dos 10 números indicados.");
        System.out.println("4 - Determinar quais dos 10 números indicados são divisores da soma total.");
        System.out.println("5 - Determinar quais dos 10 nnúmeros indicados são pares.");
        System.out.println("0 - Fechar menu.");
        int valor = teclado.nextInt();
        switch (valor){
            case 1: CLASSE1.classe1(); break;
            case 2: CLASSE2.classe2(); break;
            case 3: CLASSE3.classe3(); break;
            case 4: CLASSE4.classe4(); break;
            case 5: CLASSE5.classe5(); break;
            case 0: break;
            default: System.out.println("Opção inválida."); break;
        }
    }
}
