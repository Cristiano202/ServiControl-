package Model;

import java.util.Objects;

public class Cliente {
    private long id;
    private String nome;
    private String email;
    private int  numero;

    public Cliente(){

    }

    public Cliente(long id, String nome, String email, int numero) {
        setId(id);
        setNome(nome);
        setEmail(email);
        setNumero(numero);
    }
    public long getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }
    public String getGmail(){
        return email;
    }
    public int getNumero(){
        return numero;
    }
    public void setId(long id){
        if(id <= 0){
            throw new IllegalArgumentException("ID deve ser maior que zero !");
        }
        this.id = id;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome invalido !");
        }
        this.nome = nome;
    }
    public void setEmail(String email) {
        if(email == null || !email.contains("@")){
            throw new IllegalArgumentException("Email invalido!!");
        }
        this.email = email;
    }
    public void setNumero(int numero){
        if(numero <= 0){
            throw new IllegalArgumentException("Numero invalido !");
        }
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", gmail='" + email + '\'' +
                ", numero=" + numero +
                '}';
    }
}
