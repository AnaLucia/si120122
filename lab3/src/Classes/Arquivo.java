package Classes;

import java.io.*;

/**
 * 
 * Persistencia de informacoes
 * 
 * @author Ana Lucia
 * 
 */

public class Arquivo extends Thread {

	private static int cont;

	public static String abreLerArquivoSom(File file2) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file2));
		String everything;

		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				if ((line.contains("one of")) || (line.contains("abstract")) ||
				 (line.contains("assert")) ||
				 (line.contains("boolean"))||
				 (line.contains("break"))||
				 (line.contains("byte")) || 
				 (line.contains("case")) || 
				 (line.contains("catch")) ||
				 (line.contains("char")) || 
				 (line.contains("class")) ||
				 (line.contains("const")) ||
				 (line.contains("continue")) || 
				 (line.contains("default")) || 
				 (line.contains("do")) || 
				 (line.contains("double")) || 
				 (line.contains("else")) || 
				 (line.contains("enum")) || 
				 (line.contains("extends")) | 
				 (line.contains("final")) ||
				 (line.contains("finally")) ||
				 (line.contains("float")) ||
				 (line.contains("for")) ||
				 (line.contains("if")) || 
				 (line.contains("goto")) ||
				 (line.contains("implements")) || 
				 (line.contains("import")) || 
				 (line.contains("instanceof")) || 
				 (line.contains("int")) || 
				 (line.contains("interface")) || 
				 (line.contains("long")) || 
				 (line.contains("native")) ||
				 (line.contains("new")) || 
				 (line.contains("package")) ||
				 (line.contains("private")) || 
				 (line.contains("protected")) ||
				 (line.contains("public")) ||
				 (line.contains("return")) ||
				 (line.contains("short")) ||
				 (line.contains("static")) || 
				 (line.contains("strictfp")) || 
				 (line.contains("super")) ||
				 (line.contains("switch")) || 
				 (line.contains("synchronized")) || 
				 (line.contains("this")) ||
				 (line.contains("throw")) ||
				 (line.contains("throws")) || 
				 (line.contains("transient")) ||
				 (line.contains("try")) ||
				 (line.contains("void")) ||
				 (line.contains("volatile"))||
				 (line.contains("while"))){
					cont++;

				 }
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			everything = sb.toString();
			System.out.println("Quantidade de palavras reservadas: " + cont);
		} finally {
			br.close();
		}
		return everything;
	}// Fim do metodo 'abreLerArquivo'

	
}// Fim da classe arquivo