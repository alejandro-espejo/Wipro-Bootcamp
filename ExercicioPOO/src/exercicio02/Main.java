package exercicio02;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Thiago", 12345,
                new Disciplina("Java", 9.5f, 0, 6));
        aluno.media();

    }
}
