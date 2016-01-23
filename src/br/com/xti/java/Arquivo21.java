package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo21 {

	//A partir do Java 7 faz assim:
	public static void main(String[] args) {
		Path path = Paths.get("/home/tulio/Copy/workspace/xti/files/texto.txt");
		Charset cs = StandardCharsets.UTF_8;

		//Escrita
		/*try (BufferedWriter w = Files.newBufferedWriter(path, cs)) {
			w.write("Texto 1\n");
			w.write("Texto 2\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//Leitura
		try (BufferedReader r = Files.newBufferedReader(path, cs)) {
			String line = null;
			while ((line = r.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
