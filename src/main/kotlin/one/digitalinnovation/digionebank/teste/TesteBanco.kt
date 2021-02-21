package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBack = Banco("DigiOne", 12)

    println(digiOneBack.nome)
    println(digiOneBack.numero)

    val banco2 = digiOneBack.copy(nome ="Banco2")
    println(banco2.info())
}