public class mathOperationsClass{
    
    //Função para calcular a resistencia equivalente na associação em paralelo de resistores.
    public double equivalenciaParalela(double R1){
        return 1 / R1;
    }

    //Função para calcular a resistencia equivalente na associação em sequência de resistores.
    public double equivalenciaSequencia(double R1){
        return R1;
    }
}
