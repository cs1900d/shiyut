package homework;

public class EX526 {

	public static void main(String[] args) {
    int j=0;
    double e=1,item=1;
    	for(j=1;j<=100000;j++) {
    		item/=j;
    		e+=item;
    	if(j%10000==0)
    	System.out.println(j+":"+e);
    	}	
    }
	}

