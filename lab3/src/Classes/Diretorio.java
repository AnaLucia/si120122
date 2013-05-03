package Classes;

import java.io.File;

public class Diretorio extends Thread{

	static String dir = "/home/annynha/Teste";
	static File diretorio = new File(dir);

	static File fList[] = diretorio.listFiles();
	
	@Override
	public void run(){
		this.listaDiretorios(dir);
	}

	public void testaSeEhDiretorio(String dir) {

		if (diretorio.isDirectory()) {
			System.out.print("Numero de arquivos no diretorio : "
					+ fList.length + "\n");
		}
	}

	public File listaDiretorios(String dir) {
		File saida = null;
		for (File file : fList) {
			saida = file;
		}
		return saida;

	}

}
