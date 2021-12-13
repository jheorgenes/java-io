package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException { //Pra usar InputStream � obrigat�rio importar try/catch ou lan�ar essa exces�o.

		/**
		 * Fluxo de sa�da de Arquivo
		 */
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
//		bw.write(System.lineSeparator()); //System.lineSeparator() m�todo est�tico que pula linha
//		bw.write(System.lineSeparator());
		bw.write("Qualquer texto para testar a impress�o");
		
		bw.close();
	}
 
}
