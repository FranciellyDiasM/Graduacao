package AppCarro;

	
	public class Carro implements iLocadora {



		private int codigo;
		private String modelo;
		private boolean locado = false;
		private int numDias;

		private static int numLocados = 0;
		private static double diaria = 200.00;
		
		
		
		public Carro(int codigo, String modelo) {
			super();
			this.codigo = codigo;
			this.modelo = modelo;
			this.locado = false;
			this.numDias = 0;
		}	
		
		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getNumDias() {
			return numDias;
		}

		public void setNumDias(int numDias) {
			this.numDias = numDias;
		}

		public int getCodigo() {
			return codigo;
		}

		public boolean isLocado() {
			return locado;
		}

		public int getNumLocados() {
			return numLocados;
		}

		public double getDiaria() {
			return diaria;
		}

		@Override
		public String toString() {
			return "Carro [codigo= " + codigo + ", modelo= " + modelo + ", locado= " + locado + ", numDias= " + numDias
					+ "]";
		}

		@Override
		public boolean locar(int diasLocado) {
			if(this.locado) {
				return false;
			}
			
			this.locado = true;
			this.numDias = diasLocado;
			
			Carro.numLocados++;
			
			return true;
		}

		@Override
		public double devolver() {
			if(this.locado ==  false) {
				return 0;
			}
			double valorLocacao = numDias * getDiaria();
			this.locado = false;
			this.numDias = 0;
			numLocados--;
			return valorLocacao ;
		}


}
	


