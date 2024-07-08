public class Media {
    String aluno = "";
    double notaPortugues = 0;
    double notaMatematica = 0;
    double notaHistoria = 0;
    double notaFilosofia = 0;

    public Media(String aluno, double notaPort, double notaMat, double notaHist, double notaFil) {
        this.aluno = aluno;
        this.notaPortugues = notaPort;
        this.notaMatematica = notaMat;
        this.notaHistoria = notaHist;
        this.notaFilosofia = notaFil;
    }

    public void CalcularMedia() {
        System.out.println("*** Boletim do aluno: " + this.aluno + " ***");
        System.out.println("* Nota de Português: " + this.notaPortugues);
        System.out.println("* Nota de Matemática: " + this.notaMatematica);
        System.out.println("* Nota de História: " + this.notaHistoria);
        System.out.println("* Nota de Filosofia: " + this.notaFilosofia);
        double mediaFinal = (this.notaPortugues + this.notaMatematica + this.notaHistoria + this.notaFilosofia) / 4;
        System.out.println("** Média final: " + mediaFinal + " **");

        if(mediaFinal < 5) {
            System.out.println("*** O aluno " + this.aluno + "REPROVADO :( ***");
        } else if (mediaFinal >= 5) {
            System.out.println("*** O aluno" + this.aluno + "de Recuperação '-' ***");
        } else if (mediaFinal >= 7) {
            System.out.println("*** O aluno " + this.aluno + "está APROVADO! :) ***");
        }
    }


}
