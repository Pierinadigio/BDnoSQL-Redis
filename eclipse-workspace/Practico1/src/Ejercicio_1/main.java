package Ejercicio_1;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import java.util.List;

public class main {
	public static void main(String[] args) {
		 List<Integer> lista1 = new ArrayList<>();
		 List<Integer> lista2 = new ArrayList<>();
		 List<Integer> lista3 = new ArrayList<>();
		 
		 lista1.add(1);
		 lista1.add(3);
		 lista1.add(5);
		 lista1.add(8);
		 lista2.add(2);
		 lista2.add(5);
		 lista2.add(7);
		 lista2.add(8);
	//	 lista3 = obtenerListaOrdenada(lista1, lista2);
		 lista3 = obtenerLista3(lista1, lista2);
		 System.out.println("Lista 1: " + lista1);
	        System.out.println("Lista 2: " + lista2);
	       System.out.println("ordenada: " + lista3);
		
		
		
		
		
		
		
		
     /*  /* Lista lista = new Lista();
        lista.insertFront(3);
        
       lista.insertFront(7);
       lista.insertFront(1);
       lista.insertFront(8);
       lista.extractFront();
       
       System.out.println("size " + lista.getSize());
        System.out.println("Lista: " + lista.toString()); // Lista: 1 -> 7 -> 3
     /*   System.out.println("Tamaño: " + lista.getSize()); // Tamaño: 3
        System.out.println("Elemento en el índice 1: " + lista.get(1)); // Elemento en el índice 1: 7
        System.out.println("Elemento extraído: " + lista.extractFront()); // Elemento extraído: 1
        System.out.println("Lista después de extraer: " + lista.toString()); // Lista después de extraer: 7 -> 3
   */
		
	/*	ListaNombres  l1 = new ListaNombres();
		
		Lista L1= new Lista<>();
		Lista L2= new Lista<>();
		Lista L3= new Lista<>();
		L1.insertFront(10);
		L1.insertFront(7);
		L1.insertFront(5);
		L1.insertFront(3);
		
		L2.insertFront(9);
		L2.insertFront(8);
		L2.insertFront(5);
		L2.insertFront(1);*/
		
	//	System.out.println("ListaORDENADAListaTRES : " + obtenerLista3Ordenada(L1, L2));
	//	System.out.println("Lista1 : " +  L1);
	//	System.out.println("Lista2 : " +  L2);
		
		
	//	L3 = obtenerListaOrdenada2 (L1, L2);
	//	System.out.println("Lista : " + L3 );
	//	MyIterador<Integer> iterador2 =  (MyIterador)L2.iterator();
	//	int valor = iterador2.Valor();
	//	System.out.println("valor1  : " + valor);
		 
	//	iterador2.avanzar();
	//	  valor = iterador2.Valor();
	//	  System.out.println("valor2  : " + valor);
		  
	//	  iterador2.avanzar();
	//	   valor = iterador2.Valor();
	//	   System.out.println("valor3  : " + valor);
		   
	//	   iterador2.avanzar();
		//   valor = iterador2.Valor();
	//	   System.out.println("valor4  : " + valor);
		
		
	//	System.out.println("ListaORDENADAListaTRES  : " + obtenerLista3Ordenada(L1, L2) );
		
	//System.out.println("ListaORDENADAListaTRES : " + interseccion(L1, L2));
	//	Iterator <Integer> iter= L1.iterator();
		
	
		/*
		System.out.println("ListaORDENADA 1: " + L1);
        System.out.println("ListaORDENADA 2: " + L2);
		System.out.println(l1.isEmpty());
		System.out.println(l1.size);
		
		l1.insertFront("Pierina");
		l1.insertFront("Cristian");
		l1.insertFront("Roberto");
		
		l1.extractFront();
		l1.insertFront("Roberto");
		l1.extractFront();
		System.out.println(l1.toString());
		System.out.println(l1.getSize());
		System.out.println(l1.indexOf("Pierina"));
		List<Integer> lista1 = new ArrayList<>(List.of(3, 1, 4, 1, 5, 4, 2, 6));
        List<Integer> lista2 = new ArrayList<>(List.of(5, 3, 1, 7, 2, 8, 6, 3));

        List<Integer> resultado = obtenerInterseccion(lista1, lista2);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Intersección: " + resultado);
        
        List<Integer> listaA = new ArrayList<>(List.of(3, 1, 8, 1, 5, 9, 2, 8));
        List<Integer> listaB = new ArrayList<>(List.of(5, 3, 1, 7, 2, 10, 6, 4));

        List<Integer> res = obtenerDiferencia(listaA, listaB);

        System.out.println("Lista A: " + listaA);
        System.out.println("Lista B: " + listaB);
        System.out.println("Diferencia: " + res);
    }
	
	public static <T> List<T> obtenerInterseccion(List<T> lista1, List<T> lista2) {
        List<T> resultado = new ArrayList<>();
        Iterator<T> iter1 = lista1.iterator();

        while (iter1.hasNext()) {
            T elemLista1 = iter1.next();

            if ((lista2.contains(elemLista1)) && (!resultado.contains(elemLista1)) ){
                resultado.add(elemLista1);
            }
        }

        return resultado;
    }
	public static <T> List<T> obtenerDiferencia(List<T> listaA, List<T> listaB) {
        List<T> res = new ArrayList<>();
        Iterator<T> iter1 = listaA.iterator();

        while (iter1.hasNext()) {
            T elemLista1 = iter1.next();

            if ((!listaB.contains(elemLista1)) && (!res.contains(elemLista1)) ){
                res.add(elemLista1);
            }
        }

        return res;
    }
	*/
		
	}
/*	public static <T extends Comparable<T>> Lista<T> obtenerLista3Ordenada(Lista<T> lista1, Lista<T> lista2) {
		Lista<T> lista3 = new Lista<>();
		MyIterador<T> iterador1 = (MyIterador) lista1.iterator();
		MyIterador<T> iterador2 = (MyIterador) lista2.iterator();
       
        T elemento1 = iterador1.Valor();
        T elemento2 = iterador2.Valor();
    //    T elemento1 = lista1.f.next();
    //    T elemento2 = iterador2.next();
        int comparacion = elemento1.compareTo(elemento2);
            
        if (comparacion < 0) {
        	 System.out.println("ele es menor");
             //   iterador1.avanzar();
                
        	if (iterador1.hasNext()) {
                elemento1 = iterador1.next();
            } else {
                elemento1 = null;
            }
               
            } else if (comparacion > 0) {
            	System.out.println("ele1 es mayor");
            //	iterador2.avanzar();  
            	elemento2 = iterador2.getValor();
            	 if (iterador2.hasNext()) {
                     elemento2 = iterador2.next();
                 } else {
                     elemento2 = null;
                 }
            } else {
                lista3.insertFront(elemento1);
               // iterador1.avanzar();
              //  iterador2.avanzar();
                if (iterador1.hasNext()) {
                    elemento1 = iterador1.next();
                } else {
                    elemento1 = null;
                }
                if (iterador2.hasNext()) {
                    elemento2 = iterador2.next();
                } else {
                    elemento2 = null;
                }
            }
        

        return lista3;
    }*/

/* public static <T extends Comparable<T>> Lista<T> interseccion(Lista<T> lista1, Lista<T> lista2) {
        Lista<T> lista3 = new Lista<>();
        MyIterador<T> iterador1 = (MyIterador) lista1.iterator();
        MyIterador<T> iterador2 = (MyIterador) lista2.iterator();
     //   Iterator<T> iterador1 = lista1.iterator();
      //  Iterator<T> iterador2 = lista2.iterator();

        T elemento1 = iterador1.Valor();
        T elemento2 = iterador2.Valor();

        while (elemento1 != null && elemento2 != null) {
            int comparacion = elemento1.compareTo(elemento2);
            if (comparacion < 0) {
            	
            	iterador2.avanzar();
            	elemento2 = iterador2.Valor();
            } else  {
                lista3.insertFront(iterador1.Valor());
                iterador1.avanzar();
                elemento1 = iterador1.Valor();
               
            }
        }

        return lista3;
    }*/
 
 /*public static <T extends Comparable<T>> Lista<T> obtenerListaOrdenada(Lista<T> lista1, Lista<T> lista2) {
     Lista<T> lista3 = new Lista<>();
     MyIterador<T> iterador1 = (MyIterador) lista1.iterator();
     MyIterador<T> iterador2 = (MyIterador) lista2.iterator();
  //   Iterator<T> iterador1 = lista1.iterator();
   //  Iterator<T> iterador2 = lista2.iterator();

     T elemento1 = iterador1.Valor();
     T elemento2 = iterador2.Valor();

     while (elemento1 != null && elemento2 != null) {
         int comparacion = elemento1.compareTo(elemento2);
         if (comparacion < 0) {
         	
         	iterador1.avanzar();
         	elemento1 = iterador1.Valor();
         } else if (comparacion > 0) {
         	
         	iterador2.avanzar();
         	elemento2 = iterador2.Valor();
            
         } else {
             lista3.insertFront(elemento1);
             iterador1.avanzar();
             elemento1 = iterador1.Valor();
             iterador2.avanzar();
         	elemento2 = iterador2.Valor();
         }
     }

     return lista3;
 }*/


/*	 public static <T extends Comparable<T>> Lista<T> obtenerListaOrdenada2(Lista<T> lista1, Lista<T> lista2) {
	        Lista<T> lista3 = new Lista<>();
	        MyIterador<T> iterador1 = (MyIterador) lista1.iterator();
	        MyIterador<T> iterador2 = (MyIterador) lista2.iterator();

	        T elemento1 = iterador1.Valor();
	        T elemento2 = iterador2.Valor();

	        while (elemento1 != null && elemento2 != null) {
	            int comparacion = elemento1.compareTo(elemento2);
	            if (comparacion < 0) {
	                iterador1.avanzar();
	                elemento1 = iterador1.next();
	                
	            } else if (comparacion > 0) {
	                iterador2.avanzar();
	                elemento2 = iterador2.next();
	            } else {
	                lista3.insertarOrdenado(elemento1);
	                iterador1.avanzar();
	                iterador2.avanzar();
	            }
	        }

	        return lista3;
	    }*/
	 public static List<Integer> obtenerListaOrdenada(List<Integer> lista1, List<Integer> lista2) {
		 List<Integer> lista3 = new ArrayList<>();
		 Iterator<Integer> it1 = lista1.iterator();
		 Iterator<Integer> it2 = lista2.iterator();
		 
		 Integer e1 = lista1.get(0);
		 Integer e2 = lista2.get(0);
		 
		 while ((e1!=null) && (e2 != null)) {
			 if (e1 < e2) {
				 if (it1.hasNext()) {
					 e1 = it1.next();
				 }
				 else {
			    		e1 = null;
			        }
			 }
			 else if (e1 > e2) {
				 if (it2.hasNext()) {
					 e2 = it2.next();
				 }
				 else {
			    		e2 = null;
			        }
			 }
			 else {
				 lista3.add(e1);
				 if (it1.hasNext()) {
					 e1 = it1.next();
				 }
				 else {
			    		e1 = null;
			        }
				 if (it2.hasNext()) {
					 e2 = it2.next();
				 }
				 else {
			    		e2 = null;
			        }
				 
				 
			 }
		 }
		 
		 return lista3;
		 
		 
	 }
	 public static List<Integer> obtenerLista3(List<Integer> lista1, List<Integer> lista2) {
		 List<Integer> lista3 = new ArrayList<>();
		 Iterator<Integer> it1 = lista1.iterator();
		 Iterator<Integer> it2 = lista2.iterator();
		 
		 Integer e1 = lista1.get(0);
		 Integer e2 = lista2.get(0);
		 
		 while (e1!=null)  {
			 if (e1 != e2) {
				 
				 if (it2.hasNext()) {
					 e2 = it2.next();
				 }
				 else {
			    		e2 = null;
			        }
		       }
			   if (e2==null) {
				   
				   if (it1.hasNext()) {
						 e1 = it1.next();
					 }
					 else {
				    		e1 = null;
				        }
				   if (e1!=null) {
				   lista3.add(e1);
				   }
			   }
				 
			 }
			 
		 
		 return lista3;
		 
		 
	 }
}



