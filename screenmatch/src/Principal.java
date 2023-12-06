public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(7);

        System.out.println("A soma das avaliações é: " + meuFilme.somaDasAvaliacoes);
        System.out.println("O número total de avaliações é: " + meuFilme.totalDeAvaliacoes);
        System.out.println("A Média das Avaliações é: " + meuFilme.pegaMedia());

    }
}
