import java.util.Scanner;

public class Codex {
	Scanner sc = new Scanner(System.in);
	
	public void Operators() {
		int escolha;
		do {
			System.out.println("[0] - Sair\n[1] - Opera��es b�sicas\n[2] - Raiz\n[3] - Pot�ncia\n[4] - Par ou impar\n[5] - Divis�vel\n");
			escolha = sc.nextInt();
			switch(escolha) {
				case 1:
					System.out.println("Qual o operador que deseja utilizar?\n[0] - Voltar\n[1] - Soma\n[2] - Subtra��o\n[3] - Divis�o\n[4] - Multiplica��o");
					int op = sc.nextInt();
					if (op == 1) {
						System.out.println("Digite o primeiro valor: ");
						int n1 = sc.nextInt();
						System.out.println("Digite o segundo valor: ");
						int n2 = sc.nextInt();
						System.out.println("A soma ente " + n1 + " e " + n2 + " �: ");
						System.out.println(n1 + n2);
					} else if (op == 2) {
						System.out.println("Digite o primeiro valor: ");
						int n1 = sc.nextInt();
						System.out.println("Digite o segundo valor: ");
						int n2 = sc.nextInt();
						System.out.println("A subtra��o ente " + n1 + " e " + n2 + " �: ");
						System.out.println(n1 - n2);
					} else if (op == 3) {
						System.out.println("Digite o primeiro valor: ");
						int n1 = sc.nextInt();
						System.out.println("Digite o segundo valor: ");
						int n2 = sc.nextInt();
						System.out.println("A divis�o ente " + n1 + " e " + n2 + " �: ");
						System.out.println(n1 / n2);
					} else if (op == 4) {
						System.out.println("Digite o primeiro valor: ");
						int n1 = sc.nextInt();
						System.out.println("Digite o segundo valor: ");
						int n2 = sc.nextInt();
						System.out.println("A multiplica��o ente " + n1 + " e " + n2 + " �: ");
						System.out.println(n1 * n2);
					} else if (op == 0) {
						continue;
					} else {
						System.out.println("Operador inv�lido. Por favor, selecione um operador v�lido");
						continue;
					}
				case 2:
					System.out.println("Escolha o valor desejado para encontrar a raiz.");
					int n1 = sc.nextInt();
					System.out.println("O valor da rair �: " + Math.sqrt(n1));
					continue;
				case 3:
					System.out.println("Digite o valor da base: ");
					int n2 = sc.nextInt();
					System.out.println("Digite o valor do expoente: ");
					int n3 = sc.nextInt();
					System.out.println("O resultado �:" + Math.pow(n2, n3));
					continue;
				case 4:
					System.out.println("Digite um valor e direi se � impar ou par.");
					int n4 = sc.nextInt();
					if (n4 % 2 == 0) {
						System.out.println("Este valor � par.");
						continue;
					} else {
						System.out.println("Este valor � impar.");
						continue;
					}
				case 5:
					System.out.println("Digite um valor e irei dizer se � ou n�o divis�vel por 3.");
					int n5 = sc.nextInt();
					if (n5 % 3 == 0) {
						System.out.println("Sim, � divis�vel");
						continue;
					} else {
						System.out.println("N�o, n�o � divis�vel.");
						continue;
					}
			}
		} while(escolha != 0);
	}
	
	
	public void Start() {
		System.out.println("Seja bem-vindo. Por favor, digite o seu nome.");
		String user = sc.next();
		System.out.println("Certo, " + user + " qual a op��o que deseja acessar?");
		
		
	}
}
