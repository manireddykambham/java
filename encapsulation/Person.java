package encapsulation;
//This is using regular method, we can use annotations like @getter and @setter
public class Person {
   private String name;
//getter
    public String Getname(){
        return name;
    }
    //setter
    public void Setname(String newname){
        this.name = newname;
    }
}
