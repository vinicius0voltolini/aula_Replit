public class Main {
  public static void main(String[] args) {
  String nome;
  int idade;
  double altura;
  double peso;
  boolean S = true;
  boolean N = false;
    
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

    System.out.println("Gostaria de mudar algum dado? S/N");
    String respostaString = System.console().readLine();
    boolean resposta = respostaString.equalsIgnoreCase("S");

    String novoNome = "";
    int novaIdade  = 0;
    double novaAltura = 0.0;
    double novoPeso = 0.0; 
    if (resposta == S) {
        System.out.println("Qual dado gostaria de mudar?");
        String mudar = System.console().readLine();
        if (mudar.equals(nome)) { 
            System.out.println("Qual o novo nome?");
            novoNome = System.console().readLine();
        }
      if (mudar.equals("nome")) {
      System.out.println("Qual o seu nome?");
      novoNome = System.console().readLine();
        System.out.println("Seu nome é: " + novoNome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu peso é: " + peso);
        }
      
        if (mudar.equals("idade")) {
            System.out.println("Qual a nova idade?");
            novaIdade = Integer.parseInt(System.console().readLine());
          System.out.println("Seu nome é: " + nome);
           System.out.println("Sua idade é: " + novaIdade);
          System.out.println("Sua altura é: " + altura);
          System.out.println("Seu peso é: " + peso);
        }
        if (mudar.equals("altura")) {
            System.out.println("Qual a nova altura?");
            novaAltura = Double.parseDouble(System.console().readLine());
          System.out.println("Seu nome é: " + nome);
          System.out.println("Sua idade é: " + idade);
          System.out.println("Sua altura é: " + novaAltura);
           System.out.println("Seu peso é: " + peso);
        }
        if (mudar.equals("peso")) {
            System.out.println("Qual o novo peso?");
            novoPeso = Double.parseDouble(System.console().readLine());
          System.out.println("Seu nome é: " + nome);
          System.out.println("Sua idade é: " + idade);
          System.out.println("Sua altura é: " + altura);
          System.out.println("Seu peso é: " + novoPeso);
        }    
    }
        
      }
    
  }
