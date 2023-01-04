package POO.carteira

class CarteiraFisica(
    senha: String,
    tipo: TipoDeCarteira = TipoDeCarteira.FISICA,
    saldo: Double,
    extrato: Double
) : Carteira(senha, tipo, saldo, extrato), Fisica {
    override fun deposito() {
        TODO("Not yet implemented")
    }

    override fun saque() {
        TODO("Not yet implemented")
    }

    override fun pagarBoleto() {
        TODO("Not yet implemented")
    }


}