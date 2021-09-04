import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ponto A = new Ponto(-3,-11);
        Ponto B = new Ponto(2,1);

        System.out.printf("A distância entre os pontos (A) e (B) é: " + A.calculaDistanciaEntrePontos(B));

        System.out.println(B.verificaQuadrante(2,1));

        System.out.println();

        if(A.comparaPontos(B))
            System.out.printf("As coordenadas de 'A' e 'B' são iguais!");
        else
            System.out.printf("As coordenadas de 'A' e 'B' são diferentes!");

        sc.close();
    }

}
