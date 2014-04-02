package autosalone;

public class Veicoli {
    private int annoImmatricolazione;
    private String marca;
    private String modello;
    private String tipoAlimentazione;
    private int cilindrata;
    
    void setAi(int annoImmatricolazione){
        this.annoImmatricolazione = annoImmatricolazione;
    }
    int getAi(){
        return annoImmatricolazione;
    }
    void setMr(String marca){
        this.marca = marca;
    }
    String getMr(){
        return marca;
    }
    void setMd(String modello){
        this.modello = modello;
    }
    String getMd(){
        return modello;
    }
    void setTa(String tipoAlimentazione){
        this.tipoAlimentazione = tipoAlimentazione;
    }
    String getTa(){
        return tipoAlimentazione;
    }
    void setCc(int cilindrata){
        this.cilindrata = cilindrata;
    }
    int getCc(){
        return cilindrata;
    }
    
}
