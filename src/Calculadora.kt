import java.util.*

fun main(args: Array<String>) {

    //Variaveis
    val selecioneOperacao: Int
    val teclado = Scanner(System.`in`)
    var numeroA: Int
    var numeroB: Int
    var resultado: Int

    //Entrada de dados
    println("Olá, bem-vindo!")
    println("1 - Multiplicação")
    println("2 - Subtração")
    println("3 - Divisão")
    println("4 - Adição")
    println("Selecione uma das opções acima: ")
    selecioneOperacao = teclado.nextInt()

    //Processamento
    if (selecioneOperacao == 1) {

        println("Você escolheu Multiplicação!!")

        println("Digite o primeiro numero: ")
        numeroA = teclado.nextInt()

        println("Digite o segundo numero: ")
        numeroB = teclado.nextInt()

        resultado = numeroA * numeroB

        println("O resultado é: $resultado")

    } else {

        if (selecioneOperacao == 2) {

            println("Você escolheu Subtração!!")

            println("Digite o primeiro numero: ")
            numeroA = teclado.nextInt()

            println("Digite o segundo numero: ")
            numeroB = teclado.nextInt()

            resultado = numeroA - numeroB

            println("O resultado é: $resultado")

        } else {

            if (selecioneOperacao == 3) {

                println("Você escolheu Divisão!!")

                println("Digite o primeiro numero: ")
                numeroA = teclado.nextInt()

                println("Digite o segundo numero: ")
                numeroB = teclado.nextInt()

                resultado = numeroA / numeroB

                println("O resultado é: $resultado")

            } else {

                if (selecioneOperacao == 4) {
                    println("Você escolheu Adição!!")

                    println("Digite o primeiro numero: ")
                    numeroA = teclado.nextInt()

                    println("Digite o segundo numero: ")
                    numeroB = teclado.nextInt()

                    resultado = numeroA + numeroB

                    println("O resultado é: $resultado")
                }
            }
        }
    }
}