public class Desenvolvedor extends Funcionario {
    protected String linguagem;
    protected boolean falaIngles;

    // Construtor usando super() para inicializar nome e salario corretamente
    public Desenvolvedor(String nome, double salario, String linguagem, boolean falaIngles) {
        this.nome = nome;
        this.salario = salario;
        this.linguagem = linguagem;
        this.metaBatida = falaIngles;
    }

    @Override
    public double calcularBonus() {
        // O bônus é concedido apenas se o desenvolvedor fala inglês
        return metaBatida ? salario * 0.10 : 0;
    }
}
