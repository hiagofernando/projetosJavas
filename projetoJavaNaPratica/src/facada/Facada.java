package facada;

import subsistema1Crm.CrmService;
import subsistema2Cep.CepApi;

public class Facada {
    
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarCidade(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
