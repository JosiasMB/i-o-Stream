import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopiaArchivos {

    public void CopiarLineas(String CopyFile, String outFile) throws IOException {
        BufferedReader rutaIn = null;
        PrintWriter rutaOut = null;

        try {
            rutaIn = new BufferedReader(new FileReader(CopyFile));
            rutaOut = new PrintWriter(new FileWriter(outFile));

            String R;
            while ((R = rutaIn.readLine()) != null) {
                rutaOut.println(R);
            }
        } finally {
            if (rutaIn != null) {
                rutaIn.close();
            }
            if (rutaOut != null) {
                rutaOut.close();
            }
        }

    }
}
