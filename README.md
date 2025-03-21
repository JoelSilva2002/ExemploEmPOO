Sistema de Funcionários - Java (POO)
Este é um projeto simples em Java que demonstra os princípios da Programação Orientada a Objetos (POO), incluindo herança, encapsulamento, abstração e polimorfismo. Ele permite criar funcionários de diferentes tipos (Gerente e Desenvolvedor) e calcular seus bônus com base em regras específicas.

🛠 Tecnologias utilizadas
Java (JDK 11 ou superior)
Programação Orientada a Objetos (POO)
📌 Funcionalidades
✅ Criar diferentes tipos de funcionários (Gerente e Desenvolvedor).
✅ Calcular bônus de acordo com regras específicas:

Gerente: Recebe bônus se atingir a meta.
Desenvolvedor: Recebe bônus se falar inglês.
✅ Uso de conceitos de POO:
Herança: Gerente e Desenvolvedor herdam de Funcionario.
Encapsulamento: O salário é protegido e acessado via métodos.
Polimorfismo: O método calcularBonus() é implementado de forma diferente para cada classe.
Abstração: A classe Funcionario é abstrata, garantindo que subclasses implementem o cálculo do bônus.

📌 Exemplo de Saída:
Gerente:
Nome: Carlos
Salário: R$8000.0
Meta batida: true
Bônus: R$5000.0

Desenvolvedor:
Nome: Ana
Salário: R$6000.0
Linguagem: Java
Fala inglês: false
Bônus: R$0.0
