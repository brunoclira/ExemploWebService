package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculadoraServer {
	@WebMethod
	float soma(float num1, float num2);

	@WebMethod
	float subtracao(float num1, float num2);

	@WebMethod
	float multiplicacao(float num1, float num2);

	@WebMethod
	float divisao(float num1, float num2);
}

//@Webservice:
//� uma anota��o que avisa ao compilador Java que o arquivo atual corresponde � defini��o SEI (Service Endpoint Interface) de um servi�o Web.

//@WebMethod: 
//Indica que um determinado m�todo corresponde a uma opera��o de servi�o e assim pode ser invocado por um cliente. 

//@SOAPBinding: 
//Indica que o servi�o utilizar� a abordagem SOAP.