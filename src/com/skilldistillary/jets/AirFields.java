package com.skilldistillary.jets;

public class AirFields {
		
		public Jets[] jetList = new Jets[10];
		
		public void addJet(Jets jet) {
			
			for(int i = 0 ; i < jetList.length; i++) {
				Jets j = jetList[i];
				if(j == null) {
					jetList[i] = jet;
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
