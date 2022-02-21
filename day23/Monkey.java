package day23;

public class Monkey {
    String name;
    int age;

    public Monkey(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void greet(){
        // System.out.println("こんにちは" + this.name +"(" + age + "才)です。よろしく！");
        System.out.printf("こんにちは%s(%d才)です。よろしく！%n",this.name,age);
    }

    public void takeuma(){
        // System.out.println(this.name +"は上手に竹馬にのった！");
        System.out.printf("%sは上手に竹馬にのった！%n",this.name);
    }

    public void sakadachi(){
        // System.out.println(this.name +"はひょいと逆立ちをした！");
        System.out.printf("%sはひょいと逆立ちをした！%n",this.name);
    }
}
