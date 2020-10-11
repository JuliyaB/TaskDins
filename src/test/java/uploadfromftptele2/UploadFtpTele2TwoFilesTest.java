package uploadfromftptele2;

import com.sun.org.glassfish.gmbal.Description;
import ftpclient.UploadFtpTele2;
import org.junit.Test;

public class UploadFtpTele2TwoFilesTest {

    @Test
    @Description("A00-3")
    public void uploadFileTest() {
        UploadFtpTele2 uploadFtpTele2 = new UploadFtpTele2();
        uploadFtpTele2.upload("./src/main/resources/hhhhhuuuuu.zip");
        uploadFtpTele2.upload("./src/main/resources/ddd.zip");
    }
}
