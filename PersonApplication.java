package Lab10;

public class PersonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("FY");
		p1.setName("Ferdinand Yeke");
		p1.setAge(19);

		Person p2 = new Person("EH");
		p2.setName("Ethan Hoppkins");
		p2.setAge(18);
		
		Person p3 = new Person("AP");
		p3.setName("Auang Pay");
		p3.setAge(18);
		

		p1.printPerson();
		p2.printPerson();
		p3.printPerson();
		
		
	

	}

}
