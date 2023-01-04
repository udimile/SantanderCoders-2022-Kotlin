package POO.carteira

class ClienteDigital(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: String
) : Cliente(nome, sobrenome, cpf, senha), Digital {
    override fun pagarBoleto() {
        TODO("Not yet implemented")
    }

    override fun transferenciaPix() {
        TODO("Not yet implemented")
    }

    override fun investir() {
        TODO("Not yet implemented")
    }

    override fun guardar() {
        TODO("Not yet implemented")
    }

}