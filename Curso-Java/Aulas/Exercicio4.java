//Crie um algortimo utilizando os recursos que aprendemos nas aulas anteriores
// para dizer se uma determinada palavra é um palindromo ou não.

import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String palavra = in.next();
        System.out.println("Palindromo : " + palavra);
        StringBuilder toPalindromo = new StringBuilder(palavra);

        if (palavra.equals(toPalindromo.reverse().toString())){
            System.out.println("A palavra  : " + palavra + " eh um palindromo !");
        }else {
            System.out.println("A palavra  : " + palavra + " nao eh um palindromo !");

        }

    }

}
