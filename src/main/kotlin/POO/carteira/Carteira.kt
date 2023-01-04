package POO.carteira

abstract class Carteira(
    val senha: String,
    var tipo: TipoDeCarteira,
    var saldo: Double,
    var extrato: Double
) : Boleto