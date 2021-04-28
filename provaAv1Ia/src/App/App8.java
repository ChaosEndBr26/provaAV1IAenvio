package App;


import provaAv1Ia.Questao8;

public class App8 {
	public static void main(String[] args){
	       Questao8 questao8 = new Questao8();
	        String[] r = questao8.getPopulation();
	     
	        int j = 0;
	        int v = 1;
	        for(int i = 0; i < 8; i++){
	            int br1 = questao8.dec(r[i]);
	            double br2 = questao8.Math8(br1);
	            while(v<300) {
	            if(br2 >= 0.950){
	                System.out.println(br1);
	                System.out.println("geracao n: " + v);
	                break;
	            }else{
	         	   v ++;
	                String[] procurar = questao8.Procurar8();
	                for(int x = 4; x<8; x++){
	             	   procurar[x] = questao8.Dponto(procurar[j],procurar[j+1]);
	             	   procurar[x+1] = questao8.Dponto(procurar[j+1],procurar[j]);
	                    j++;
	                    x++;
	                }
	                i=0;
	            }
	        }
	        }
	    }

}
