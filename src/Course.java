public class Course {
    teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }




    public void addTeacher(teacher t){
        if (this.prefix.equals(t.branch)){

            this.courseTeacher = t;
            System.out.println("İşlem Başarılı");
        }
        else {


            System.out.println(t.name + "Akademisyeni bu dersi vermek için uygun değil. ");
        }


   }

    public void printTeacher(){
        if(courseTeacher != null){

            System.out.println(this.name + " dersinin akademisyeni: " + courseTeacher.name );
        }
        else {
            System.out.println(this.name + " Dersinin akademisyeni atanamamıştır.");
        }


    }




}
