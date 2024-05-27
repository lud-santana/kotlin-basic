class Programador (
    programadorNome: String,
    programadorCpf: String,
    programadorSalario: Double,
    programadorContaCorrente: ContaCorrente
): Funcionario(
    nome = programadorNome,
    cpf = programadorCpf,
    salario = programadorSalario,
    contaCorrente = programadorContaCorrente
)
{

    private var nivel: String = ""

    constructor(programadorNome: String, programadorCpf: String, programadorSalario: Double, programadorContaCorrente: ContaCorrente, anosExperiencia: Int): this(programadorNome, programadorCpf, programadorSalario, programadorContaCorrente)
    {
        nivel = when {
            anosExperiencia <= 5 -> "Júnior"
            anosExperiencia >= 6 -> "Pleno"
            anosExperiencia > 9 -> "Sênior"
            else -> "Desconhecido"
        }
    }

    override fun toString(): String
    {
        return """Nome: $nome
            |Salário: $salario
            |Nível: $nivel""".trimMargin()
    }
}