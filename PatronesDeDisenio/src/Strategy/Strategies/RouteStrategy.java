package Strategy.Strategies;

// La interfaz ESTRATEGIA declara operaciones comunes a todas las versiones soportadas de algun algoritmo.
// El CONTEXTO (Navigator) utiliza esta interfaz para invocar el algoritmo definido por las estrategias concretas.
// Las estrategias concretas implementan el algoritmo mientras siguen la interfaz estrategia base. La interfaz
// las hace intercambiables en el CONTEXTO.
public interface RouteStrategy {

    void buildRoute(String origin, String destiny);

}
