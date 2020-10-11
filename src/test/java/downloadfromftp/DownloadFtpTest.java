package downloadfromftp;

import com.sun.org.glassfish.gmbal.Description;
import ftpclient.DownloadFtp;
import org.junit.Test;

public class DownloadFtpTest {

    @Test
    @Description("A00-1")
    public void downloadFtpTest() {
        DownloadFtp downloadFtp = new DownloadFtp();
        downloadFtp.download();
    }
}
