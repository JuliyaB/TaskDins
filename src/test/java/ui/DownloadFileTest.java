package ui;

import com.sun.org.glassfish.gmbal.Description;
import utility.UnzipFile;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class DownloadFileTest {

    @Test
    @Description("A00-1")
    public void downloadFileTest() throws IOException {
        DownloadFilePage downloadFilePage = new DownloadFilePage();
        UnzipFile unzipFile = new UnzipFile();
        downloadFilePage.openT();
        File fileToSave1KB = downloadFilePage.downloadFile1KB();
        assertEquals(Long.toString(fileToSave1KB.length()), downloadFilePage.sizeFile1KB());
        unzipFile.unzip(fileToSave1KB.getName());
        File fileToSave500MB = downloadFilePage.downloadFile500MB();
        assertEquals(Long.toString(fileToSave500MB.length()), downloadFilePage.sizeFile500MB());
        unzipFile.unzip(fileToSave500MB.getName());
        File fileToSave1000GB = downloadFilePage.downloadFile1000GB();
        assertEquals(Long.toString(fileToSave1000GB.length()), downloadFilePage.downloadFile1000GB());
        unzipFile.unzip(fileToSave1000GB.getName());
    }
}

