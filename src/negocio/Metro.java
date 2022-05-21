
package negocio;


public class Metro implements IUnidadeMetrica{
    
    private float metro, pe;
    
    public float getMetro () { return metro;} 
    
    public Metro (float pe) {
        this.pe = pe;
      }      
        
    @Override
    public void converter (){
        metro = pe/ 3.28084f;
    
    }
    
}
