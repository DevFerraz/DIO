public class Ex1 {
    public int soma(int x, int y){
        return x + y;
    }
    public int subtracao(int x, int y){
        return x - y;
    }
    public int multiplicacao(int x, int y){
        return x * y;
    }
    public double divisao(double x, double y){
        if(y <= 0){
            return 0;
        }else {
            return x / y;
        }
    }
}
