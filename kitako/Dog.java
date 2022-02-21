package kitako;

public class Dog {
    private String Name;
    private int age;
    private String type;

    public Dog(String type){
        this.type = type;
    }

    public void SetName(String nm){
        Name = nm;
    }

    public void ShowProfile(){
        System.out.println(this.type +"名前は、" + Name + " 年齢は、" + age + "才です。");
    }

    public void SetAge(int age){
        this.age = age;
    }
}