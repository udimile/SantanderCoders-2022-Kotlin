package POO.aula5

class Cliente(
    val nome: String,
    val cpf: String,

) {
    private class Carteira(
        var saldo: Double,
        val listaDePix: MutableList<Pix> = mutableListOf(),
        var extrato: MutableList<Movimento> = mutableListOf(),
        val senha: String)
    
}


