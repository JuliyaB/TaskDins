package ftpclient;

import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UploadFtpDlptest {

    public void upload(String x) {
        FTPClient client = new FTPClient();
        File filename = new File(x);

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(filename.getPath())) {
            InputStream input = new FileInputStream(filename);
            client.connect("ftp.dlptest.com");
            client.login("dlpuser@dlptest.com", "eUj8GeW55SvYaswqUyDSm5v6N");

            client.storeFile(filename.getPath(), is);
            if (!client.storeFile(filename.getName(), input)) {
                System.out.println("File not found!");
            }
            client.logout();
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
