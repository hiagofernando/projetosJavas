package singleton;
import java.security.SignatureException;

/**
 *Singleton "preguiçoso"
 *  
 * @author hiagofernando
 */
public class singletonLazy {
    
    private static singletonLazy instancia;

    private singletonLazy(){
        super();
    }

    public static singletonLazy getInstancia(){
        if (instancia == null){
            instancia = new singletonLazy();
        }
        return instancia;
    }
}
