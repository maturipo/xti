package br.com.xti.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	//Antes se fazia assim: (Ver Arquivo2.java)
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/home/tulio/Copy/workspace/xti/files/texto.txt");
		Charset cs = StandardCharsets.UTF_8;
		
		
		BufferedWriter bw = Files.newBufferedWriter(path, cs);
		bw.write("Texto 1");
		bw.write("Texto 2");
		bw.write("Texto 3");
		
		bw.flush();
		bw.close();
		
	}

}
