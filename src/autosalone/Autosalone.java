package autosalone;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Autosalone {

    public static void main(String[] args) {
        int scelta = 1, sceltaCase1 = 1, anno = 0, cilindrata = 0;
        String codNp = "", marca = "", modello = "", alimentazione = "", codScelta = "", codSceltaCase1 = "", codAi = "", codMr = "", codMd = "", codTa = "", codCc = "";
        Veicoli v1 = new Veicoli();
        InputStreamReader lettore = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(lettore);
        do{
            System.out.println("1) inserisci veicolo\n2) stampa veicoli per tipo\n3) stampa veicoli per anno\nscegli: ");
            try{
                codScelta = tastiera.readLine();
            }catch(Exception e){

            }
            scelta = Integer.parseInt(codScelta);
            System.out.println(scelta);
        switch(scelta){
            case 1:     
                System.out.println("1) autovettura\n2) motociclo\n3) autocarro");
                try{
                    codSceltaCase1 = tastiera.readLine();
                }catch(Exception e){

                }
                sceltaCase1 = Integer.parseInt(codSceltaCase1);
                switch(sceltaCase1){
                    case 1:
                        try{
                            codAi = tastiera.readLine();
                            codMr = tastiera.readLine();
                            codMd = tastiera.readLine();
                            codTa = tastiera.readLine();
                            codCc = tastiera.readLine();
                            codNp = tastiera.readLine();
                        }catch(Exception e){
                            
                        }
                        anno = Integer.parseInt(codAi);
                        cilindrata = Integer.parseInt(codCc);
                        marca = codMr;
                        modello = codMd;
                        alimentazione = codTa;
                        int posti = Integer.parseInt(codNp);
                        
                        break;
                }
                
        }
        }while(scelta!=0);
    }
}
