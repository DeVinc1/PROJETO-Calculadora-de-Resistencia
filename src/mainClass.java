import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) throws Exception {

        mathOperationsClass operacoes = new mathOperationsClass();
        Scanner input = new Scanner(System.in);

        char continuar = 'z';
        double resistenciaEquivalente = 0;

        //Loop para calcular a resistencia equivalente de um circuito qualquer.
        while(continuar != 'n'){

            System.out.println("Qual a associação de resistores que será tratada \n" +  
            "\t a. Associação de resistores em sequência." +
            "\t b. Associação de resistores em paralelo.");
        }
        input.close();

    }
}
