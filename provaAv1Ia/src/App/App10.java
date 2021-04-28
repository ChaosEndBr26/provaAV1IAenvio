package App;

import provaAv1Ia.Questao10;



public class App10 {
	public static void main(String[] args){
	       Questao10 questao10 = new Questao10();
	        String[] n = questao10.getPopulation();
	     
	        int j = 0;
	        int v = 1;
	        for(int i = 0; i < 8; i++){
	            int br1 = questao10.dec(n[i]);
	            double br2 = questao10.Math10(br1);

	            while(v<500) {
	            if(br2 >= 0.950){
	                System.out.println(br1);
	                System.out.println("geracao n: " + v);
	                break;
	            }else{
	         	   v ++;
	                String[] procurar = questao10.Procurar10();
	                for(int x = 4; x<8; x++){
	             	   procurar[x] = questao10.Dponto(procurar[j],procurar[j+1]);
	             	   procurar[x+1] = questao10.Dponto(procurar[j+1],procurar[j]);
	                    j++;
	                    x++;
	                }
	                i=0;
         }
     }
	        }
 }
}
