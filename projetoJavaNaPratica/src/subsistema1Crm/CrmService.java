package subsistema1Crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String etado) {
        System.out.println("Clinte salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(etado);
        
    }
    
}
