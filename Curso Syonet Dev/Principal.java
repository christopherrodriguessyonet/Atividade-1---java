public class Principal {
    public static void main(String[] args) {
        // Criação de uma instância da classe Turma
        Turma turma1 = new Turma();

        // Cadastrando alunos normais
        turma1.adicionarAluno(new Aluno("Alice", "001", 8.5, 80, 5));
        turma1.adicionarAluno(new Aluno("Homelander", "002", 10.0, 99, 9));
        turma1.adicionarAluno(new Aluno("Saitama", "003", 6.0, 100, 10));
        turma1.adicionarAluno(new Aluno("Flash", "004", 10.0, 70, 8));

        // Listando todos os alunos
        System.out.println("Alunos na turma Original:");
        for (Aluno aluno : turma1.listarAlunos()) {
            System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula + ", Nota: " + aluno.nota + ". Sua força é: " + aluno.forca + ", com nível de dificuldade: " + aluno.dificuldade);
        }
        // Removendo um aluno
        turma1.removerAluno("001");
        System.out.println("===================");

        // Listando novamente com o aluno removido
        System.out.println("Alunos na turma Atualizados:");
        for (Aluno aluno : turma1.listarAlunos()) {
            System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula + ", Nota: " + aluno.nota + ". Sua força é: " + aluno.forca + ", com nível de dificuldade: " + aluno.dificuldade);
        }
        System.out.println("===================");
        
        // Adiocionando aluno com matrícula igual
        turma1.adicionarAluno(new Aluno("Coringa", "002", 8.5, 0, 8));

        // Listando, pois não adicionou o aluno repetido
        System.out.println("Alunos na turma:");
        for (Aluno aluno : turma1.listarAlunos()) {
            System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula + ", Nota: " + aluno.nota + ". Sua força é: " + aluno.forca + ", com nível de dificuldade: " + aluno.dificuldade);
        }

        // Calculando e exibindo a média das notas
        double media = turma1.calcularMedia();
        System.out.println("Média das notas: " + media);

        System.out.println("===================");
        // Comparar força de dois alunos
        turma1.compararForcaDeDoisAlunos();
    }
}
