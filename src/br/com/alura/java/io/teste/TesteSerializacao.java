package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//String nome = "Jheorgenes Warlley";
		/* A criação de um objeto a partir de um fluxo binário de dados (Desserialização)*/
		//Lê uma string e gera um arquivo convertido em binário
		// Trás um objeto de Saída a partir de um objeto de entrada de Streams de um arquivo binário
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome); //Escreve o objeto
//		oos.close();
		
		/* A transformação de um objeto em um fluxo binário (Serialização)*/
		//A partir de um arquivo já criado, ler o arquivo e imprimir no console
		//Trás um objeto de Entrada a partir de um objeto de saída de Streams de um arquivo binário
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject(); //Ler o objeto com um cast de String
		ois.close();
		System.out.println(nome);
	}

}
