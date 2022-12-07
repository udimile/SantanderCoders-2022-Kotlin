package diaUm
fun main() {
//    Gerador de usuarios. Crie um programa que receba o nome, sobrenome e ano de nascimento do usuário, e a partir disso gere um nick com as duas primeiras letras do nome, seu sobrenome
//    ao contrario e os ultimos dois digitos de seu ano de nascimento tudo minusculo.
//
//    Exemplo:
//
//    - Maria
//    - Medeiros
//    - 1984
//
//    nick gerado: masoriedem84


    println("Digite o nome: ")
    val nome = readln().lowercase().take(2)
    println("Digite o sobrenome: ")
    val sobrenome = readln().lowercase().reversed()
    println("Digite o ano de nascimento: ")
    val anoDeNascimento = readln().takeLast(2)

    println(
        "nick gerado: $nome$sobrenome$anoDeNascimento"
    )
}