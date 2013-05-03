package Classes;

import java.io.File;
import java.io.IOException;

public class Diretorio {

	public void testaSeEhDiretorio(String dir) {

		File diretorio = new File(dir);
		File fList[] = diretorio.listFiles();

		if (diretorio.isDirectory()) {
			System.out.print("Numero de arquivos no diretorio : "
					+ fList.length + "\n");
		}
	}

	public void listaDiretorios(String dir) {

		File diretorio = new File(dir);
		File fList[] = diretorio.listFiles();

		for (File file : fList) {
			System.out.println(file.getName() + "\n");

		}

	}

	public void lerArquivo(String dir) throws IOException {
		File diretorio = new File(dir);

		File fList[] = diretorio.listFiles();

		for (File file : fList) {

			System.out.println(Arquivo.abreLerArquivoSom(file));

		}

	}
	
	

	public static void main(String[] args) throws IOException {
		Diretorio arq = new Diretorio();
		String dir = "/home/annynha/Teste";

		arq.testaSeEhDiretorio(dir);
		arq.listaDiretorios(dir);

		arq.lerArquivo(dir);
	}

}
