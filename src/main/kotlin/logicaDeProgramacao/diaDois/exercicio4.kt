package diaDois
fun main() {

    do {
        println("Digite um número de 0 a 10")
        var numero = readln().toInt()
    } while (!(0..10).contains(numero))
    

}
