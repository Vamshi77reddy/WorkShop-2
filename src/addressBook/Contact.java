package addressBook;

public class Contact {
/*2>Create multiple address books -> Create Contacts with details(name, age, phoneNumber,city,state) -> Add multiple contacts in each addressBook
Also Maintain a dictionary of addressBooks through a Map(key->addressBookName , value->addressBook-Object)  ->  Create 3 classes - AddressBook , Contact and AddressBookMain
}*/
		private String name;
		private int age;
		private long phoneNumber;
		private String city;
		private String state;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		@Override
		public String toString() {
			return "Contact [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", city=" + city
					+ ", state=" + state + "]";
		}

	
}