public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel{

    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }
    @Override
    public String descricao() {
        return ("Título: " + getTitulo() + "\n" +
                "Autor: " + getAutor());
    }

    @Override
    public void baixar() {
        System.out.println("O Vídeo Digital foi instalado");
    }

    @Override
    public void visualizar() {
        System.out.println("O vídeo digital está sendo visualizado.");
    }
}
