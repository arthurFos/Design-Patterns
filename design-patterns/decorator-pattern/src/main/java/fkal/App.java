package fkal;

import fkal.component.Cocktail;
import fkal.concretComponent.Caipirinha;
import fkal.concretComponent.Mojito;
import fkal.concretDecorator.Rum;
import fkal.concretDecorator.Tequila;
import fkal.concretDecorator.Vodka;

public class App 
{
    public static void main( String[] args )
    {
        Cocktail mojito = new Mojito();
        // plus rum + tequila
        mojito = new Rum(mojito);
        mojito = new Tequila(mojito);
        
        System.out.println(mojito.getDescription());
        
        Cocktail caipirinha = new Caipirinha();
        // plus 2 rum + vocka
        caipirinha = new Rum(mojito);
        caipirinha = new Rum(mojito);
        caipirinha = new Vodka(mojito);
        
        System.out.println(caipirinha.getDescription());
    }
}
