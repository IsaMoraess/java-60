import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
Exemplos:
Entrada: Saída:
-10 NEGATIVO
Entrada: Saída:
8 NAO NEGATIVO
Entrada: Saída:
0 NAO NEGATIVO */
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número inteiro:");
    int num = sc.nextInt();
    if(num <= -10){
        System.out.println("Esse numero e negativo. " +num);
    }else if(num >0){
        System.out.println("Esse número não e negativo. " +num);
    }else{
        System.out.println("Esse número não e negativo. " +num);
    }
    }
}
