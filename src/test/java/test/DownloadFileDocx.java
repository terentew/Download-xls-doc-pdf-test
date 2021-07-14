package test;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readDocxFile;

public class DownloadFileDocx {

    @Test
    void docxDownloadTest() throws IOException {

        String actualData = readDocxFile("./src/test/resources/prott.docx");
        assertThat(actualData, containsString("доступ к этому документу"));

    }
}
