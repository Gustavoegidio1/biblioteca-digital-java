import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        criarItem(teclado);
    }

    public static void criarItem(Scanner teclado) {
       ItemBibliotecaDigital item;

       String titulo;
       String autor;

       while(true) {
           System.out.print(
                   "Qual item deseja criar:\n" +
                           "1 - E-book\n" +
                           "2 - Vídeo Digital\n" +
                           "3 - Encerrar Programa\n" +
                           "Escolha: "
           );

           int escolha = teclado.nextInt();
           teclado.nextLine();

           if(escolha >= 1 && escolha < 3) {
               System.out.print("Qual o Título: ");
               titulo = teclado.nextLine();

               System.out.print("Qual o Autor: ");
               autor = teclado.nextLine();
           }

           else if(escolha == 3) {
               System.out.println("Programa finalizado");
               return;
           }
           else{
               System.out.println("Opção inexistente");
               continue;
           }

           switch(escolha) {
               case 1:
                   item = new Ebook(titulo, autor);
                   menuEbook(teclado, (Ebook) item);
                   continue;
               case 2:
                   item = new VideoDigital(titulo, autor);
                   menuVideoDigital(teclado, (VideoDigital) item);
                   continue;
           }

       }
    }
    public static void menuEbook(Scanner teclado, Ebook ebook) {
        while(true) {
            System.out.print(
                    "Qual opção deseja:\n" +
                            "1 - Ver Descrição do E-book\n" +
                            "2 - Baixar E-book\n" +
                            "3 - Sair\n" +
                            "Escolha: "
            );

            int escolha = teclado.nextInt();
            teclado.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println(ebook.descricao());
                    continue;
                case 2:
                    ebook.baixar();
                    continue;
                case 3:
                    return;
                default:
                    System.out.println("Opção inexistente!");
                    continue;
            }
        }
    }

    public static void menuVideoDigital(Scanner teclado, VideoDigital video) {
        while(true) {
            System.out.print(
                    "Qual opção deseja:\n" +
                    "1 - Ver Descrição do Vídeo Digital\n" +
                    "2 - Baixar Vídeo\n" +
                    "3 - Visualizar Vídeo:\n" +
                    "4 - Sair\n" +
                    "Escolha: "
            );

            int escolha = teclado.nextInt();
            teclado.nextLine();

            switch(escolha) {
                case 1:
                    System.out.println(video.descricao());
                    continue;
                case 2:
                   video.baixar();
                    continue;
                case 3:
                    video.visualizar();
                    continue;
                case 4:
                    return;
                default:
                    System.out.println("Opção inexistente!");
                    continue;
            }
        }
    }
}