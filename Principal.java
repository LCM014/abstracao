import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        Indexação indice = new Indexação();
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite C; Python ou Java");
        indice.abstrairTexto(leitura.next());
    }
}
