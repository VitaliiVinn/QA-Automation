import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        File dir = new File("F:\\\\My documents\\Testing work\\QA");
//        if(!dir.exists()){
//            dir.mkdir();
//        }
//        File[] files = dir.listFiles();
//        if(files.length != 0){
//            File file = new File(dir, "test_code.txt");
//            file.createNewFile();
//        }
//        System.out.println(Arrays.toString(dir.list()));

//        File file = new File("F:\\\\My documents\\Testing work\\QA\\test_code.txt");
//        InputStream inputStream = new FileInputStream(file);
//        byte[] input = new byte[1024];
//        int b;
//        for(int i = 0; (b = inputStream.read()) != -1; i++){
//            input[i] = (byte) b;
//        }
//        String inputStr = new String(input);
//        System.out.println(inputStr);

        File src = new File("F:\\\\My documents\\Testing work\\QA\\test_code.txt");
        File dst = new File("F:\\\\My documents\\Testing work\\QA\\paste_code.txt");
        if (!dst.exists()) {
            dst.createNewFile();
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
        BufferedWriter writer = new BufferedWriter(new FileWriter(dst));

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.println(line);
            writer.write(line);
            writer.newLine();
            writer.flush();
        }
    }
}
