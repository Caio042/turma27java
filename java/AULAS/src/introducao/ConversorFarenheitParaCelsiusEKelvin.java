package introducao;

public class ConversorFarenheitParaCelsiusEKelvin {

	public static void main(String[] args) {

		String nome = "Caio";
		double celsius, farenheit = 98.6, kelvin;
		
		celsius = (farenheit - 32) / 9 * 5;
		kelvin = celsius + 273;
		
		System.out.println("Ola " + nome);
		System.out.println("A temperatura em farenheit �: " + farenheit + " �F");
		System.out.println("A temperatura em celsius �: " + celsius + " �C");
		System.out.println("A temperatura em kelvin �: " + kelvin + " �K");
	}
}