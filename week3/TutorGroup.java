import java.util.ArrayList;

public class TutorGroup
{

// data fields

	private String tutor;
	private ArrayList<Student> students;

// constructor

	public TutorGroup(String tutor)
	{
		this.tutor = tutor;
		this.students = new ArrayList<Student>(0);
	}

// get methods

	public String getTutor()
	{
		return this.tutor;
	}
        
        public ArrayList<Student> getStudents()
	{
		return this.students;
	}
			
// set methods

	public void setTutor(String tutor)
	{
		this.tutor = tutor;
	}
        
        public void addStudent(Student name)
	{
		this.students.add(name);
	}

// toString method

	public String toString()
	{
		return "Tutor: " + this.tutor + "  Students: " + students;
	}
}
