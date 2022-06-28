package br.com.wm.tdd.service;

import java.math.BigDecimal;

import br.com.wm.tdd.modelo.Desempenho;
import br.com.wm.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario,
			Desempenho desempenho) {
		BigDecimal reajuste = desempenho.percentualReajuste();
		funcionario.reajustarSalario(reajuste);
	}

}




