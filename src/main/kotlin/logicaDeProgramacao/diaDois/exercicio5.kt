package diaDois
fun main() {
    do {
        println("Qual o seu nome de usuário?")
        val usuario = readln()
        println("Qual o sua senha?")
        var senha = readln()
    } while (senha.contentEquals(usuario))


}