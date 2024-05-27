class ContaCorrente (val numeroConta: String, val numeroAgencia: String, var saldo: Double)
{
    var limiteChequeEspecial: Double = 1000.0
        set (valor: Double)
        {
            if (valor in 500.0..2000.0) field = valor
        }

    fun metodoSaque(valor: Double) = if (this.saldo >= valor) this.saldo -= valor else println("Não foi possível sacar o valor indicado. Você não possui saldo suficiente para essa operação")

    fun metodoDeposito(valor: Double)
    {
        this.saldo += valor
    }
}


