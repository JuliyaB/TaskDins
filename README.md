# TaskDins
Задания для Dins.

Версия java 1.8.0_256

Папка test/java/ui содержит тест DownloadFileTest на скачивание с сервера ftp://speedtest.tele2.net/ 
по средствам Selenide, данный тест обращается к классу UnzipFile в папке main/java/utility
для того что бы распаковать скачанный файл с расширением .zip и открыть его. 
Также имеется Page Object в папке main/java/ui к данному тесту.

Папка test/java/downloadfromftp содержит тест DownloadFtpTest на скачивание с сервера 
ftp://speedtest.tele2.net/ по средствам обращения к классу DownloadFtp 
в папке main/java/ftpclient, также обращается к классу UnzipFile в папке main/java/utility
для того что бы распаковать скачанный файл с расширением .zip и открыть его. 

Папка test/java/uploadfromftptele2 содержит тесты UploadFtpTele2OneFileTest, 
UploadFtpTele2TwoFilesTest, UploadFtpTele2FourFilesTest на загрузку с серверу
ftp://speedtest.tele2.net/ по средствам обращения к классу UploadFtpTele2 
в папке main/java/ftpclient.

Папка test/java/uploadfromftpdlptest содержит тесты UploadFtpDlptestOneFileTest, 
UploadFtpDlptestTwoFilesTest, UploadFtpDlptestFourFilesTest на загрузку с серверу
ftp://ftp.dlptest.com/ по средствам обращения к классу UploadFtpDlptest 
в папке main/java/ftpclient.