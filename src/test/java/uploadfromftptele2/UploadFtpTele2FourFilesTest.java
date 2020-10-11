package uploadfromftptele2;

import com.sun.org.glassfish.gmbal.Description;
import ftpclient.UploadFtpTele2;
import org.junit.Test;

public class UploadFtpTele2FourFilesTest {

    @Test
    @Description("A00-4")
    public void uploadFileTest() {
        UploadFtpTele2 uploadFtpTele2 = new UploadFtpTele2();
        uploadFtpTele2.upload("./src/main/resources/ggg.txt");
        uploadFtpTele2.upload("./src/main/resources/1.png");
        uploadFtpTele2.upload("./src/main/resources/jjj.docx");
        uploadFtpTele2.upload("./src/main/resources/ll.pdf");
    }
}
