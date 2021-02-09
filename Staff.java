//super class
public class Staff {
    String name;
    String job_title;
    int staff_id;
    //constructor
    public Staff() {
    }
    public Staff(String name,String job_title) {
        this.name = name;
        this.job_title = job_title;
    }
    //accessor methods
    public String getName() {
        return name;
    }
    public String getJobTitle() {
        return job_title;
    }
    public int getStaffId() {
        return staff_id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setJobTitle(String job_title) {
        this.job_title = job_title;
    }
    public void setStaffId() {
        staff_id = (int)(Math.random() * 1000) + 1;
    }
}


//sub class
public class Lecturer extends Staff {
    String[] Course = new String[4];
    int count = 0;
    //constructors
    public Lecturer() {
    }
    public Lecturer(String Course) {
        if(count < 4) {
            this.Course[count] = Course;
            count++;
        }
    }
    
    //accessor methods
    public void getCourse() {
        int i;
        for(i = 0; i < count; i++) {
            System.out.println("Course " +i +": " +Course[i]);
        }
    }
    
    public void setCourse(String Course) {
        if(count < 4) {
            this.Course[count] = Course;
            count++;
        }
    }
}

//sub class
public class TechnicalStaff extends Staff {
    //constructor
    public TechnicalStaff() {
    }
}


//sub class
public class Admin extends Staff {
    String skill;
    //constructors
    public Admin() {
    }
    public Admin(String skill) {
        this.skill = skill;
    }
    //accessor methods
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
}





