package com.example.demo;

public class DrpDwn {
	
		String DCODE,DNAME;

		public DrpDwn() {
			super();
			// TODO Auto-generated constructor stub
		}

		public DrpDwn(String dCODE, String dNAME) {
			super();
			DCODE = dCODE;
			DNAME = dNAME;
		}

		public String getDCODE() {
			return DCODE;
		}

		public void setDCODE(String dCODE) {
			DCODE = dCODE;
		}

		public String getDNAME() {
			return DNAME;
		}

		public void setDNAME(String dNAME) {
			DNAME = dNAME;
		}

		@Override
		public String toString() {
			return "DrpDwn [DCODE=" + DCODE + ", DNAME=" + DNAME + "]";
		}
		

}
