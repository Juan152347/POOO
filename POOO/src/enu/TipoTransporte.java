package enu;


	public enum TipoTransporte {
		TAXI(4), MINIVAN(6), PARTILCULAR(4);
		int canpasajero;

		private TipoTransporte(int canpasajero) {
			this.canpasajero = canpasajero;
		}

		public int getCanpasajero() {
			return canpasajero;
		}

		public void setCanpasajero(int canpasajero) {
			this.canpasajero = canpasajero;
		}
		
		
	}

