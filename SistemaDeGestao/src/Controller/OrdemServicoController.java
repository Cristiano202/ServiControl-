package Controller;

import Dao.OrdemServicoDao;
import Model.OrdemServico;

import java.util.List;

public class OrdemServicoController {
    private OrdemServicoDao ordemDao     = new OrdemServicoDao();

    public void adicionarOrdem(OrdemServico ordem){
        ordemDao.salvar(ordem);
    }
    public List<OrdemServico> listarOrdens() {
        return ordemDao.listar();
    }

    public OrdemServico buscarOrdemPorId(long id) {
        return ordemDao.buscarPorId(id);
    }

}
