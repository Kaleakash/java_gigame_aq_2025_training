package streamapi;

public class Student {
private int sid;
private String sname;
private String subject;
private String location;
private int marks;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", subject=" + subject + ", location=" + location + ", marks="
			+ marks + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int sid, String sname, String subject, String location, int marks) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.subject = subject;
	this.location = location;
	this.marks = marks;
}

}
