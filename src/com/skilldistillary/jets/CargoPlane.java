package com.skilldistillary.jets;

public class CargoPlane extends Jets {
		
		private int cargo;
		
		
		public void loadCargo(int cargo) {
			this.cargo += cargo;
			
		}
		public void unloadCargo(int cargo) {
			this.cargo += cargo;
		}

}
