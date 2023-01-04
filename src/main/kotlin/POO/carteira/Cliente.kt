package POO.carteira

abstract class Cliente(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val senha: String
) : Boleto