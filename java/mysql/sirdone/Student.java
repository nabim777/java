public class Student 
{
    int id;
    String name,phone,city;

public Student(){
}	

    public Student(int id, String name, String phone, String city) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

	public Student(String name, String phone, String city) {
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", city=" + city + '}';
    }
    
    
}
