package one.digitalinnovation.digionebank

class Gerente(nome: String, cpf: String, salario: Float) : Funcionario(nome, cpf, salario) {
    override fun calcularAuxilio(): Double = salario * 0.4
}