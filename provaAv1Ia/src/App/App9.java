package App;


import provaAv1Ia.Questao9;

public class App9 {
	public static void main(String[] args){
	       Questao9 questao9 = new Questao9();
	        String[] e = questao9.getPopulation();
	     
	        int j = 0;
	        int v = 1;
	        for(int i = 0; i < 8; i++){
	            int br1 = questao9.dec(e[i]);
	            double br2 = questao9.Math9(br1);

	            while(v<400) {
	            if(br2 >= 0.950){
	                System.out.println(br1);
	                System.out.println("geracao n: " + v);
	                break;
	            }else{
	         	   v ++;
	                String[] procurar = questao9.Procurar9();
	                for(int x = 4; x<8; x++){
	             	   procurar[x] = questao9.Qponto(procurar[j],procurar[j+1]);
	             	   procurar[x+1] = questao9.Qponto(procurar[j+1],procurar[j]);
	                    j++;
	                    x++;
	                }
	                i=0;
         }
     }
	        }
 }
}
