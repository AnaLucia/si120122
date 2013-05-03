package Classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Persistencia de informacoes
 * 
 * @author Ana Lucia
 * 
 */

public class Arquivo {

	public static String abreLerArquivoSom(File file2) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file2));
		String everything;
		boolean encontrou = false;
		int cont = 0;
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				if (line.contains("one of")
						|| (line.contains("abstract") || (line
								.contains("assert") || (line
								.contains("boolean") || (line.contains("break")))))) {
					cont++;
				}

				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			System.out.println(cont);
			everything = sb.toString();
		} finally {
			br.close();
		}
		return everything;
	}// Fim do metodo 'abreLerArquivo'

	public int contaWords(File file) {

		return 0;

	}

}// Fim da classe arquivo