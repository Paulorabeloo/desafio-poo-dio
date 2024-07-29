package br.com.dio.desafio.dominio;


public class Projeto extends Conteudo  
{
    private int dificuldade;

    @Override
    public double calcularXp() 
    {
        return XP_PADRAO * dificuldade;
    }

    public Projeto() 
    {
    }

    public int getDificuldade() 
    {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) 
    {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() 
    {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dificuldade=" + dificuldade +
                '}';
    }
}
