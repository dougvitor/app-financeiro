module app.financeiro {
	
	requires java.base; // importado por padrão de forma implícita 
	requires app.api.publica;
	uses br.com.home.app.ICalculadora;
	
}