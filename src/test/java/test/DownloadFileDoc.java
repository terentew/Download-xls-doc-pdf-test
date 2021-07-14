package test;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readDocFile;

public class DownloadFileDoc {
    @Test
    void docDownloadTest() throws IOException {

        String actualData = readDocFile("./src/test/resources/prott.doc");
        assertThat(actualData, containsString("доступ к этому документу"));

    }
}
