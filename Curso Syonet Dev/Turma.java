import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Turma implements Gerenciamento {
    public List<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        for (Aluno alunoRepetido : alunos) {
            if (alunoRepetido.matricula.equals(aluno.matricula)) {
                System.out.println("\nJá existe um aluno com essa matrícual. O aluno é " + alunoRepetido.nome);
                System.out.println("A matrícula repetida é a " + alunoRepetido.matricula);
                System.out.println("Tentaram inserir o aluno " + aluno.nome + " Com a mesma matricula");
                return;
            }
        }
        alunos.add(aluno);
    } 

    public void removerAluno(String matricula) {
        alunos.removeIf(aluno -> aluno.matricula.equals(matricula));
    }
    
    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos);
    }
    
    public double calcularMedia() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.nota;
        }
        return soma / alunos.size();
    }

    // Comparador de força de dois alunos
    public void compararForcaDeDoisAlunos() {
        if (alunos.size() < 2) {
            System.out.println("Não há alunos suficientes na turma para realizar a comparação.");
            return;
        }
        Random escolhendoAluno = new Random();
        Aluno aluno1 = alunos.get(escolhendoAluno.nextInt(alunos.size()));
        Aluno aluno2;
        do {
            aluno2 = alunos.get(escolhendoAluno.nextInt(alunos.size()));
        } while (aluno1 == aluno2);

        System.out.println("Aluno 1: " + aluno1.nome + " com força " + aluno1.forca);
        System.out.println("Aluno 2: " + aluno2.nome + " com força " + aluno2.forca);

        if (aluno1.forca > aluno2.forca) {
            System.out.println("O aluno " + aluno1.nome + " venceu");
        } else if (aluno1.forca < aluno2.forca) {
            System.out.println("O aluno " + aluno2.nome + " venceu");
        } else {
            System.out.println("Ambos os alunos têm a mesma força.");
        }
    }
}
