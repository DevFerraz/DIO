import java.time.LocalDateTime;

public class Exe {
    public static void main(String[] args) {
        Ex1 n = new Ex1();
        System.out.println("Exercicio calculadora");
        int a = n.soma(3, 6);
        int b = n.multiplicacao(5, 10);
        double i = n.divisao(6, 0);
        int c = n.subtracao(4, 10);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if (i == 0) {
            System.out.println("Divisao invalida! Nao eh possivel divisao por 0");
        } else {
            System.out.println(i);
        }
        System.out.println("Exercicio mensagem");
        Msg.msg(7);
        Msg.msg(13);
        Msg.msg(19);
        Msg.msg(3);

        System.out.println("Exercicio emprestimo");
        Emprestimo.valor(2000);
        Emprestimo.valor(1000);
        Emprestimo.valor(6000);
        Emprestimo.valor(11000);
        Emprestimo.valor(20000);
        Emprestimo.valor(21000);
        Emprestimo.valor(1);
    }

}

