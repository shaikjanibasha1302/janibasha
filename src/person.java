
public class person {
     private String name;
     private int age;
     private String gender;
     
     
     
	public person() {
		this.name = "basha";
		this.age = 20;
		this.gender = "male";
		
	}
	


	public person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getGender() {
		return gender;
	}


	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
      
     
	
	
}
