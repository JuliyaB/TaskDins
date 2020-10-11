package ftpclient;

import utility.UnzipFile;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import java.io.*;

public class DownloadFtp {

    public void download() {
        FTPClient client = new FTPClient();
        UnzipFile unzipFile = new UnzipFile();
        OutputStream fos = null;
        String filename;
        try {
            client.connect("speedtest.tele2.net");
            client.login("anonymous", "anonymous");
            for (FTPFile file : client.listFiles()) {
                if (file.isFile() && file.getName() == "1000GB.zip" ||
                        file.isFile() && file.getSize() == 1024 ||
                        file.isFile() && file.getSize() == 524288000) {
                    filename = file.getName();
                    fos = new FileOutputStream("./build/downloads/" + filename);
                    client.retrieveFile(filename, fos);
                    if (filename.contains(".zip") == true) {
                        unzipFile.unzip(filename);
                    }
                    System.out.println(file.getName());

                } else if (file.isDirectory()) {
                    System.out.println("directory: " + file.getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                client.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}