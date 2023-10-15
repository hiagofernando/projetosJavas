package singleton;
import java.security.SignatureException;

/**
 *Singleton "apressado"
 *  
 * @author hiagofernando
 */
public class singletonEager {
    
    private static singletonEager instancia = new singletonEager();

    private singletonEager(){
        super();
    }

    public static singletonEager getInstancia(){
        return instancia;
    }
}
