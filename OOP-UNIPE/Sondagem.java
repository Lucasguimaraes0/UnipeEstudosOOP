import java.util.Scanner;

public class Sondagem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salario = 1;
        String nome = "";
        int qntdFilhos = 0;
        double somaSalarios = 0.0;
        int somaQtndFilhos = 0;
        int contador = 1;
        double maiorSalario = 0;
        double menorSalario = 555555555;
        String nomeMaiorSalario = "";
        String nomeMenorSalario = "";
        int salarioMenor1500 = 0;


        while (salario > 0){
            System.out.println("Digite seu nome:");
            nome = input.next();

            System.out.println("Digite a quantidade de filhos:");
            qntdFilhos = input.nextInt();

            System.out.println("Digite seu salário:");
            salario = input.nextDouble();
            if (salario > maiorSalario){
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }
            if (salario < menorSalario){
                menorSalario = salario;
                nomeMenorSalario = nome;
            }
            if (salario <= 1500){
                salarioMenor1500++;
            }

            somaSalarios += salario;
            somaQtndFilhos += qntdFilhos;

            contador++;
        }
        input.close();

        contador--;

        double mediaSalarios = somaSalarios / contador;
        double mediaFilhos = somaQtndFilhos / contador;
        double percentual1500 = ((double) salarioMenor1500 / contador) *100;

        System.out.println("Resultados da sondagem:");
        System.out.printf("Média dos salários da população: %.2f\n ", mediaSalarios);
        System.out.println("Média do números de filhos: " + mediaFilhos);
        System.out.println("Nome da pessoa com maior salário: "+ nomeMaiorSalario);
        System.out.println("Nome da pessoa com menor salário: "+ nomeMenorSalario);
        System.out.printf("Percentual de pessoas com salário até R$1500,00 : %.2f", percentual1500);
        System.out.println("%");
    }
}
