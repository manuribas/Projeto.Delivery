package delivery1.ifood.repository;

import delivery1.ifood.model.Contato;
import delivery1.ifood.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}