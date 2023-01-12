import java.util.Scanner;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do empregado 1:");
        String nome1 = input.next();
        System.out.println("Digite o sobrenome do empregado 1:");
        String sobrenome1 = input.next();
        System.out.println("Digite o salário mensal do empregado 1:");
        double salarioMensal1 = input.nextDouble();
        Empregado emp1 = new Empregado(nome1, sobrenome1, salarioMensal1);

        System.out.println("Digite o nome do empregado 2:");
        String nome2 = input.next();
        System.out.println("Digite o sobrenome do empregado 2:");
        String sobrenome2 = input.next();
        System.out.println("Digite o salário mensal do empregado 2:");
        double salarioMensal2 = input.nextDouble();
        Empregado emp2 = new Empregado(nome2, sobrenome2, salarioMensal2);


        System.out.println("Empregado 1: " + emp1.getNome() + " " + emp1.getSobrenome() + ". Salário Anual: R$" + emp1.getSalarioMensal()*12);
        System.out.println("Empregado 2: " + emp2.getNome() + " " + emp2.getSobrenome() + ". Salário Anual: R$" + emp2.getSalarioMensal()*12);

        System.out.println("Empregado 1: " + emp1.getNome() + " " + emp1.getSobrenome() + ". Novo Salário Anual: R$" + emp1.getSalarioMensal()*12*1.10);
        System.out.println("Empregado 2: " + emp2.getNome() + " " + emp2.getSobrenome() + ". Novo Salário Anual: R$" + emp2.getSalarioMensal()*12*1.10);

        input.close();
    }
}
