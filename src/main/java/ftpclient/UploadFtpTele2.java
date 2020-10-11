package ftpclient;

import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UploadFtpTele2 {

    public void upload(String x) {
        FTPClient client = new FTPClient();
        File filename = new File(x);

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(filename.getPath())) {
            InputStream input = new FileInputStream(filename);
            client.connect("speedtest.tele2.net");

            client.storeFile(filename.getPath(), is);
            if (!client.storeFile(filename.getName(), input)) {
                System.out.println("File not found!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
