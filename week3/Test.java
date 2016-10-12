
public class Test
{
	public static void main(String[] args)
	{
	
		Module sw = new Module("Software Workshop", "Jon Rowe");
		Module focs = new Module("Foundations", "Dan Ghica");
                Module ai = new Module("Intro to AI", "Volker Sorge");
                Module sw2 = new Module("Software Workshop", "Jon Rowe");
                
		System.out.println(sw);
		
		System.out.println(sw.getName());
		System.out.println(sw.getLecturer());
		
		System.out.println("changing lecturer");
		sw.setLecturer("Martin Escardo");
		
		System.out.println(sw);
		
		Student alf = new Student("Alfred Smith", 12345);
		
		System.out.println(alf);
		System.out.println(alf.getName());
		System.out.println(alf.getId());
		
		System.out.println("changing id");
		alf.setId(54321);
		System.out.println(alf);
		
		alf.setModule(0, sw);
		alf.setModule(1, focs);
		alf.setModule(2, ai);
		
		//System.out.println(alf.getModule(1));
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(alf.getModule(i));
		}
                
                System.out.println("");
                System.out.println("Does (" + focs + ") have the same module name as (" + sw + ")?");
                System.out.println(focs.equals(sw));
                System.out.println("Does (" + sw + ") have the same module name as (" + sw2 + ")?");
                System.out.println(sw.equals(sw2));
                System.out.println("");
                System.out.println("Is " + alf + " doing " + sw2 + "?");
                System.out.println(alf.onModule(sw2));
                System.out.println("Is " + alf + " doing " + sw + "?");
                System.out.println(alf.onModule(sw));
                System.out.println("");
                
                System.out.println("Creating tutor group for Jon Rowe.");
                TutorGroup vs = new TutorGroup("Jon Rowe");
                System.out.println(vs.getTutor());
                System.out.println("Renaming tutor group to Volker Sorge.");
                vs.setTutor("Volker Sorge");
                System.out.println(vs.getTutor());
                System.out.println(vs.toString());
                
                System.out.println("Adding " + alf + " to Volker Sorge's tutor group.");
                vs.addStudent(alf);
                System.out.println(vs.getStudents());
                System.out.println(vs.toString());
                
                
                
                
                
                
	}
}
