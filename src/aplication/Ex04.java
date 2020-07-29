package aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {

	public static void main(String [] args) {
		
		String[] lines = new String [] {"bom dia" , "boa tarde", "boa noite"}; // será colocado no arquivo
		
		String path = "c:\\temp\\ out.txt"; //camino do arquivo
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ //cria o arquivos
			
			for(String line : lines) { // pega cada elemto do vetor
				bw.write(line); //escreve cada linha do vetor no arquivo.
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
