import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) throws Exception {

        mathOperationsClass operacoes = new mathOperationsClass();
        Scanner input = new Scanner(System.in);

        //Variaveis usadas no loop
        char continuar = 'y';
        char associacao = 'c';
        int numDeResistores = 0;
        double valorDaResistencia = 0;
        double resistenciaEquivalente = 0;

        //Loop para calcular a resistencia equivalente de um circuito qualquer.
        while(continuar != 'n'){

            System.out.println("Qual a associação de resistores que será tratada: \n" +  
            "\t a. Associação de resistores em sequência. \n" +
            "\t b. Associação de resistores em paralelo.");
            associacao = input.next().charAt(0);

                //Verificar se valor passado pelo usuário em 'associacao' é válido.
                if(associacao != 'a' && associacao != 'b'){
                    System.out.println("Insira um valor válido para a associação de resistores. \n");
                    continue;
                }
            
            System.out.println("Quantos resistores fazem parte da associação: ");
            numDeResistores = input.nextInt();

                //Lógica de cálculo.
                if(associacao == 'a'){

                    for(int i = 1; i <= numDeResistores; i++){
                        System.out.println("\nInsira o valor da resistência do " + i + "º resistor.");
                        valorDaResistencia = input.nextDouble();

                            //Impedindo que valor da resistência seja inválido.
                            if(valorDaResistencia <= 0){
                                System.out.println("O valor da resistência não pode ser negativo ou zero. O resistor será desconsiderado.");
                                continue;
                            }

                        resistenciaEquivalente += operacoes.equivalenciaSequencia(valorDaResistencia);
                    }
                } else{

                    for(int i = 1; i <= numDeResistores; i++){

                        System.out.println("\nInsira o valor da resistência do " + i + "º resistor.");
                        valorDaResistencia = input.nextDouble();

                            //Impedindo que valor da resistência seja inválido.
                            if(valorDaResistencia <= 0){
                                System.out.println("O valor da resistência não pode ser negativo ou zero. O resistor será desconsiderado.");
                                continue;
                            }

                        resistenciaEquivalente += operacoes.equivalenciaParalela(valorDaResistencia);
                    }
                    resistenciaEquivalente = 1/resistenciaEquivalente;
                }
            
            System.out.print("Ainda há resistores no circuito elétrico? \n[Y/n]: ");
            continuar = input.next().charAt(0);
        }
        
        input.close();
        System.out.format("A resistência equivalente do circuito é de %.2f", resistenciaEquivalente, " ohms");
    }
}
