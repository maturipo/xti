package br.com.xti.java;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) {
		Path path = Paths.get("/home/tulio/Copy/workspace/xti/texto.txt");
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		
		

	}

}
