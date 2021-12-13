package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException { //Pra usar InputStream é obrigatório importar try/catch ou lançar essa excesão.

		/**
		 * Fluxo de saída de Arquivo
		 */
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
//		bw.write(System.lineSeparator()); //System.lineSeparator() método estático que pula linha
//		bw.write(System.lineSeparator());
		bw.write("Qualquer texto para testar a impressão");
		
		bw.close();
	}
 
}
