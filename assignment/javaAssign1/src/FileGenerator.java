import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileGenerator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type key : ");
        String key = scanner.nextLine();
        System.out.println("Type cipherText : ");
        String cipher = scanner.nextLine();
        makeAnswer(key, cipher);
    }

    public static void makeCipher(String key) throws Exception {
        String cipher = readFile("src/StreamExercise.java");
        AES256 aes256 = new AES256(key);
        String encrypt = aes256.encrypt(cipher);
        writeFile(encrypt, "src/StreamCipher");
    }

    public static void makeAnswer(String key, String cipher) throws Exception {
        AES256 aes256 = new AES256(key);
        String decrypt = aes256.decrypt(cipher);
        System.out.println("decrypt = " + decrypt);
        writeFile(decrypt, "src/StreamExercise.java");
    }

    public static String readFile(String filename) throws Exception {
        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        System.out.println(builder.toString());
        reader.close();
        return builder.toString();
    }

    public static void writeFile(String data, String filename) throws Exception {
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write(data);
        fileWriter.flush();
        fileWriter.close();
    }
}
