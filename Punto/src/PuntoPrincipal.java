/*
 
 */
public class PuntoPrincipal {
    public static void main (String[] args ){
        Punto a = new Punto ("A ", 5, 6);
        Punto b = new Punto ("B ", 20, 20);
        Distancia d1 = new Distancia (a, b);
        
        System.out.println("DISTANCIA ENTRE DOS PUNTOS " + d1);
        
        
        
        //distancia = Math.sqrt (Math.pow (b.getX() ) * (a.getX()) ) ;
                
        //System.out.println("La distancia es " + distancia);
        
        
    }
    
    
}
