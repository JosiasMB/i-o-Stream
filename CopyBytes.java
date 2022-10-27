import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

    FileInputStream in = null;
    FileOutputStream out = null;

    public void Bytes(String CopyFile, String outFile) throws IOException {
        try {
            in = new FileInputStream(CopyFile);
            out = new FileOutputStream(outFile);
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}
