package br.com.fiap.domain.entity;

public class Deposito {

    private Long id;

    private String nome;


    public Deposito() {
    }

    public Deposito(Long id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }


    @Override
    public String toString() {
        return "Deposito{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Deposito setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Deposito setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
