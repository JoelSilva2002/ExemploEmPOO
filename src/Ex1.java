public class Ex1 {
    public static void main(String[] args) {
        // Criando um Gerente
        Gerente gerente = new Gerente("Carlos", 8000, 5000);
        gerente.setMetaBatida(true);

        // Criando um Desenvolvedor
        Desenvolvedor dev = new Desenvolvedor("Ana", 6000, "Java", false);

        // Imprimindo os resultados
        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.nome);
        System.out.println("Salário: R$" + gerente.salario);
        System.out.println("Meta batida: " + gerente.isMetaBatida());
        System.out.println("Bônus: R$" + gerente.calcularBonus());

        System.out.println("\nDesenvolvedor:");
        System.out.println("Nome: " + dev.nome);
        System.out.println("Salário: R$" + dev.salario);
        System.out.println("Linguagem: " + dev.linguagem);
        System.out.println("Fala inglês: " + dev.metaBatida);
        System.out.println("Bônus: R$" + dev.calcularBonus());
    }
}
