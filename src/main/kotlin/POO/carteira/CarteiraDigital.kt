package POO.carteira

class CarteiraDigital(
    senha: String,
    tipo: TipoDeCarteira = TipoDeCarteira.DIGITAL,
    saldo: Double,
    extrato: Double
) : Carteira(senha, tipo, saldo, extrato), Digital {
    override fun transferenciaPix() {
        TODO("Not yet implemented")
    }

    override fun investir() {
        TODO("Not yet implemented")
    }

    override fun guardar() {
        TODO("Not yet implemented")
    }

    override fun pagarBoleto() {
        TODO("Not yet implemented")
    }


}