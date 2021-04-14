/*1 - Qual a saida para as operações abaixo? Explique o motivo pelo qual teve esse retorno

        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(0.1 + 0.2 == 0.3);
        false  O operador de comparação possui precedência sobre o operador de adição



        int valor = 10;
        int valorDois = 10;
        System.out.println(++valor == valorDois++);
        false  O operador de comparação possui precedência sobre o operador unário



        2 - Qual a diferença entre o operador && e &
            && E (“logical AND”) a && b
            retorna true se a e b forem ambos true. Senão retorna false. Se a for false, b não é avaliada.

            & E (“boolean logical AND”) a & b
            retorna true se a e b forem ambos true. Senão retorna false. Ambas expressões a e b são sempre avaliadas.

        3 - Qual a diferença entre o operador || e |

            || OU (“logical OR”) a || b
            retorna true se a ou b for true. Senão retorna false. Se a for true, b não é avaliada.

            | OU (“boolean logical inclusive OR”) a | b
            retorna true se a ou b for true. Senão retorna false. Ambas expressões a e b são sempre avaliadas.




*/


class Exercicio3 {

    public static void main(String[] args) {

        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(0.1 + 0.2 == 0.3);


        int valor = 10;
        int valorDois = 10;
        System.out.println(++valor == valorDois++);






    }


}