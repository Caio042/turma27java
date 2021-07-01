package introducao;

public class ConversorFarenheitParaCelsiusEKelvin {

	public static void main(String[] args) {

		String nome = "Caio";
		double celsius, farenheit = 98.6, kelvin;
		
		celsius = (farenheit - 32) / 9 * 5;
		kelvin = celsius + 273;
		
		System.out.println("Ola " + nome);
		System.out.println("A temperatura em farenheit é: " + farenheit + " ºF");
		System.out.println("A temperatura em celsius é: " + celsius + " ºC");
		System.out.println("A temperatura em kelvin é: " + kelvin + " ºK");
	}
}