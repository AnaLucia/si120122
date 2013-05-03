package Classes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String nomeDiretorio;
		Diretorio diretorio = new Diretorio();
		File file;
		Arquivo arq = new Arquivo();
		
		System.out.println("Digite o caminho do diretorio: ");
		nomeDiretorio = leitor.next();

		diretorio.testaSeEhDiretorio(nomeDiretorio);
		file = diretorio.listaDiretorios(nomeDiretorio);
		arq.abreLerArquivoSom(file);
		

	}

}
