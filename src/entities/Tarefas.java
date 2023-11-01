package entities;

public class Tarefas {
    private String nome;
    private String descricao;
    private Boolean status;

    public Tarefas() {
    }

    public Tarefas(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String isConcluida() {
        if (!status) {
            return "Em andamento";
        }
        else {
            return "Concluida";
        }
    }
}
