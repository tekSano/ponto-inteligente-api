package br.com.teksano.pontointeligente.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.teksano.pontointeligente.api.entities.Funcionario;
import br.com.teksano.pontointeligente.api.enums.Perfil;

@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	Funcionario findByCpf(String cpf);

	Funcionario findByEmail(String email);

	Funcionario findByCpfOrEmail(String cpf, String email);

	Funcionario findByEmailAndNome(String email, String nome);

	List<Funcionario> findByPerfil(Perfil perfil);
}
