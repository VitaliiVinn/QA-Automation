import java.io.IOException;

public class MainContact {
    public static void main(String[] args) throws IOException {
        UserData object = new UserData("name: John", "email: john123@mail.com", "age: 97");
        object.serialize("F:\\My documents\\Testing work\\QA\\QA-Automation\\Automation\\src\\main\\resources\\da.txt");
        object.deserialize("F:\\My documents\\Testing work\\QA\\QA-Automation\\Automation\\src\\main\\resources\\da.txt");
    }
}
