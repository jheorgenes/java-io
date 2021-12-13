package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		String s = "ç";
		System.out.println(s.codePointAt(0)); //Busca o código decimal da tabela ascii
		
		Charset charset = Charset.defaultCharset(); //Busca a tabela padrão que está sendo utilizada do Charset
		//Charset utf8 = StandardCharsets.UTF_8; //Altera para uma tabela padrão
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252"); //Convertendo no charset windows-1252
		System.out.println(bytes.length + ", windows-1252 "); 
		String sNovo = new String(bytes); //Busca a quantidade de bytes utilizada
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16"); //Convertendo no charset UTF-16
		System.out.println(bytes.length + ", UTF-16 ");
		sNovo = new String(bytes);
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-8"); //Convertendo no charset UTF-8
		System.out.println(bytes.length + ", UTF-8  ");
		sNovo = new String(bytes);
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US-ASCII ");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);
	}

}
