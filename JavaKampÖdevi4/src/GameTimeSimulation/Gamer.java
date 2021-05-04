package GameTimeSimulation;

public class Gamer {
		
	private int id;
	private String FirstName;
	private String LastName;
	private String NationalityNumber;
	private String Email;
	private String UserName;
	private String Password;
	private int DogumTarihi;
	
	public Gamer() { 
		
	}
		
		public Gamer(int id, String FirstName, String LastName, String NationalityNumber, String Email, String UserName, String Password, int DogumTarihi) {
		
			this.id= id;
			this.FirstName= FirstName;
			this.LastName= LastName;
			this.NationalityNumber= NationalityNumber;
			this.Email= Email;
			this.UserName= UserName;
			this.Password= Password;
			this.DogumTarihi= DogumTarihi;
			
			
}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public String getNationalityNumber() {
			return NationalityNumber;
		}

		public void setNationalityNumber(String nationalityNumber) {
			NationalityNumber = nationalityNumber;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public String getUserName() {
			return UserName;
		}

		public void setUserName(String userName) {
			UserName = userName;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		}

		public int getDogumTarihi() {
			return DogumTarihi;
		}

		public void setDogumTarihi(int dogumTarihi) {
			DogumTarihi = dogumTarihi;
		}
}
