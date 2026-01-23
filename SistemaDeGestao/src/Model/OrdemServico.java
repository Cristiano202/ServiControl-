package Model;

import java.time.LocalDate;
import java.util.Objects;

public class OrdemServico {
    private long id;
    private Cliente cliente;
    private String descricao;
    private LocalDate data;

    public OrdemServico(){

    }

    public OrdemServico(long id, Cliente cliente, String descricao, LocalDate data) {
       setId(id);
       setCliente(cliente);
       setDescricao(descricao);
       setData(data);
    }

    public void setId(long id){
        if (id<= 0){
            throw new IllegalArgumentException("ID deve ser maior quer 0 !!");
        }
        this.id = id;
    }
    public void setDescricao(String descricao){
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Descrição inválida!");
        }
        this.descricao = descricao;

    }

    public void setCliente(Cliente cliente) {
        if (cliente == null){
            throw new IllegalArgumentException("Cliente nao pode ser nulo !! ");
        }
        this.cliente = cliente;
    }
    public void setData(LocalDate data) {
        if (data == null) {
            throw new IllegalArgumentException("Data não pode ser nula!");
        }
        if (data.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data não pode ser no futuro!");
        }
        this.data = data;
    }
    public long getId(){
        return id;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public String getDescricao(){
        return descricao;
    }
    public LocalDate getData(){
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrdemServico)) return false;
        OrdemServico that = (OrdemServico) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
