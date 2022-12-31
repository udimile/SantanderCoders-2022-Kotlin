package POO.carteira

open class Cliente (
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val senha: String,
    var plano: Planos
) {

}