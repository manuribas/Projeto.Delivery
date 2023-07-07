package delivery1.ifood.repository;


import delivery1.ifood.model.Cliente;
import delivery1.ifood.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}