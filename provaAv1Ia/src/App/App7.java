package App;

import provaAv1Ia.Questao7;


public class App7{
	public static void main(String[] args){
       Questao7 questao7 = new Questao7();
        String[] b = questao7.getPopulation();
     
        int j = 0;
        int v = 1;
        for(int i = 0; i < 8; i++){
            int br1 = questao7.dec(b[i]);
            double br2 = questao7.Math7(br1);
            
            while(v<200) {
            if(br2 >= 0.950){
                System.out.println(br1);
                System.out.println("geracao n: " + v);
                break;
            }else{
         	   v ++;
                String[] procurar = questao7.Procurar7();
                for(int x = 4; x<8; x++){
             	   procurar[x] = questao7.Dponto(procurar[j],procurar[j+1]);
             	   procurar[x+1] = questao7.Dponto(procurar[j+1],procurar[j]);
                    j++;
                    x++;
                }
                i=0;
            }
        }
        }
    }
}

