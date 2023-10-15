import facada.Facada;
import singleton.singletonEager;
import singleton.singletonLazy;
import singleton.singletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
    public static void main(String[] args) {

        // Singleton
        singletonLazy lazy = singletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = singletonLazy.getInstancia();
        System.out.println(lazy);

        singletonEager Eager = singletonEager.getInstancia();
        System.out.println(Eager);
        Eager = singletonEager.getInstancia();
        System.out.println(Eager);

        singletonLazyHolder LazyHolder = singletonLazyHolder.getInstancia();
        System.out.println(lazy);
        LazyHolder = singletonLazyHolder.getInstancia();
        System.out.println(LazyHolder);

        
        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
     robo.setStrategy(agressivo);
        robo.mover();
     robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();


        // Facada

        Facada facada = new Facada();
        facada.migrarCliente("Hiago", "12345-678");
    
}
}