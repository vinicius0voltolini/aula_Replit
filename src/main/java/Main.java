
public class Main {
  public static void main(String[] args) {
  String nome;
  int idade;
  double altura;
  double peso;

    System.out.println("Por favor, informe seu nome: ");
    nome = System.console().readLine();
    System.out.println("Por favor, informe sua idade: ");
    idade = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, informe sua altura: ");
    altura = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, informe seu peso: ");
    peso = Double.parseDouble(System.console().readLine());

    System.out.println();
    
    System.out.println("Seu nome é: " + nome);
    System.out.println("Sua idade é: " + idade);
    System.out.println("Sua altura é: " + altura);
    System.out.println("Seu peso é: " + peso);

    
    
  }
}