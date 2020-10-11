package uploadfromftptele2;

import com.sun.org.glassfish.gmbal.Description;
import ftpclient.UploadFtpTele2;
import org.junit.Test;

public class UploadFtpTele2OneFileTest {

    @Test
    @Description("A00-2")
    public void uploadFileTest() {
        UploadFtpTele2 uploadFtpTele2 = new UploadFtpTele2();
        uploadFtpTele2.upload("./src/main/resources/hhhhhuuuuu.zip");
    }
}
