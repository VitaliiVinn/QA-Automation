import java.io.*;

public class UserData {
    //            Реалізувати методи serialize(String filePath) (записує дані користувача у файл)та метод
//            deserialize(String filePath) (читає дані з файлу та мережує відповідні поля).
    public String name;
    public String email;
    public String age;

    public UserData(String name, String email, String age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void serialize(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(name);
        bufferedWriter.newLine();
        bufferedWriter.write(email);
        bufferedWriter.newLine();
        bufferedWriter.write(age);
        bufferedWriter.close();
    }

    public void deserialize(String filePath) throws IOException {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file.getAbsoluteFile());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int c;
        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            System.out.println(line);
        }
    }
//            Обробити такі кейси:
//            Якщо під час серіалізації файл не існує, створити його.
//                    Якщо при десеріалізації у файлі не знайдено значення для певного поля, сітка null.
//                    Якщо при серіалізації поле має значення null, не записувати його у файл.

}
