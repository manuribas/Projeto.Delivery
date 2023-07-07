package delivery1.ifood.dtos;

import delivery1.ifood.model.Cliente;
import delivery1.ifood.model.Contato;
import delivery1.ifood.model.Endereco;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClienteDTO implements Serializable {
    private static final long serialVersionUID=1L;

    private Long id;
    private String nome;
    private String email;
    private String dataNascimento;
    private List<EnderecoDTO> enderecos=new ArrayList<>();
    private List<ContatoDTO> Contatos=new ArrayList<>();

    public ClienteDTO(Long id, String nome, String email, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    public ClienteDTO(Cliente cliente) {
        id= cliente.getId();
        nome=cliente.getNome();
        email=cliente.getEmail();
        dataNascimento=cliente.getDataNascimento();
    }
    public ClienteDTO(Cliente cliente, List<Contato> contatos){
        this(cliente);
        cliente.getContato.forEach(contato -> this.contato.add(new  ContatoDTO(contato)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoDTO> enderecos) {
        this.enderecos = enderecos;
    }

    public List<ContatoDTO> getContatos() {
        return Contatos;
    }

    public void setContatos(List<ContatoDTO> contatos) {
        Contatos = contatos;
    }
}
