class Analista(
    analistaNome: String,
    analistaCpf: String,
    analistaContaCorrente: ContaCorrente,
    valorHora: Double,
    horasTrabalhadas: Double):
    Funcionario(
    nome = analistaNome,
    cpf = analistaCpf,
    salario = valorHora * horasTrabalhadas,
    contaCorrente = analistaContaCorrente)
{

        override fun toString(): String
        {
            return """Nome: $nome
            |Salário: $salario""".trimMargin()
        }
}