
public class LucasCandido {

    Integer NumeroUm;
    Integer NumeroDois;
    Integer resultado;

    public LucasCandido(Integer n1, Integer n2){
        this.NumeroUm = n1;
        this.NumeroDois = n2;
        this.resultado = soma(NumeroUm, NumeroDois);
    }

    private static Integer soma(Integer n1, Integer n2){
        return n1 + n2;
    }
}

