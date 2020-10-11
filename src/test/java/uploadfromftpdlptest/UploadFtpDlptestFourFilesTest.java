package uploadfromftpdlptest;

import ftpclient.UploadFtpDlptest;
import org.junit.Test;

public class UploadFtpDlptestFourFilesTest {

    @Test
    public void uploadFileTest() {
        UploadFtpDlptest uploadFtpDlptest = new UploadFtpDlptest();
        uploadFtpDlptest.upload("./src/main/resources/ggg.txt");
        uploadFtpDlptest.upload("./src/main/resources/1.png");
        uploadFtpDlptest.upload("./src/main/resources/jjj.docx");
        uploadFtpDlptest.upload("./src/main/resources/ll.pdf");
    }
}
