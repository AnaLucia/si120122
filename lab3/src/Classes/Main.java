package Classes;

import java.io.File;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String dir = "/home/annynha/Teste";
		
		Arquivo arquivo = new Arquivo();
		
		File diretorio = new File(dir);

		File fList[] = diretorio.listFiles();
		
		for (File file : fList) {
			System.out.println(Arquivo.abreLerArquivoSom(file));

		}
	}

}
