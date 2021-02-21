package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario( nome: String, cpf: String, val salario:Float) : Pessoa(nome, cpf) {
    protected abstract fun calcularAuxilio() : Double

   override fun toString(): String = """
         Nome : $nome
         cpf : $cpf
         salario: $salario
         auxilio : ${calcularAuxilio()}
    """.trimIndent()

    fun imprimir() : Unit = println(toString())
}