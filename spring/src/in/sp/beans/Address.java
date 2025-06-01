package in.sp.beans;

public class Address {
		private String homeName;
		private String phoneNo;
		private int pincode;
		public String getHomeName() {
			return homeName;
		}
		public void setHomeName(String homeName) {
			this.homeName = homeName;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "Address [homeName=" + homeName + ", phoneNo=" + phoneNo + ", pincode=" + pincode + "]";
		}
		
}
