package Dao;

import Model.OrdemServico;

import java.util.ArrayList;
import java.util.List;

public class OrdemServicoDao {
    private List<OrdemServico> ordens =new ArrayList<>();
    public void salvar(OrdemServico ordem) {
        ordens.add(ordem);
    }

    public List<OrdemServico> listar() {
        return ordens;
    }


    public OrdemServico buscarPorId(long id) {
        return ordens.stream()
                .filter(o -> o.getId() == id)
                .findFirst()
                .orElse(null);
    }


}
