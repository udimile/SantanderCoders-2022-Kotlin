package diaDois18
fun main() {
    println("Qual a idade do nadador?")
    val idadeDoNadador = readln().toInt()

    when (idadeDoNadador){
        in 5 .. 7 -> println("Infantil A")
        in 8 ..10 -> println("Infantil B")
        in 11..13 -> println("Juvenil A")
        in 14..17 -> println("Juvenil B")
        in 18..100 -> println("Sênior")

    }
}