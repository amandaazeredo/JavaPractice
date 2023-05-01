package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterProgram {

	public static void main(String[] args) {

		String [] lines = new String [] {"Matheus", "Marcos", "Lucas", "João"};
		
		String path = "c:\\temp\\livros.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //o true faz com que o arquivo não seja limpo para depois escrever o que há no vetor(acrescenta sem apagar)
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
