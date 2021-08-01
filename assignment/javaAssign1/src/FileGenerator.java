import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileGenerator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Mode : ");
        System.out.println("1. Make cipher ");
        System.out.println("2. Decode ");
        int num = scanner.nextInt();
        scanner.nextLine();
        switch (num) {
            case 1 :
                System.out.println("Type key : (must 16 character)");
                String keyValue = scanner.nextLine();
                System.out.println("Type inputFile : ");
                String fileName = scanner.nextLine();
                makeCipher(keyValue, fileName);
                break;
            case 2 :
                System.out.println("Type key : ");
                String key = scanner.nextLine();
                System.out.println("Type cipherText : ");
                String cipher = scanner.nextLine();
                System.out.println("Type outputFileName : ");
                String outPutFileName = scanner.nextLine();
                makeAnswer(key, cipher, outPutFileName);
        }
    }

    public static void makeCipher(String key, String fileName) throws Exception {
        String cipher = readFile("src/" + fileName);
        AES256 aes256 = new AES256(key);
        String encrypt = aes256.encrypt(cipher);
        writeFile(encrypt, "src/Cipher");
    }

    public static void makeAnswer(String key, String cipher, String outPutFileName) throws Exception {
        AES256 aes256 = new AES256(key);
        String decrypt = aes256.decrypt(cipher);
        writeFile(decrypt, "src/" + outPutFileName);
    }

    public static String readFile(String filename) throws Exception {
        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            builder.append("\n");
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
