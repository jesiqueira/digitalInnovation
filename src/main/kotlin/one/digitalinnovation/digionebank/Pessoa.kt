package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Edmar"
    var cpf:String = "111.222.333-77"
}


fun main() {
    val edmar = Pessoa()
    println(edmar.nome)
    println(edmar.cpf)
}