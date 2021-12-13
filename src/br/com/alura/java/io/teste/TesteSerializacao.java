package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//String nome = "Jheorgenes Warlley";
		/* A cria��o de um objeto a partir de um fluxo bin�rio de dados (Desserializa��o)*/
		//L� uma string e gera um arquivo convertido em bin�rio
		// Tr�s um objeto de Sa�da a partir de um objeto de entrada de Streams de um arquivo bin�rio
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome); //Escreve o objeto
//		oos.close();
		
		/* A transforma��o de um objeto em um fluxo bin�rio (Serializa��o)*/
		//A partir de um arquivo j� criado, ler o arquivo e imprimir no console
		//Tr�s um objeto de Entrada a partir de um objeto de sa�da de Streams de um arquivo bin�rio
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject(); //Ler o objeto com um cast de String
		ois.close();
		System.out.println(nome);
	}

}
