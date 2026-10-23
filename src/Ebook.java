public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    public Ebook(String titulo, String autor) {
        super(titulo, autor);
    }
    @Override
    public String descricao() {
        return ("Título: " + getTitulo() + "\n" +
                "Autor: " + getAutor());
    }

    @Override
    public void baixar() {
        System.out.println("O E-book foi instalado");
    }


}
