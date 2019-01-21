package com.skilldistillary.jets;

public class AirFields {
		
		private Jets[] jetList = new Jets[10];
		private CombatReady[] fighterJets = new FighterJets[10];
		private CargoCarrier[] cargoJets = new CargoPlane[10];
		
		
		public CombatReady[] getFighterJets() {
			return fighterJets;
		}

		public void setFighterJets(CombatReady[] fighterJets) {
			this.fighterJets = fighterJets;
		}

		public CargoCarrier[] getCargoJets() {
			return cargoJets;
		}

		public void setCargoJets(CargoCarrier[] cargoJets) {
			this.cargoJets = cargoJets;
		}

		public void addJet(Jets jet) {
			
			for(int i = 0 ; i < jetList.length; i++) {
				Jets j = jetList[i];
				if(j == null) {
					jetList[i] = jet;
					break;
				}
				
			}
			
		}
		public void addCargo(CargoCarrier jet) {
			
			for(int i = 0 ; i < cargoJets.length; i++) {
				CargoCarrier j = cargoJets[i];
				if(j == null) {
					cargoJets[i] = jet;
					break;
				}
				
			}
			
		}

		public void addFighter(CombatReady jet) {
			
			for(int i = 0 ; i < fighterJets.length; i++) {
				CombatReady j = fighterJets[i];
				if(j == null) {
					fighterJets[i] = jet;
					break;
				}
				
			}
			
		}
		public Jets[] getJetList() {
			return jetList;
		}

		public void setJetList(Jets[] jetList) {
			this.jetList = jetList;
		}
		
}
