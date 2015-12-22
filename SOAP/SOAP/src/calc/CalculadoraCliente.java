package calc;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Scanner;

class CalculadoraClient {

	public static void main(String args[]) throws Exception {
		URL url = new URL("http://127.0.0.1:8080/calc?wsdl");
		QName qname = new QName("http://calc/", "CalculadoraServerImplService");
		Service ws = Service.create(url, qname);
		CalculadoraServer calc = ws.getPort(CalculadoraServer.class);
		Scanner input = new Scanner(System.in);
		float num1 = 0;
		float num2 = 0;
		num1 = input.nextFloat();
		num2 = input.nextFloat();

		System.out.println("Soma: " + calc.soma(num1, num2));
		System.out.println("Subtracao): " + calc.subtracao(num1, num2));
		System.out.println("Multiplicacao: " + calc.multiplicacao(num1, num2));
		System.out.println("Divisao: " + calc.divisao(num1, num2));

	}
}