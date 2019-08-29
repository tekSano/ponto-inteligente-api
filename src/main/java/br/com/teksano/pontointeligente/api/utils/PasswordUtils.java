package br.com.teksano.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);

	public static String gerarBCrypt(String senha) {

		if (senha == null) {
			return null;
		}
		log.info("Gerando hash com o BCript");
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.encode(senha);
	}
}
