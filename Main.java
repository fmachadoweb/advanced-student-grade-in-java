// FERNANDO MACHADO
// https://github.com/fmachadoweb
// Curso Let's Code

public class Main {
    public static void main(String[] args) {

        // coloque a nota para teste
        int nota = 80;
        String graduacao;

        // A 80, B 70, C 60, D 0
        // função if-else


        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

		// função switch / case	

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Aluno Reprovado!");
                break;
            default:
                System.out.println("Graduação Inválida");

        }

    }

}
