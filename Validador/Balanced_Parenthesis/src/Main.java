import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		String fileName = args[0];

		try {

			// Pega o arquivo
			File filePath = new File("C:\\Users\\Zanardi\\Área de Trabalho\\Desafios\\" + fileName);

			// Pega o caminho do arquivo
			FileReader filePathRead = new FileReader(filePath);

			BufferedReader fileRead = new BufferedReader(filePathRead);
			
	        BufferedWriter Escritor = new BufferedWriter(CreateFile());

			while (fileRead.ready()) {
				String text = fileRead.readLine();
								

				if (text.indexOf('(') > text.indexOf(')') || text.indexOf('{') > text.indexOf('}')
						|| text.indexOf('[') > text.indexOf(']')) {
					text += "Inválido\n";
				} else if (text.indexOf('(') == -1 || text.indexOf(')') == -1 || text.indexOf('{') == -1
						|| text.indexOf('}') == -1 || text.indexOf('[') == -1 || text.indexOf(']') == -1) {
					text += "Inválido\n";
				} else {
					text += "Válido\n";
				}	
								
								
		        Escritor.write(text);
			}
			
			
			fileRead.close();
			Escritor.close();

		} catch (Exception e) {
			System.out.println("File not found!\n A exceção é: "+e);
		}
		

	}
	public Writer CreateFile()
	{
		OutputStream NewFile = new FileOutputStream("NewFile.txt");
	    Writer wr = new OutputStreamWriter(NewFile);
		return Wr;
	}

}
