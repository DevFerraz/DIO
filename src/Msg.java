public class Msg {
    public static void msg(int x){
        if(x > 5 && x < 12){
            System.out.println("Bom dia!");
        } else if (x >= 12 && x < 18) {
            System.out.println("Boa tarde!");
        } else if (x >= 18 && x < 24) {
            System.out.println("Boa noite!");
        }else {
            System.out.println("Boa madrugada!");
        }
    }
}
