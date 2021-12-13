package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		//Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8"); //Convertendo arquivo utilizando os Unicoders específicos
		Scanner scanner = new Scanner(new File("contas.csv")); //Referencia scanner busca o arquivo diretamente
		while(scanner.hasNextLine()) { //Enquanto houver linha no arquivo
			String linha = scanner.nextLine(); //Busca a proxima linha
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha); //Necessita de outro scanner para fazer a separação
			linhaScanner.useLocale(Locale.US); //Faz a conversão pro idioma americano para considerar pontos
			linhaScanner.useDelimiter(","); //Quebra uma string em várias strings agrupadas
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			/* Formatando strings de acordo com a localidade */
			String valorFormatado = String.format(new Locale("pt", "BR"),"%s - %04d-%08d - %20s: %08.2f", tipoConta,agencia,numero,titular,saldo);
//			String valorFormatado = String.format(Locale.GERMAN,"%s - %04d-%08d - %s: %08.2f", tipoConta,agencia,numero,titular,saldo);
			System.out.println(valorFormatado);
			
			linhaScanner.close();
			
//			String valores[] = linha.split(","); //Recebe uma string e retorna um array, usando como idenfificador a virgula
//			System.out.println(Arrays.toString(valores)); //método toString busca uma string e 
		}
		scanner.close();
	} 
}
