package formulario;

import java.util.Scanner;

public class Triagem {
	public static void main(String args[]) {
		int simnao, idade, continuar = 1, y = 0, quantidadePessoasAptas = 0, habitantes = 0, amostra = 0, temporario = 0, naoInteressadas = 0, definitivo = 0;
		String nome, sobrenome, municipio, estado;

		Scanner ler = new Scanner(System.in);

		System.out.println(
				"Ol�! \nEstamos fazendo uma prospec��o para arrecadamento de sangue.\nVilas pequenas precisam de um planejamento para deslocamento de equipamentos de coletas de acordo com o interesse dos cidad�os da regi�o.");

		System.out.println("Vamos come�ar. Em qual munic�pio ser� realizada a pesquisa? ");
		municipio = ler.nextLine();

		System.out.println("Este munic�pio se encontra em que estado? ");
		estado = ler.nextLine();

		System.out.println("Aproximadamente, quantos habitantes residem nesse munic�pio? ");
		habitantes = ler.nextInt();

		int id[] = new int[habitantes];
		String n[] = new String[habitantes], s[] = new String[habitantes], e[] = new String[habitantes];

		// in�cio do formul�rio

		do {

			while (quantidadePessoasAptas < habitantes) {

				// dados pessoais

				System.out.println("Por favor, digite seu primeiro nome: ");
				nome = ler.next();

				System.out.println("Agora, digite seu sobrenome: ");
				sobrenome = ler.next();
				
				amostra++;

				System.out.println("Voc� tem interesse em doar sangue? \nDigite 1 para sim e 2 para n�o.");
				simnao = ler.nextInt();
				
				while (simnao != 1 && simnao != 2) {
					System.out.println("Op��o Inv�lida. \nDigite 1 para sim e 2 para n�o.");
					simnao = ler.nextInt();
				}

				if (simnao == 2) {
					System.out.println("Obrigado por ajudar nos dados da pesquisa. Mesmo que n�o tenha interesse, nos ajude a divulgar, pois a doa��o de sangue salva vidas!!!");
					naoInteressadas++;
					break;
				}

				System.out.println("Diga-nos a sua idade: ");
				idade = ler.nextInt();

				if (idade < 16) {
					System.out.println("Voc� s� pode doar sangue se tiver mais de 16 anos. Esperamos seu retorno em breve!");
					temporario++;
					break;
				} else if (idade > 69) {
					System.out.println("Voc� s� pode doar sangue se tiver menos de 69 anos. Obrigado pelo interesse.");
					definitivo++;
					break;
				}

				System.out.println("Voc� pesa mais de 50kg? \nDigite 1 para sim e 2 para n�o.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Op��o Inv�lida. \nDigite 1 para sim e 2 para n�o.");
					simnao = ler.nextInt();
				}

				if (simnao == 2) {
					System.out.println("Voc� precisa ter mais de 50kg para doar sangue. Obrigado pelo interesse :)");
					temporario++;
					break;
				}

				// question�rio

				System.out.println("Voc� possui tatuagens? \nDigite 1 para sim e 2 para n�o.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Op��o Inv�lida. \nDigite 1 para sim e 2 para n�o.");
					simnao = ler.nextInt();
				}

				if (simnao == 1) {
					System.out.println(
							"Faz mais de um ano que concluiu a �ltima tatuagem? \nDigite 1 para sim e 2 para n�o.");
					simnao = ler.nextInt();

					while (simnao != 1 && simnao != 2) {
						System.out.println("Op��o Inv�lida. \nDigite 1 para sim e 2 para n�o.");
						simnao = ler.nextInt();
					}

					if (simnao == 2) {
						System.out.println(
								"Para doa��o de sangue, � necess�rio ter no m�nimo 12 meses de sua �ltima tatuagem. \nObrigado pelo interesse, aguardamos seu retorno daqui um tempo :)");
						temporario++;
						break;
					}
				}

				System.out.println("Voc� teve hepatite ap�s os 11 anos? \nDigite 1 para sim e 2 para n�o.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Op��o Inv�lida. \nDigite 1 para sim e 2 para n�o.");
					simnao = ler.nextInt();
				}

				if (simnao == 1) {
					System.out.println(
							"Para doa��o de sangue, voc� n�o pode ter contra�do hepatite ap�s os 11 anos de idade. Agradecemos o interesse :)");
					definitivo++;
					break;
				}

				System.out.println(
						"Voc� tem alguma evid�ncia de hepatite B e C, AIDS (v�rus HIV), doen�as ligadas ao v�rus HTLV I e II ou doen�a de chagas? \nDigite 1 para sim e 2 para n�o.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Op��o Inv�lida. \nDigite 1 para sim e 2 para n�o.");
					simnao = ler.nextInt();
				}

				if (simnao == 1) {
					System.out.println(
							"Para doa��o de sangue, voc� n�o pode ter contra�do nenhuma das doen�as citadas. Agradecemos o interesse :)");
					definitivo++;
					break;
				}

				System.out.println(
						"Voc� � ou foi usu�rio de drogas il�citas injet�veis? \nDigite 1 para sim e 2 para n�o.");
				simnao = ler.nextInt();

				while (simnao != 1 && simnao != 2) {
					System.out.println("Op��o Inv�lida. \nDigite 1 para sim e 2 para n�o.");
					simnao = ler.nextInt();
				}

				if (simnao == 1) {
					System.out.println(
							"Para doa��o de sangue, voc� n�o pode ter sido usu�rio de drogas il�citas injet�veis. Agradecemos o interesse :)");
					definitivo++;
					break;
				}

				System.out.println(
						"�timo, voc� est� apto para doar sangue, pode por favor nos fornecer um endere�o de e-mail?");
				String email = ler.next();

				n[y] = nome;
				s[y] = sobrenome;
				id[y] = idade;
				e[y] = email;

				y++;
				quantidadePessoasAptas++;

				break;

			}

			System.out.println("\nContinuar para o pr�ximo candidato? \nDigite 1 para sim e 2 para n�o!");
			continuar = ler.nextInt();

			while (continuar != 1 && continuar != 2) {
				System.out.println("Op��o Inv�lida. \nDigite 1 para sim e 2 para n�o.");
				continuar = ler.nextInt();
			}

			System.out.println("\n");

		} while (continuar != 2);

		System.out.println("A pesquisa foi feita em " + municipio + " - " + estado + ", uma cidade com aproximadamente " + habitantes + " habitantes. O n�mero de pessoas entrevistadas foi de " + amostra + ".\nDessa amostra, constatamos que: \nA quantidade pessoas interessadas e aptas � de " + quantidadePessoasAptas + ".\nA quantidade de pessoas n�o interessadas � de " + naoInteressadas + ".\nA quantidade de pessoas interessadas mas com impedimentos tempor�rios � de " + temporario + ".\nA quantidade de pessoas interessadas com impedimentos definitivos � de " + definitivo + ".\nEstima-se que nessa regi�o � poss�vel arrecadar aproximadamente " + ((float) quantidadePessoasAptas / 2) + " litros de sangue (" + quantidadePessoasAptas + " bolsas) nesse momento.");

		System.out.println("Segue a lista de pessoas interessadas e aptas abaixo com nome/sobrenome/idade/e-mail:");

		for (y = 0; y < quantidadePessoasAptas; y++) {
			System.out.println("\n" + n[y] + " " + s[y] + ", " + id[y] + " anos, " + e[y]);
		}

		System.out.println(
				"\n\n\n\nProjeto desenvolvido por: \nFrancine Massaro \nGabriel Fernandes \nLeonardo Nogueira \nMariana Carvalho \nVinicius Menezes \n#turma15eazul");
	}
}
