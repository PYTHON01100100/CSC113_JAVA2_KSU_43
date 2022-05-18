import java.io.*;
public class teacher implements Serializable{
private String name;
private int age;

public teacher(String nn, int aa)
{
	name = nn; age = aa;
}

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


}
