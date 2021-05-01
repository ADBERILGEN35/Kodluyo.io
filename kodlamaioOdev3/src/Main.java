public class Main {
    public static void main(String[] Args) {
        User user=new User ();
        UserManager userManager=new UserManager ();
        Student student = new Student ();
        Instructor instructor = new Instructor ();
        User student1 = new Student(
                5,
                "Oğuzhan",
                "Taşyaran",
                "oguzhantasyaran@outlook.com",
                "******",
                12345,
                "Ödev1"
        );
        User student2=new User (
                6,
                "Ali",
                "Veli",
                "deneme@deneme",
                "****"
        );
        student.odevAdi="İlk ödev";
        instructor.setId (2);
        User studen3=new User (  );
        user.setId (1);
        user.setFirstName ("Oğuzhan");
        user.setLastName ("Taşyaran");
        user.setEmail ("oguzhantasyaran@outlook.com");
        user.setPassword ("******");
        System.out.println(student2.getFirstName ()+" nin mail adresi: "+student2.getEmail ());


        System.out.println (user.getFirstName ()+" "+user.getLastName ()+" Kaydı Gerçekleşti.");
        System.out.println (student.getFirstName ()+ " "+student.getOdevAdi ()+" başarıyla tamamladı.");

    }
}




