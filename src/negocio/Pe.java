
package negocio;


public class Pe implements IUnidadeMetrica {
    
    private float metro, pe;
    
    public float getPe () { return pe;} 
    
    public Pe (float metro) {
        this.metro = metro;
      }      
        
    @Override
    public void converter (){
        pe = metro* 3.28084f;
    
        
    }
    
}