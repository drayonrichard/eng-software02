public class Drayon {

    Integer primeroNumero;
    Integer segundoNumero;
    Integer resultado;

    public Drayon (Integer number1, Integer number2){
        this.primeroNumero = number1;
        this.segundoNumero = number2;
        this.resultado = soma(primeroNumero, segundoNumero);
    }

    private static Integer soma(Integer numero1, Integer numero2){
        return numero1 + numero2;
    }
}
