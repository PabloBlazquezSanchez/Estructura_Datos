package edLineales2022_23;

import java.util.Iterator;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticStack<Integer> pila_e = new StaticStack<Integer>(6);
		PilaDinamicaRJC<Integer> pila_d = new PilaDinamicaRJC<Integer>();
		
		System.out.println("Pila Estática: ");
		pila_e.push(3);
		pila_e.push(67);
		pila_e.push(45);
		pila_e.push(9);
		pila_e.push(28);
		pila_e.push(33);
		
		for(int i = pila_e.size(); i >= 0; i--) {
			System.out.print(pila_e.pop() + " ");
			if(pila_e.isEmpty()) {
				break;
			}
		}
		
		System.out.println("\nPila Dinámica: ");
		
		pila_d.push(3);
		pila_d.push(67);
		pila_d.push(45);
		pila_d.push(9);
		pila_d.push(28);
		pila_d.push(33);
		
		for(int i = pila_d.size(); i >= 0; i--) {
			System.out.print(pila_d.pop() + " ");
			if(pila_d.isEmpty()) {
				break;
			}
		}

	}

}
