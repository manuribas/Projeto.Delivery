package delivery1.ifood.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "db_contato")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 40, nullable = false)
    private String email;
    private String ddi;
    private String ddd;
    private String numero;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDdi() {return ddi;}
    public void setDdi(String ddi) {this.ddi = ddi;}

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Contato(Long id, String email, String ddi, String ddd, String numero, String descricao, Cliente cliente) {
        this.id = id;
        this.email = email;
        this.ddi= ddi;
        this.ddd = ddd;
        this.numero = numero;
        this.descricao = descricao;
        this.cliente = cliente;
    }
    public Contato() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getId(), contato.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}