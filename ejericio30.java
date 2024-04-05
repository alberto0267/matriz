package tema5;
import java.util.Scanner;
import java.util.Arrays;
public class ejericio30 {

	public static void main(String[] args) {
	Scanner da= new Scanner(System.in);
			
	
	System.out.println("-----1---------");
	
	System.out.println("filas");
	int filas = da.nextInt();
	System.out.println("columnas");
	int columnas = da.nextInt();
	
	int matriz30 [][]= new int [filas] [columnas];
	
	for (int i=0; i<matriz30.length; i++) {
		for(int j= 0 ; j<matriz30[i].length; j++) {
		
			System.out.println("valores");
			int valores = da.nextInt();
			matriz30 [i] [j]=valores;
		}
		}
	System.out.println(Arrays.deepToString(matriz30));
	
	System.out.println("------------2---ordenacion----------");
	
	Arrays.sort(matriz30[0]);
	System.out.println(Arrays.toString(matriz30[0]));
	
	System.out.println("--------3--------rellanar datos-----");
	
	
	Arrays.fill(matriz30[1], 17);
	System.out.println(Arrays.deepToString(matriz30));
	
	
	System.out.println("-------4----------");


	System.out.println(Arrays.equals(matriz30[0], matriz30[matriz30.length-1]));
	;
	
	}

}
