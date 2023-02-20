package Strategy.Context;

import Strategy.Strategies.RouteStrategy;

// El CONTEXTO define la interfaz de interes para los clientes. Mantiene una referencia a una de las estrategias.
// Debe trabajar con todas las estrategias a traves de la interfaz estrategia.
public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    // Para camb iar la estrategia en tiempo de ejecucion
    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String origin, String destiny) {
        strategy.buildRoute(origin, destiny);
    }

}
