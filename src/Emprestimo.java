public class Emprestimo {
    public static void valor(double x) {
        if (x >= 1000 && x < 5000) {
            double tx = 0.05;
            double total = x + x * tx;
            int par = 24;
            double parcela = total / par;
            System.out.println("O valor total sera de: " + total + " em " + par + "x. O valor das parcelas " +
                    "sera de: " + parcela + ". ");
        } else if (x >= 5000 && x < 10000) {
            double tx = 0.04;
            double total = x + x * tx;
            int par = 48;
            double parcela = total / par;
            System.out.println("O valor total sera de: " + total + " em " + par + "x. O valor das parcelas " +
                    "sera de: " + parcela + ". ");

        } else if (x >= 10000 && x <= 20000) {
            double tx = 0.035;
            double total = x + x * tx;
            int par = 60;
            double parcela = total / par;
            System.out.println("O valor total sera de: " + total + " em " + par + "x. O valor das parcelas " +
                    "sera de: " + parcela + ". ");
        } else {
            System.out.println("Emprestimo negado!");
        }
    }
}
