package Singleton;

public class Database { // Singleton
    private static Database instance;

    private Database() {
        // Codigo de inicializacion, como por ejemplo, la propia conexion al servidor de una bd.
    }

    public static  Database getInstance() {
        if(instance == null) {
            // si la aplicación soporta multihilos se debe bloquear mediante acquireThreadLock()
            instance = new Database();
        }

        return instance;
    }

    public void query(String sql) {
        // Todas las consultas a la bd de una aplicacion pasan por este metodo
        // Aqui va la logicxa de regularizacion (throttling) o de envio a la memoria cache.
        // NOTA: Cualquier singleton debe definir cierta logica de negocio que pueda ejecutarse en su instancia!!!
    }

}
