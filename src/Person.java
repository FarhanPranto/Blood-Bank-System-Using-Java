public class Person {

    protected String name;
    public Person(String name){
        this.name=name;
    }

    public Person() {

    }

    public void ShowInfo(){
        System.out.println("Name: "+name);
    }
}