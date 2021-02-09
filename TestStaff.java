//Main class
public class TestStaff {
    public static void main (String args[]) {
        //create objects
        Staff L1 = new Lecturer();
        Staff admin1 = new Admin();
        Staff techStaff = new TechnicalStaff();
        //fill information about technical staff
        techStaff.setName("Sami");
        techStaff.setJobTitle("Cleaner");
        techStaff.setStaffId();
        //fill information about lecturer
        L1.setName("Zaki");
        L1.setJobTitle("Lecturer");
        L1.setStaffId(); //make sure that the random staff no. doesn't get similar with other staff numbers
        
        while(techStaff.staff_id == L1.staff_id) {
            techStaff.staff_id = (int)(Math.random() * 1000) + 1;
        }
        ((Lecturer)L1).setCourse("CSC1103");
        ((Lecturer)L1).setCourse("CSC1100");
        //fill information about admin
        admin1.setName("Pauziah");
        admin1.setJobTitle("Admin Officer");
        admin1.setStaffId(); //make sure that the random staff no. doesn't get similar with other staff numbers
        
        while((admin1.staff_id == L1.staff_id) || (admin1.staff_id == techStaff.staff_id)) {
            admin1.staff_id = (int)(Math.random() * 1000) + 1;
        }
        
        ((Admin)admin1).setSkill("data entry");
        //call method
        displayInfo(L1);
        displayInfo(admin1);
        displayInfo(techStaff);
}

    
        //method declaration...
        public static void displayInfo(Staff s){
            if (s instanceof Lecturer) {
                System.out.println("Name: " +s.getName());
                System.out.println("Job Title: " +s.getJobTitle());
                System.out.println("Staff ID: " +s.getStaffId());
                ((Lecturer)s).getCourse();
            }
            
            else if(s instanceof Admin) {
                System.out.println("\nName: " +s.getName());
                System.out.println("Job Title: " +s.getJobTitle());
                System.out.println("Staff ID: " +s.getStaffId());
                System.out.println("Skill: " +((Admin)s).getSkill());
            }
            
            else if(s instanceof TechnicalStaff) {
                System.out.println("\nName: " +s.getName());
                System.out.println("Job Title: " +s.getJobTitle());
                System.out.println("Staff ID: " +s.getStaffId());
            }
            
        }
}
   
