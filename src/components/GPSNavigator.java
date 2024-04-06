package components;

/**
 * Just another feature of a car.
 */

//Classe que representa um navegador GPS que pode armazenar e recuperar rotas.
public class GPSNavigator {
	//Rota atual armazenada no navegador
    private String route;

    //Construtor padrão que inicializa a rota com uma rota pré-definida.
    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    //Construtor que permite especificar uma rota personalizada como uma String.
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    //Retorna a rota atual armazenada no navegador.
    public String getRoute() {
        return route;
    }
}