package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) {
		Path path = Paths.get("/home/tulio/Copy/workspace/xti/files/texto.txt");

		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		System.out.println();
		System.out.println("Dir do user: " + System.getProperty("user.dir"));
		System.out.println("Dir do home: " + System.getProperty("user.home"));

		System.out.println();

		try {
			//Criacao de diretórios
			Files.createDirectories(path.getParent()); 
			
			byte[] bytes = "Texto no arquivo".getBytes();
			Files.write(path, bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			byte[] retorno = Files.readAllBytes(path);
			System.out.println(new String(retorno));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
