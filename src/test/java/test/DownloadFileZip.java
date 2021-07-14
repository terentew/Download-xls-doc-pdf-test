package test;


import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class DownloadFileZip {

    @Test
    void zipDownloadTest() throws IOException, ZipException {
        // разархивируем файл с паролеми проверяме наличие строки
        unzip("./src/test/resources/bug.zip", "./src/test/resources/files", "111111");
        String actualText = readTextFromPath("./src/test/resources/files/Bug.Report.txt");
        assertThat(actualText, containsString("Поведение при обнаружении проблем"));


    }
}

