public class Gerente extends Funcionario{
    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual){
        this.nome = nome;
        this.salario = salario;
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularBonus() {
        return metaBatida ? bonusAnual : 0;
    }
}