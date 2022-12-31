package POO.carteira

class CarteiraFisica(
    senha: String,
    tipo: TipoDeCarteira = TipoDeCarteira.FISICA,
    saldo: Double,
    extrato: Double
) : Carteira(senha, tipo, saldo, extrato) {



}