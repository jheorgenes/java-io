package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException { //Pra usar InputStream � obrigat�rio importar try/catch ou lan�ar essa exces�o.

		/**
		 * Fluxo de sa�da de Arquivo
		 */
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt")); //Classe gen�rica que aceita os arquivos de forma simplificada
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter ps = new PrintWriter("lorem2.txt"); //Classe atualizada para buscar arquivo de texto.
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println("Qualquer texto para testar a impress�o");
//		bw.write(System.lineSeparator()); //System.lineSeparator() m�todo est�tico que pula linha
//		bw.write(System.lineSeparator());
		ps.close();
	}
 
}
