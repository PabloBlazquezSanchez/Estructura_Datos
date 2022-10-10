package edLineales2022_23;

public class StaticStackJF implements StackJF<Object> {
	private int array[];
	private int top;
	private int capacidad;

	public StaticStackJF(int capacidad) {
		this.capacidad = capacidad;
		this.array = new int[capacidad];
		this.top = -1;
	}

	public Object push(int numero) {
		if (size() == capacidad) {
			int[] newStack = new int[this.capacidad * 2];
			for (int i = 0; i < capacidad; i++) {
				newStack[i] = this.array[i];
			}
			this.array = newStack;
			this.capacidad = this.capacidad * 2;
		}

		System.out.println("Insertando elemento: " + numero);
		return array[++top] = numero;
	}

	public Object pop() throws EmptyStackExceptionRJC {
		if (isEmpty()) {
			System.out.println("Underflow\nPrograma Terminado");
			System.exit(-1);
		}
		System.out.println("Eliminando elemento: " + top());
		// decrease stack size by 1 and (optionally) return the popped element
		return array[top--];
	}

	public Object top() throws EmptyStackExceptionRJC {
		if (!isEmpty()) {
			return array[top];
		} else {
			System.exit(-1);
		}
		return -1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		int tamano = top + 1;
		return tamano;
	}

}
