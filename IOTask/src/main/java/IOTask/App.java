package IOTask;

import sun.misc.BASE64Decoder;

import java.io.*;


public class App {
    private static void convertFileToPic() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("../enc.txt"));
            StringBuilder text = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }

            BASE64Decoder decoder = new BASE64Decoder();
            byte[] arr = decoder.decodeBuffer(text.toString());

            FileOutputStream outputStream = new FileOutputStream(new File("IOTask/src/main/resources/pic.jpg"));
            outputStream.write(arr, 0, arr.length);
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        convertFileToPic();
    }
}
