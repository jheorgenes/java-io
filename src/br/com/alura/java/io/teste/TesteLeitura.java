package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException { //Pra usar InputStream é obrigatório importar try/catch ou lançar essa excesão.

		/**
		 * Fluxo de Entrada de Arquivo
		 */
		InputStream fis = new FileInputStream("lorem.txt"); //Carrega o arquivo apontado como arquivo binário
		Reader isr = new InputStreamReader(fis, "UTF-8"); //Transformando os dados binários em caracteres (forçando tipos de tabela Unicoders)
		BufferedReader br = new BufferedReader(isr); //Referencia para conseguir interpretar os caracteres para realizar a leitura
		
		String linha = br.readLine(); //Ler a linha
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
	}
 
}
