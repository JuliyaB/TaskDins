package ui;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

public class DownloadFilePage {

    public void openT() {
        open("ftp://speedtest.tele2.net/");
    }

    public File downloadFile1KB() throws FileNotFoundException {
        return $x("//a[@href='/1KB.zip']").download();
    }

    public String sizeFile1KB() throws FileNotFoundException {
        return $x("//*[contains(text(),'1.0 kB')]").getAttribute("data-value");
    }

    public File downloadFile500MB() throws FileNotFoundException {
        return $x("//a[@href='/500MB.zip']").download();
    }

    public String sizeFile500MB() throws FileNotFoundException {
        return $x("//*[contains(text(),'500 MB')]").getAttribute("data-value");
    }

    public File downloadFile1000GB() throws FileNotFoundException {
        return $x("//a[@href='/1000GB.zip']").download();
    }

    public String sizeFile1000GB() throws FileNotFoundException {
        return $x("//*[contains(text(),'1000 GB')]").getAttribute("data-value");
    }

}
