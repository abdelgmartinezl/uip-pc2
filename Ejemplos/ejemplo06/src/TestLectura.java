import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestLectura {

	public static void main(String[] args) {
		
		String nombreArchivo = "/Users/potty/Desktop/abc.txt";
		
		try (Stream<String> stream = Files.lines(Paths.get(nombreArchivo))) {
			stream.forEach(System.out::println);
		} catch (IOException e) { 
			e.printStackTrace();
		}

	}

}
