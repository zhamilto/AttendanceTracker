package AttendanceTracker;

import java.util.ArrayList;

public class StudentRosterList {
    private ArrayList<Student> list;

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public StudentRosterList(){
            list = new ArrayList<>();
        }

        public void add(Student s){
            list.add(s);
        }

        public int numOfStudents(){
            return list.size();
        }


}
