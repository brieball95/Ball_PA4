	import java.io.FileNotFoundException;
	import java.io.IOException;
public class Application {
	
	   public static void main(String[] args) throws IOException {
	       DplicateRemover d=new DplicateRemover();
	       d.remove("problem");
	       d.Write("unique_words");


	   }

	}


