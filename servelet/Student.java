package servelet;

public class Student {
private int id;
private String name;
private double marks;
private String address;
public Student(int id, String name, double marks, String address) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
	this.address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
}

}
