package com.asus.mobiles;

public class ZenfoneM2Pro {

		private String MobileSerialNumber;
		private String MobileImeiNumber;
		
		
		public String getMobileSerialNumber() {
			return MobileSerialNumber;
		}

		public void setMobileSerialNumber(String mobileSerialNumber) {
			MobileSerialNumber = mobileSerialNumber;
		}

		public String getMobileImeiNumber() {
			return MobileImeiNumber;
		}

		public void setMobileImeiNumber(String mobileImeiNumber) {
			MobileImeiNumber = mobileImeiNumber;
		}

		
		
		public static void main(String[] args) {
			
			ZenfoneM2Pro zn=new ZenfoneM2Pro();
			zn.setMobileSerialNumber("4568-7528-4528-1592");
			zn.setMobileImeiNumber("1200-4520-7895-7538-7528");
			
			System.out.println(zn.getMobileSerialNumber()+"----"+zn.getMobileImeiNumber());
			
		}
	}
	
	
