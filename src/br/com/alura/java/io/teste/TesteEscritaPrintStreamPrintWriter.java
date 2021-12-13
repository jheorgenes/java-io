package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException { //Pra usar InputStream é obrigatório importar try/catch ou lançar essa excesão.

		/**
		 * Fluxo de saída de Arquivo
		 */
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt")); //Classe genérica que aceita os arquivos de forma simplificada
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter ps = new PrintWriter("lorem2.txt"); //Classe atualizada para buscar arquivo de texto.
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println("Qualquer texto para testar a impressão");
//		bw.write(System.lineSeparator()); //System.lineSeparator() método estático que pula linha
//		bw.write(System.lineSeparator());
		ps.close();
	}
 
}
