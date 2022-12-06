fun main() {
    println("Em que ano você nasceu?")
    val anoDeNascimento = readln().toInt()
    println("Em que ano nós estamos?")
    val anoAtual = readln().toInt()

    val idadeEmAnos = anoAtual - anoDeNascimento
    val idadeEmSemanas = idadeEmAnos * 52

    println("Você tem $idadeEmAnos, você já viveu aproximadamente $idadeEmSemanas semanas.")
}