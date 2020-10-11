package uploadfromftpdlptest;

import ftpclient.UploadFtpDlptest;
import org.junit.Test;

public class UploadFtpDlptestTwoFilesTest {

    @Test
    public void uploadFileTest() {
        UploadFtpDlptest uploadFtpDlptest = new UploadFtpDlptest();
        uploadFtpDlptest.upload("./src/main/resources/hhhhhuuuuu.zip");
        uploadFtpDlptest.upload("./src/main/resources/ddd.zip");
    }
}
