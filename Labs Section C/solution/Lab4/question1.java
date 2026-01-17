import java.util.Scanner;
class Doctor{
    String name;
    String qualification;
    void setName(String Name){
        this.name=Name;
    }

    void setQualification(String qualification){
        this.qualification=qualification;
    }

    String getName(){
        return name;
    }
    String getQualification(){
        return qualification;
    }
}

public class question1 {
public static void main(String[] args) {
    Doctor doctor=new Doctor();
    doctor.setName("Dr.Pardeep");
    doctor.setQualification("MBBS");

    System.out.println("name "+doctor.getName());
    System.out.println("Qualifiation: "+doctor.getQualification());

    
}
    
}