package Strategy;

import Strategy.Context.Navigator;
import Strategy.Strategies.RoadStrategy;

// El codigo cliente elige una estrategia concreta y la pasa al contexto.
// El cliente debe concoer las diferencias entre las estrategias para elegir la mejor opcion.
public class Application {

    public void mainStrategy(RoadStrategy strategy) {
        Navigator context = new Navigator(strategy);

        context.buildRoute("Ituzaingo", "Medrano");
    }

}
