package POO.carteira

class ClienteNormal(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: String
) : Cliente(nome, sobrenome, cpf, senha), Fisica {
    override fun pagarBoleto() {
        TODO("Not yet implemented")
    }

    override fun deposito() {
        TODO("Not yet implemented")
    }

    override fun saque() {
        TODO("Not yet implemented")
    }
}