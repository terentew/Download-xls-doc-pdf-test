package test;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getXls;

public class DownloadFileXls {
    @Test
    void xlsDownloadTest() throws IOException {

        XLS xls = getXls("./src/test/resources/book.xls");
        assertThat(xls, XLS.containsText("чащах юга"));
    }
}
