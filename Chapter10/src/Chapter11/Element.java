package Chapter11;
public abstract class Element {
    private String symbol;
    private Integer atomicnumber;
    private Double pAtomico;

    public Element(String symbol, Integer nAtomic, Double pAtomic) {
        this.symbol = symbol;
        this.atomicnumber = nAtomic;
        this.pAtomico = pAtomic;
    }

    public String getSymbol() {
        return symbol;
    }

    public Integer getnAtomic() {
        return atomicnumber;
    }

    public Double getpAtomic() {
        return pAtomico;
    }
    
    public abstract void describeElement();
}

