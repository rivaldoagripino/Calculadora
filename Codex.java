import java.util.Scanner;

public class Codex {
	Scanner sc = new Scanner(System.in);
	
	public void Operators() {
		int escolha;
		do {
			System.out.println("[0] - Sair\n[1] - Operações básicas\n[2] - Raiz\n[3] - Potência\n[4] - Par ou impar\n[5] - Divisível\n");
			escolha = sc.nextInt();
			switch(escolha) {
				case 1:
					System.out.println("Qual o operador que deseja utilizar?\n[0] - Voltar\n[1] - Soma\n[2] - Subtração\n[3] - Divisão\n[4] - Multiplicação");
					int op = sc.nextInt();
					if (op == 1) {
						System.out.println("Digite o primeiro valor: ");
						int n1 = sc.nextInt();
						System.out.println("Digite o segundo valor: ");
						int n2 = sc.nextInt();
						System.out.println("A soma ente " + n1 + " e " + n2 + " é: ");
						System.out.println(n1 + n2);
					} else if (op == 2) {
						System.out.println("Digite o primeiro valor: ");
						int n1 = sc.nextInt();
						System.out.println("Digite o segundo valor: ");
						int n2 = sc.nextInt();
						System.out.println("A subtração ente " + n1 + " e " + n2 + " é: ");
						System.out.println(n1 - n2);
					} else if (op == 3) {
						System.out.println("Digite o primeiro valor: ");
						int n1 = sc.nextInt();
						System.out.println("Digite o segundo valor: ");
						int n2 = sc.nextInt();
						System.out.println("A divisão ente " + n1 + " e " + n2 + " é: ");
						System.out.println(n1 / n2);
					} else if (op == 4) {
						System.out.println("Digite o primeiro valor: ");
						int n1 = sc.nextInt();
						System.out.println("Digite o segundo valor: ");
						int n2 = sc.nextInt();
						System.out.println("A multiplicação ente " + n1 + " e " + n2 + " é: ");
						System.out.println(n1 * n2);
					} else if (op == 0) {
						continue;
					} else {
						System.out.println("Operador inválido. Por favor, selecione um operador válido");
						continue;
					}
				case 2:
					System.out.println("Escolha o valor desejado para encontrar a raiz.");
					int n1 = sc.nextInt();
					System.out.println("O valor da rair é: " + Math.sqrt(n1));
					continue;
				case 3:
					System.out.println("Digite o valor da base: ");
					int n2 = sc.nextInt();
					System.out.println("Digite o valor do expoente: ");
					int n3 = sc.nextInt();
					System.out.println("O resultado é:" + Math.pow(n2, n3));
					continue;
				case 4:
					System.out.println("Digite um valor e direi se é impar ou par.");
					int n4 = sc.nextInt();
					if (n4 % 2 == 0) {
						System.out.println("Este valor é par.");
						continue;
					} else {
						System.out.println("Este valor é impar.");
						continue;
					}
				case 5:
					System.out.println("Digite um valor e irei dizer se é ou não divisível por 3.");
					int n5 = sc.nextInt();
					if (n5 % 3 == 0) {
						System.out.println("Sim, é divisível");
						continue;
					} else {
						System.out.println("Não, não é divisível.");
						continue;
					}
			}
		} while(escolha != 0);
	}
	
	
	public void Start() {
		System.out.println("Seja bem-vindo. Por favor, digite o seu nome.");
		String user = sc.next();
		System.out.println("Certo, " + user + " qual a opção que deseja acessar?");
		
		
	}
}
