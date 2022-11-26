//package sbs_app;
public class General_Employee extends Person {

    private employeeType empType;

    //Constructor
    public General_Employee(String name, String dob, Sex sex, String addr, String email, String telNum, employeeType empType) {
        super(name, dob, sex, addr, email, telNum);
        this.empType = empType;
    }

    //Acessor Functions
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDOB() {
        return dob;
    }

    @Override
    public Sex getSex(){ 
        return sex;
    }

    @Override
    public String getAddr(){
        return address;
    }

    @Override
    public String getEmail(){ 
        return email;
    }

    @Override
    public String getTelNum() {
        return telNum;
    }

    //Mutators Function
    @Override
    public void setAddr(String newAddr) {
        address = newAddr;
        
    }

    @Override
    public void setEmail(String new_Email) {
        email = new_Email;  
    }

    @Override
    public void setTelNum(String Tel_num) {
        telNum = Tel_num;
    }
    
}
