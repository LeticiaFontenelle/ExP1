
package negocio;


public class Libra implements IUnidadeMetrica {
    
private float quilo, libra;
    
    public float getLibra () { return libra;} 
    
    public Libra (float quilo) {
        this.quilo = quilo;
      }      
        
    @Override
    public void converter (){
        libra = quilo * 2.2046f;
    
    }


}
