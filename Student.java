public class Student {
        private String studentName;
        private String regNumber;
        private int age;
        private String address;
        private String contactNumber;

        public Student(String studentName, String regNumber, int age, String address, String contactNumber) {
                this.studentName = studentName;
                this.regNumber = regNumber;
                this.age = age;
                this.address = address;
                this.contactNumber = contactNumber;
        }

        public void showStudentDetails() {
                System.out.println("Student name is " + studentName);
                System.out.println("Registration number is " + regNumber);
                System.out.println("Age is " + age);
                System.out.println("Address is " + address);
                System.out.println("Contact number is " + contactNumber);
        }

        /**
         * @param args
         */
        public static void main(String[] args) {
                Student Student_A = new Student("Piyumi Withana", "R202210", 21, "No:21, Western Park,Horana",
                                "0774934323");
                Student_A.showStudentDetails();

                System.out.println(" ");

                final Student Student_B = new Student("Harsha Silva", "R202211", 23, "No 73, Kubuka East, Gonapola","0715687643");
                Student_B.showStudentDetails();

        }
}
