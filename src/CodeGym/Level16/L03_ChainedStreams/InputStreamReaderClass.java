package CodeGym.Level16.L03_ChainedStreams;

import java.io.*;

public class InputStreamReaderClass {

    public static void main(String[] args) throws FileNotFoundException {

        // InputStreamReader class
        String src = "src/CodeGym/Level16/L02_StreamOfDataInput/log.txt";
        FileInputStream input = new FileInputStream(src);
        InputStreamReader reader = new InputStreamReader(input);

        // BufferedReader class
        try(FileReader in = new FileReader(src);
            BufferedReader newReader = new BufferedReader(in))
        {
            while (newReader.ready())
            {
                String line = newReader.readLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
