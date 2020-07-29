package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {

		//MODO MENOS POLUENTE NO PROGRAMA
		
		String path = "c:\\temp\\in.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine(); // ler uma linha do arquivo.

			while (line != null) { // enquanto a linha for diferente de nulo
				System.out.println(line); // print da linha.
				line = br.readLine(); // ler a proxima linha do arquivo.
			}

		} catch (IOException e) {
			System.out.println("Erro :" + e.getMessage());
		} 

	}

}
