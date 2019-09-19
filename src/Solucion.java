import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;




public class Solucion {
	
public static void main(String[] args) {
		
		ManejoCadenaold Ent = new ManejoCadenaold();
		Calcularold Cal = new Calcularold();
		Cal.Resolverold(Ent);
		
}
}


class Calcularold {
	
     int n=4;
	 int arreglo[][][] =new int[n][n][n];
	 ArrayList<ArrayList> haha= new ArrayList<ArrayList>();
	 HashSet<ArrayList> hash= new HashSet<ArrayList>();
	
	public void Resolverold (ManejoCadenaold Ent) {
		
		
		int t=Integer.parseInt(Ent.next());
		
		for(int i=0;i<t;i++){
			
			int n=Integer.parseInt(Ent.next());
	
			int m=Integer.parseInt(Ent.next());
	
		for(int j=0;j<m;j++){
				
			    String Cad =Ent.next();
	
				if(Cad.equals("UPDATE")){
				  //String srt =Ent.next();
					//System.out.println((" bbb " +Cad));
			        Updateold(Ent,n); 
			
				}else{
					
					long respuesta=0;
					//
				
					int x1= Integer.parseInt(Ent.next());
					

					int y1= Integer.parseInt(Ent.next());
					int z1= Integer.parseInt(Ent.next());
					int x2= Integer.parseInt(Ent.next());
					int y2= Integer.parseInt(Ent.next());
				
					int z2= Integer.parseInt(Ent.next());
				
					
					
					
				/**	for( int x = 1; x < arreglo.length; x++)
					{
						for( int y = 1; y < arreglo [ x ].length; y++)
						{
						for(int z = 1; z < arreglo[ x ] [ y ] .length; z++) {
					//System.out.println("El elemento es: " + arreglo[ x ] [ y ] [ z ]+" "+x);
						
						if (x>=x1&&x<=x2 &&y>=y1&&y<=y2 && z>=z1&&z<=z2) {
                            	   
                            	   respuesta +=arreglo[ x ] [ y ] [ z ];
                            	   System.out.println(" "+respuesta+ arreglo.length);
						
						}
						}
						
					}
						
				  }**/
					
					for(int p=0; p<haha.size(); p++){
						ArrayList list= haha.get(p);
						// System.out.println("right here   "+list);
						if((int)list.get(0)>=x1 && x2>= (int)list.get(0)){
							if((int)list.get(1)>=y1 && y2>= (int)list.get(1)){
								if((int)list.get(2)>=z1 && z2>= (int)list.get(2)){
									respuesta+=arreglo[(int)list.get(0)][(int)list.get(1)][(int)list.get(2)];
									
									System.out.println(" "+respuesta);
								}
							}
						}
					}
					
				
					} 
			}
		}
		
	//System.out.println();
		System.out.close();
	}
	
	
	public void Updateold (ManejoCadenaold cad,int n) {
		

	
		//System.out.println(((cad.next())));
		int pos1= Integer.parseInt(cad.next());
		int pos2=Integer.parseInt(cad.next());
		int pos3=Integer.parseInt(cad.next());
		int val=Integer.parseInt(cad.next());
		//System.out.println(((pos1+" "+pos2+" "+pos3+" "+val)));
		//arreglo[0][0][0]=0;
		arreglo[pos1][pos2][pos3]=val;
		//System.out.println("El elemento es: " + arreglo[ pos1 ] [ pos2 ] [ pos3 ]);

		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(pos1);
		list.add(pos2);
		list.add(pos3);
		hash.add(list);
		if(!haha.contains(list)) haha.add(list);
	}
	
}


class ManejoCadenaold {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	StringTokenizer st;
	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("  "+st.nextToken());
		return st.nextToken();
	}
	

	 
}
 



