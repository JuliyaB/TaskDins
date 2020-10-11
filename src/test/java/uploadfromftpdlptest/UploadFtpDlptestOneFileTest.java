package uploadfromftpdlptest;

import ftpclient.UploadFtpDlptest;
import org.junit.Test;

public class UploadFtpDlptestOneFileTest {

    @Test
    public void uploadFileTest() {
        UploadFtpDlptest uploadFtpDlptest = new UploadFtpDlptest();
        uploadFtpDlptest.upload("./src/main/resources/hhhhhuuuuu.zip");
    }
}
