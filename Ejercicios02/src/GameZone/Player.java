package GameZone;
public class Player {
    private Die []dados;
    private Integer numeroDados;
    
    public Player(Integer n){
        numeroDados=n;
        dados=new Die[n];
        for (int i = 0; i < n; i++) {
          dados[i] = new Die();
        }
    }
    public void lanzamiento (){
        for (int i = 0; i < this.numeroDados; i++) {
            dados[i].mostrar();   
        }
    }
    public Integer resultado(){
        int []contador={0,0,0,0,0,0};
        for (int i = 0; i < numeroDados; i++) {
            contador[dados[i].getNumerito()-1]++;   
        }
    int mayor=0;
        for (int i = 0; i < 6; i++) {
            if(contador[i]>mayor){
                mayor=contador[i];
            }
            
        }
        return mayor;
    }
}
