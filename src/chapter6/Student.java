package chapter6;

public class Student {
        private String fname;
        private String lname;
        private int age;

       //Setter

        public void setFname(String fname) {
                this.fname = fname;

        }

        public void setLname(String lname) {
                this.lname = lname;
        }

        public void setAge(int age) {
                this.age = age;
        }

        @Override
        public String toString() {
                return "Student{" +
                        "fname='" + fname + '\'' +
                        ", lname='" + lname + '\'' +
                        ", age=" + age +
                        '}';
        }
}

