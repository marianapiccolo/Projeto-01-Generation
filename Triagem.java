package formulario;

import java.util.Scanner;

public class Triagem {
	public static void main(String args[]) {
		int simnao, idade, continuar = 1, y = 0, quantidadePessoasAptas = 0, habitantes = 0, amostra = 0, temporario = 0, naoInteressadas = 0, definitivo = 0;
		String nome, sobrenome, municipio, estado;

		Scanner ler = new Scanner(System.in);

		System.out.println(
				"Olá! \nEstamos fazendo uma prospecção para arrecadamento de sangue.\nVilas pequenas precisam de um planejamento para deslocamento de equipamentos de coletas de acordo com o interesse dos cidadãos da região.");

		System.out.println("Vamos começar. Em qual município será realizada a pesquisa? ");
		municipio = ler.nextLine();

		System.out.println("Este município se encontra em que estado? ");
		estado = ler.nextLine();

		System.out.println("Aproximadamente, quantos habitantes residem nesse município? ");
		habitantes = ler.nextInt();

		int id[] = new int[habitantes];
		String n[] = new String[habitantes], s[] = new String[habitantes], e[] = new String[habitantes];

		// início do formulário

		do {

			while (quantidadePessoasAptas < habitantes) {

				// dados pessoais

				System.out.println("Por favor, digite seu primeiro nome: ");
				nome = ler.next();

				System.out.println("Agora, digite seu sobrenome: ");
				sobrenome = ler.next();
				
				amostra++;

				System.out.println("Você tem interesse em doar sangue? \nDigite 1 para sim e 2 para não.");
				simnao = ler.nextInt();
				
				while (simnao != 1 && simnao != 2) {
					System.out.println("Opção Inválida. \nDigite 1 para sim e 2 para não.");
					simnao = ler.nextInt();
				}

				if (simnao == 2) {
					System.out.println("Obrigado por ajudar nos dados da pesquisa. Mesmo que não tenha interesse, nos ajude a divulgar, pois a doação de sangue salva vidas!!!");
					naoInteressadas++;
					break;
				}

				System.out.println("Diga-nos a sua idade: ");
				idade = ler.nextInt();

				if (idade < 16) {
					System.out.println("Você só pode doar sangue se tiver mais de 16 anos. Esperamos seu retorno em breve!");
					temporario++;
					break;
				} else if (idade > 69) {
					System.out.println("Você só pode doar sangue se tiver menos de 69 anos. Obrigado pelo interesse.");
					definitivo++;
					break;
				}

				System.out.println("Você pesa mais de 50kg? \nDigite 1 para sim e 2 para não.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Opção Inválida. \nDigite 1 para sim e 2 para não.");
					simnao = ler.nextInt();
				}

				if (simnao == 2) {
					System.out.println("Você precisa ter mais de 50kg para doar sangue. Obrigado pelo interesse :)");
					temporario++;
					break;
				}

				// questionário

				System.out.println("Você possui tatuagens? \nDigite 1 para sim e 2 para não.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Opção Inválida. \nDigite 1 para sim e 2 para não.");
					simnao = ler.nextInt();
				}

				if (simnao == 1) {
					System.out.println(
							"Faz mais de um ano que concluiu a última tatuagem? \nDigite 1 para sim e 2 para não.");
					simnao = ler.nextInt();

					while (simnao != 1 && simnao != 2) {
						System.out.println("Opção Inválida. \nDigite 1 para sim e 2 para não.");
						simnao = ler.nextInt();
					}

					if (simnao == 2) {
						System.out.println(
								"Para doação de sangue, é necessário ter no mínimo 12 meses de sua última tatuagem. \nObrigado pelo interesse, aguardamos seu retorno daqui um tempo :)");
						temporario++;
						break;
					}
				}

				System.out.println("Você teve hepatite após os 11 anos? \nDigite 1 para sim e 2 para não.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Opção Inválida. \nDigite 1 para sim e 2 para não.");
					simnao = ler.nextInt();
				}

				if (simnao == 1) {
					System.out.println(
							"Para doação de sangue, você não pode ter contraído hepatite após os 11 anos de idade. Agradecemos o interesse :)");
					definitivo++;
					break;
				}

				System.out.println(
						"Você tem alguma evidência de hepatite B e C, AIDS (vírus HIV), doenças ligadas ao vírus HTLV I e II ou doença de chagas? \nDigite 1 para sim e 2 para não.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Opção Inválida. \nDigite 1 para sim e 2 para não.");
					simnao = ler.nextInt();
				}

				if (simnao == 1) {
					System.out.println(
							"Para doação de sangue, você não pode ter contraído nenhuma das doenças citadas. Agradecemos o interesse :)");
					definitivo++;
					break;
				}

				System.out.println(
						"Você é ou foi usuário de drogas ilícitas injetáveis? \nDigite 1 para sim e 2 para não.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Opção Inválida. \nDigite 1 para sim e 2 para não.");
					simnao = ler.nextInt();
				}

				if (simnao == 1) {
					System.out.println(
							"Para doação de sangue, você não pode ter sido usuário de drogas ilícitas injetáveis. Agradecemos o interesse :)");
					definitivo++;
					break;
				}

				System.out.println(
						"Ótimo, você está apto para doar sangue, pode por favor nos fornecer um endereço de e-mail?");
				String email = ler.next();

				n[y] = nome;
				s[y] = sobrenome;
				id[y] = idade;
				e[y] = email;

				y++;
				quantidadePessoasAptas++;

				break;

			}

			System.out.println("\nContinuar para o próximo candidato? \nDigite 1 para sim e 2 para não!");
			continuar = ler.nextInt();

			while (continuar != 1 && continuar != 2) {
				System.out.println("Opção Inválida. \nDigite 1 para sim e 2 para não.");
				continuar = ler.nextInt();
			}

			System.out.println("\n");

		} while (continuar != 2);

		System.out.println("A pesquisa foi feita em " + municipio + " - " + estado + ", uma cidade com aproximadamente " + habitantes + " habitantes. O número de pessoas entrevistadas foi de " + amostra + ".\nDessa amostra, constatamos que: \nA quantidade pessoas interessadas e aptas é de " + quantidadePessoasAptas + ".\nA quantidade de pessoas não interessadas é de " + naoInteressadas + ".\nA quantidade de pessoas interessadas mas com impedimentos temporários é de " + temporario + ".\nA quantidade de pessoas interessadas com impedimentos definitivos é de " + definitivo + ".\nEstima-se que nessa região é possível arrecadar aproximadamente " + ((float) quantidadePessoasAptas / 2) + " litros de sangue (" + quantidadePessoasAptas + " bolsas) nesse momento.");

		System.out.println("Segue a lista de pessoas interessadas e aptas abaixo com nome/sobrenome/idade/e-mail:");

		for (y = 0; y < quantidadePessoasAptas; y++) {
			System.out.println("\n" + n[y] + " " + s[y] + ", " + id[y] + " anos, " + e[y]);
		}

		System.out.println(
				"\n\n\n\nProjeto desenvolvido por: \nFrancine Massaro \nGabriel Fernandes \nLeonardo Nogueira \nMariana Carvalho \nVinicius Menezes \n#turma15eazul");
	}
}
