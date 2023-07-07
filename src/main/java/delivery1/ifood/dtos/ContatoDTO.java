package delivery1.ifood.dtos;

import delivery1.ifood.model.Cliente;
import delivery1.ifood.model.Contato;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

public class ContatoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String email;
    private String ddi;
    private String ddd;
    private String numero;
    private String descricao;
    private Long cliente;

    public ContatoDTO(Long id, String email, String ddi, String ddd, String numero, String descricao, Long cliente) {
        this.id = id;
        this.email = email;
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
        this.descricao = descricao;
        this.cliente = cliente;
    }

    public ContatoDTO(Contato contato) {
    }
}
