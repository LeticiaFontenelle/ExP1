
package negocio;


public class Quilograma implements IUnidadeMetrica {
    
    
    private float quilo, libra;
    
    public float getQuilo() { return quilo;} 
    
    public Quilograma (float libra) {
        this.libra = libra;
      }      
        
    @Override
    public void converter (){
        quilo = libra / 2.2046f;
    
    }
   }
