package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Analista(nome: String, cpf: String, salario: Float) : Funcionario(nome, cpf, salario) {
    override fun calcularAuxilio() = salario * 0.1

}