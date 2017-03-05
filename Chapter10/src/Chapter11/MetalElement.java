package Chapter11;
public class MetalElement extends Element{
    public MetalElement(String symbol, Integer nAtomic, Double pAtomic) {
        super(symbol, nAtomic, pAtomic);
    }

    public void describeElement() {
       System.out.println("DESCRIPCION"); 
    }
       
    
}
