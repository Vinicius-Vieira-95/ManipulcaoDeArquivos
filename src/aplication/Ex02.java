package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	
	//apenas uma execução de forma manualmente

	public static void main(String[] args) {
		
		String path =   "c:\\temp\\in.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path); //pega o caminho do arquivo.
			br = new BufferedReader(fr); //executa com mais rapidez.
			
			String line = br.readLine(); //ler uma linha do arquivo.
			
			while(line != null) { // enquanto a linha for diferente de nulo
				System.out.println(line); // print da linha.
				line = br.readLine();  // ler a proxima linha do arquivo.
			}
			
		}
		catch(IOException e) {
			System.out.println("Erro :" + e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			
			}
		}
	}

}
