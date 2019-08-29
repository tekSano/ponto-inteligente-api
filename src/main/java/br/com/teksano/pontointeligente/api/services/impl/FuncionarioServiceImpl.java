package br.com.teksano.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.teksano.pontointeligente.api.entities.Funcionario;
import br.com.teksano.pontointeligente.api.repositories.FuncionarioRepository;
import br.com.teksano.pontointeligente.api.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public Funcionario persistir(Funcionario funcionario) {

		log.info("Persistindo funcionário: {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}

	public Optional<Funcionario> buscarPorCpf(String cpf) {

		log.info("Buscando funcionário pelo CPF {}", cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}

	public Optional<Funcionario> buscarPorEmail(String email) {

		log.info("Buscando funcionário pelo email {}", email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}

	public Optional<Funcionario> buscarPorId(Long id) {

		log.info("Buscando funcionário pelo IDl {}", id);
//		return this.funcionarioRepository.findById(id);
		return Optional.ofNullable(funcionarioRepository.findOne(id));
	}

	@Override
	public Page<Funcionario> buscarTodos(Pageable pageable) {

		log.info("Listando todos os funcionários");
		return this.funcionarioRepository.findAll(pageable);
	}
}