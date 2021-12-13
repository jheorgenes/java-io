package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException { //Pra usar classes que herdam de IOStream é obrigatório importar try/catch ou lançar essa excesão.
		
		Socket s = new Socket(); //Faz conexão via socket para conexão com rede
		
		/* Entrada */
		InputStream fis = s.getInputStream(); //Busca input recebido da rede
		//InputStream fis = System.in; //busca teclado     //new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis); 
		BufferedReader br = new BufferedReader(isr); 
		
		/* Saída */
		OutputStream fos = System.out; //saída no console  //new FileOutputStream("lorem2.txt"); 
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw); 
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) { //Linha não pode ser vazia
			bw.write(linha); //Escreve a linha no arquivo
			bw.newLine(); //Quebra de linha
			//bw.flush(); //Imprime em tempo real, a cada vez que for precionado Enter
			linha = br.readLine(); 
		}
		br.close();
		bw.close();
	}
 
}
