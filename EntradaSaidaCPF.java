
/**********************************************************************************************
 *
 *DESAFIO: Entrada e saída de CPF no formato estabelecido
 *
 *Elabore um programa que possuas as características abaixo:
 * Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
 * Imprima os quatro grupos numéricos, sendo um valor por linha.
 *
 *Entrada:A entrada consiste vários arquivos de teste e cada um possuindo uma linha com formato
 * XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros.
 * 
 *Saída: Para cada arquivo da entrada, tem que ter um arquivo de saída com quatro linhas,
 * e em cada linha um número inteiro de acordo com procedimento 2 descrito no Desafio.
 *
 * Exemplo: entrada = 320.025.102-01 -> exiba 320 025 102 01 
 **********************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class Classe {
  public static void main(String[] args) {

    Locale.setDefault(new Locale("en", "US"));

    Scanner sc = new Scanner(System.in);

    String[] cpf = new String[4];

    cpf = sc.nextLine().split("\\.|-");

    for (int i = 0; i < cpf.length; i++)
      System.out.printf("%s\n", cpf[i]);

    sc.close();
  }
}