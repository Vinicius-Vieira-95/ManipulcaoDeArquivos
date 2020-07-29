package aplication;

import java.io.File;
import java.util.Scanner;

public class Ex05 {
 
	//Demostração para pega o caminho das pastas
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com pasta de um arquivo");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File :: isDirectory); //mostra o caminhos do diretorio
		System.out.println("PASTAS");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File :: isFile);
		System.out.println("ARQUIVOS");
		for(File file : files) {
			System.out.println(file);
		}

		//cria uma subpasta a partir da pasta de destino
		boolean sucess = new File(strPath + "\\subdir.").mkdir();
		System.out.println("Diretorio criado com sucesso " + sucess);
		
		sc.close();
	}

}
