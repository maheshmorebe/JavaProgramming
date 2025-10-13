package StringPrograms;

public class ConstructorDemo {
	
	int id;
	int marks;
	String name;

	public ConstructorDemo(){
			System.out.println("Default Constructor");
	}
	
	public ConstructorDemo(int id,String name,int marks){
		this.id = id;
		this.name = name;
		this.marks= marks;
	}
	

	public static void main(String[] args) {
		ConstructorDemo cd= new ConstructorDemo();
		ConstructorDemo cd1= new ConstructorDemo(101,"Mahesh",90);

		System.out.println("Id:"+cd1.id+"  Name:"+cd1.name+" Marks:"+cd1.marks);

	}

}
