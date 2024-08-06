public class person {
    
        int age = 16;
        String name = "Jeff";

        public void printAge()
{
    System.out.println("Hello " + age);
};
        public void makeOlder() {
            age++;
        };
        public void makeYounger() {
            age--;
        };
        public void SetAge(int NewAge){
            age = NewAge;
        
        }
        public void SetAgeAndName(int NewAge, String NewName){
            age = NewAge;
            name = NewName;
        }
        public int getter(){
            return age;
        }
        public String Moregetter(){
            return name;
        }
    };
