import java.util.*;


public class Exer21 {
    
    public static void Show(int a, ArrayList<Object> lista ) {
        int i;
                
       for(i=0;i<a;i++){
           System.out.print("\n"+lista.get(i));
                
                
                }
}
    
    public static ArrayList<Object> Add(ArrayList<Object> lista){
       
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o novo valor");
        Object a = sc.nextLine();
       lista.add(a);
       
       
    
    return lista;
    }
            
    
    
    
    public static void main( String args[]){
   int num;
   Object ins;
     ArrayList<Object> lista = new ArrayList<Object>();
   lista.add('b');
   lista.add(3);
   lista.add("Carruagens");
   lista.add(8.56);
   lista.add("caixas de armazenamento");
   num = lista.size();
   Show(num,lista);
   Add(lista);
   num = lista.size();
   Show(num,lista);
   
   System.out.print("\n");
   
   
   
   
   
}
}
