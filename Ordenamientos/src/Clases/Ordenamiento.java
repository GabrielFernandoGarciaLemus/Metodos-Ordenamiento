package Clases;

import java.util.Comparator;


public class Ordenamiento implements Comparator<Consolas>{
    
    @Override
    public int compare(Consolas con1, Consolas con2) {
        return Double.compare((con1.precio), con2.precio);
        
    }
}
