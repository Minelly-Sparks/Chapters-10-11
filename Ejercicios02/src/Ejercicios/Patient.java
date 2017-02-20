package Ejercicios;
public class Patient { 
    private String id;
    private int age;
    private BloodData blood;

    public Patient() {
        id="0";
        age=0;
        blood=new BloodData();
    }
    
     public Patient(String id,Integer age,BloodData blood) {
        this.id=id;
        this.age=age;
        this.blood=blood; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BloodData getSangre() {
        return blood;
    }

    public void setSangre(BloodData blood) {
        this.blood = blood;
    }
}
