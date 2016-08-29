package mx;
import java.io.Console;
public class Consola{
	public static void main(String[] args){
		Console console = System.console();
                System.out.println(System.getProperties().getProperty("hola.gay"));
		System.out.println("Imprimindo..." + console.readLine());
		String pass = new String(console.readPassword());
		System.out.println("Contraseña: " + pass);
	}
}