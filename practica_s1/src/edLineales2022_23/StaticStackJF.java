package edLineales2022_23;

	public class StaticStackJF implements StackJF<Object>{
		private int array[];
	    private int top;
	    private int capacidad;
		@Override
		public void push(Object element) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Object pop() throws PilaVaciaExcepcion {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object top() throws PilaVaciaExcepcion {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		public int size() {
			int tamaño=top+1;
			return tamaño;
		}

}
