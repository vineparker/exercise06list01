import java.util.Scanner;

class Main {
  // Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
  public static void main(String[] args) {

    // declaração das variáveis 
    Scanner input = new Scanner(System.in);

    // informe quanto recebe por hora
    String textoUm = "Informe o valor que você recebe por hora:";
    System.out.print(textoUm);
    double valorHora = input.nextDouble();

    // informe a quantidade de horas trabalhadas no mes
    String textoDois = "Informe quantas horas voce trabalha por mes:";
    System.out.print(textoDois);
    double horaTrabalhada = input.nextDouble();
    // fazer o calculo de conversao de raio para area
    double vmensal = (valorHora * horaTrabalhada); 

    // mostrar o resultado da convesao
    System.out.println("O seu salario neste mes sera de: \n" + "R$" + vmensal);

    input.close();
  }
}





