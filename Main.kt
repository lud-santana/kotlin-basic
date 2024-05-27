fun main()
{
    //Instanciar objetos
    val conta1 = ContaCorrente("934587", "0481", 1000.0)
    val conta2 = ContaCorrente("123456", "2431", 1400.0)

    val programador1 = Programador("José", "12345678987", 2500.0, conta1, 4)
    val analista1 = Analista("Ana", "12312345678", conta2, 40.5, 186.0)

    //Apresentar funcionários
    println("${programador1.toString()}\n")
    println(analista1.toString())

    //Exibir saldo
    println("\nSALDOS\nValor do saldo da conta de ${programador1.nome}: ${conta1.saldo}")
    println("Valor do saldo da conta de ${analista1.nome}: ${conta2.saldo}")

    //Fazer saques
    conta1.metodoSaque(50.5)
    println("\nSAQUES\nValor do saldo da conta do ${programador1.nome} após saque: ${conta1.saldo}")
    conta2.metodoSaque(400.0)
    println("Valor do saldo da conta da ${analista1.nome} após saque: ${conta2.saldo}")

    //Fazer depósitos
    conta1.metodoDeposito(50.5)
    println("\nDEPÓSITOS\nValor do saldo da conta de ${programador1.nome} após depósito: ${conta1.saldo}")
    conta2.metodoDeposito(600.0)
    println("Valor do saldo da conta de ${analista1.nome} após depósito: ${conta2.saldo}")
}
