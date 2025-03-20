public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected boolean metaBatida;

    public abstract double calcularBonus();

    public void setMetaBatida(boolean status) {
        this.metaBatida = status;
    }

    public boolean isMetaBatida() {
        return metaBatida;
    }

}
