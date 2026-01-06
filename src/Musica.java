public class Musica {
    String titulo;
    String artista;
    int anoDelacamento;
    int somaDasAvaliacoes;
    int totalDeAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("Musica: " +titulo);
        System.out.println("Artista: " +artista);
        System.out.println("Ano de laçamento: " +anoDelacamento);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacao;
    }
}
