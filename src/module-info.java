module app.financeiro {
	
	requires java.base; // importado por padr�o de forma impl�cita 
	requires app.api.publica;
	uses br.com.home.app.ICalculadora;
	
}