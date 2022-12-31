package POO.carteira

abstract class Carteira(
    val senha: String,
    var tipo: TipoDeCarteira,
    var saldo: Double,
    var extrato: Double
){
    fun deposito(){}
    fun saque(){}
    fun pagarBoleto(){
        println("OK")
    }
    fun tranferenciaPix(){}
    fun investir(){}
    fun guardar(){}
}