package provaAv1Ia;

import java.util.Arrays;

public class Questao9 {
	 String[] Population = {"00101110","00110110","00110100","00110010",
	            "10101110","10110110","10110100","10110010"};

    double[] sec = new double[8];
    int[] br = new int[8];
    String[] Bi = new String[8];

    public String bina(int num){
        byte b = (byte) num;
        String s;
        if (b < 0) {
            s = Integer.toBinaryString (b);
            s = s.substring (s.length() - 8);
        } else {
            s = "0000000" + Integer.toBinaryString (b);
            s = s.substring (s.length() - 8);
        }
        return s;
    }

    public int dec(String bi){
        int pot = 0;
        int dec = 0;
        for(int i = bi.length() - 1; i>=0; i--){
            dec += Math.pow(2,pot) * Character.getNumericValue(bi.charAt(i));
            pot ++;
        }
        return dec;
    }

    public double Math9(int x){
        return (x*2)-(12*x)+16;
    }

    public String[] Procurar9(){
        int e=0;
        int top = 4;
        for(int i=0; i<Population.length; i++){
            int bre1 = dec(Population[i]);
            double bre2 = Math9(bre1);
            sec[i] = bre2;
        }

        Arrays.sort(sec);

        for(int i = 0; i<4; i++){
            sec[i] = 0.0;
        }

        for(int i = 0; i<Population.length; i++){
            sec[i] = sec[top];
            top++;
            if(top>7){
                break;
            }
        }

        for(int i = 4; i<8; i++){
            sec[i] = 0.0;
        }

        for(int i =0; i<8; i++){
            int bre1 = dec(Population[i]);
            double bre2 = Math9(bre1);
            if(sec[e] == bre2){
            	br[e] = bre1;
                e++;
                i=0;
            }
            if(e==3){
                for(int t = 0 ; t<8; t++){
                	bre1 = dec(Population[t]);
                	bre2 = Math9(bre1);
                    if(sec[3] == bre2){
                    	br[3] = bre1;
                    }
                }
            }
        }

        for(int i =0; i<4; i++){
            Bi[i] = bina(br[i]);
        }

        for(int i=0; i<8; i++){
        	Population[i] = Bi[i];
        }
        return  Population;
    }

    public String[] getPopulation(){
        return Population;
    }
    
	 public String Qponto (String b, String r){
	        char[] b1 = b.toCharArray();
	        char[] r1 = r.toCharArray();
	        char[] p = new char[8];

	        for(int i = 0; i<2; i++){
	            p[i] = b1[i];
	        }
	        for(int i = 2; i<6; i++){
	            p[i] = r1[i];
	        }
	        for(int i = 6; i<8; i++){
	            p[i] = r1[i];
	        }
	        return String.valueOf(p);
	    }
	 

}
