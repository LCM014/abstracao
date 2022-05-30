public class Indexação 
{
    private String indice;

    public String getIndice() 
    {
        return indice;
    }

    public void setIndice(String indice) 
    {
        this.indice = indice;
    }

    public String abstrairTexto(String texto)
    {
        String resposta = null;

        if (texto.equalsIgnoreCase("c"))
        {
            resposta = "C a linguagem estruturada";
        }
    
        else if (texto.equalsIgnoreCase("java"))
        {
            resposta = "Java Orientação a objetos";
        }

        else if (texto.equalsIgnoreCase("phyton"))
        {
            resposta = "Python a linguagem de data Science";
        }

        return resposta;
        
    }
   
}

