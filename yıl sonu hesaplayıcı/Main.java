
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<Student> ogrenciler = new ArrayList<>();
        int secim = 1;
        while (secim == 1) {
            Student student = new Student();
            System.out.println("kullanıcı adını soyadını giriniz");
            String name = sc.nextLine();
            System.out.println("kulllanıcın doğum gününü giriniz");
            int day = sc.nextInt();
            System.out.println("kullanıcının doğum ayını giriniz");
            int month = sc.nextInt();

            System.out.println("kullanıcın doğum yılını giriniz");
            int year = sc.nextInt();

            System.out.println("kullanıcın vize notunu giriniz");
            int vize = sc.nextInt();
            System.out.println("kulllanıcın final notunu giriniz");
            int finall = sc.nextInt();
            System.out.println("kulllanıcın TC giriniz");
            int TC = sc.nextInt();
            student.setTC(TC);
            student.setDay(day);
            student.setMonth(month);
            student.setYear(year);
            student.setVize(vize);
            student.setName(name);
            student.setFinal(finall);
            if (ogrenciler.isEmpty()) {
                ogrenciler.add(student);
            } else {
                for (Student ogrenci : ogrenciler) {
                    if (student.getTC() != ogrenci.getTC()) {
                        ogrenciler.add(student);// listeye ogrenci eklendi.
                        break;
                    } else {
                        System.out.println("bu TC numarasında başka öğrenci var");
                        break;
                    }

                }
            }

            System.out.println("0 ' a basarsan çıkış yaparsın");
            System.out.println("1 e basarsan tekrar öğrenci kaydedersin");
            System.out.println("2 e basarsan tüm öğrencileri gösterir.");
            secim = sc.nextInt();


            switch (secim) {
                case 2:
                    for (int i = 0; i < ogrenciler.size(); i++) {
                        ogrenciler.get(i).showInfos();
                    }
                    break;

            }
        }
    }


}
/*
bir dosyaya şifreli bir string koy
file write
bir tane fom-nksşyon yazılıcak

 */



















