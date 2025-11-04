public class Employee {
    private int id;
    private String name;
    private String email;

    public Employee(int ID,String Name, String Email){
        this.id=ID;
        this.name=Name;
        this.email=Email;
    }
    public void displayDetails(){
        System.out.println("\n-------Employee Details--------");
        System.out.println("Id: "+id );
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
}
