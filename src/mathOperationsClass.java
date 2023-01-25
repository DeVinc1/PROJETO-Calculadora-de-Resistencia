public class mathOperationsClass{
    
    //Função para calcular a resistência equivalente na associação em paralelo de dois resistores.
    public double equivalenciaParalelaDupla(double R1,  double R2){
        return (R1 * R2) / (R1 + R2);
    } 

    //Função para calcular a resistencia equivalente na associação em paralelo de resistores.
    public double equivalenciaParalela(double R1){
        return 1 / R1;
    }

    //Função para calcular a resistencia equivalente na associação em sequência de resistores.
}
