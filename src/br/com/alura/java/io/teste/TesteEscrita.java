package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException { //Pra usar InputStream � obrigat�rio importar try/catch ou lan�ar essa exces�o.

		/**
		 * Fluxo de Sa�da de Arquivo
		 */
		OutputStream fos = new FileOutputStream("lorem2.txt"); //Carrega o arquivo apontado como arquivo bin�rio
		Writer osw = new OutputStreamWriter(fos); //Transformando os dados bin�rios em caracteres
		BufferedWriter bw = new BufferedWriter(osw); //Referencia para conseguir interpretar os caracteres para realizar a leitura
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("Qualquer texto para testar a impress�o");
		bw.close();
	}
 
}
