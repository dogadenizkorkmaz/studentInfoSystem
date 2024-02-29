public class Course {

    //Course sınıfına ait Nitelikler:
    Teacher courseTeacher;
    String name;
    String code;
    String prefix; //teacher sınıfı - branch ile aynı olmasını bekliyoruz.
    int note;

    public Course(String name, String code, String prefix) { //constructer oluşturuldu.
        this.name = name; //parametre olarak aldığım name'e eşit.
        this.code = code;
        this.prefix = prefix;
        this.note = 0; //varsayılan notu 0 olarak belirledim. Çünkü henüz bu noktada bir not girişi yapılmadı. Hatalı not girişlerinde bu not esas alınmış olacak.
    }

    public void addTeacher(Teacher t) { //dışardan aldığımız teacher nesnesini içerdeki teacher nesnesine taşınır.
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}