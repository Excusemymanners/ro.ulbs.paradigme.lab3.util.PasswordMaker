public class Student {
    String name;
    int ID;

    public Student(String name, int ID){
        this.ID=ID;
        this.name=name;
    }

    void setID(int ID){
        this.ID=ID;
    }

    public int getID(){
        return ID;
    }
    void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
