package POO.carteira

class CarteiraDigital(
    senha: String,
    tipo: TipoDeCarteira = TipoDeCarteira.DIGITAL,
    saldo: Double,
    extrato: Double
): Carteira(senha, tipo, saldo, extrato) {


}