public class Francisco {

    Integer a;
    Integer b;
    Integer result;

    public Francisco (Integer a, Integer b){
        this.a = a;
        this.b = b;
        this.result = sum(a, b);
    }

    private static Integer sum(Integer n1, Integer n2){
        return n1 + n2;
    }
}
