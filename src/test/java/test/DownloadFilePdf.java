package test;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;

public class DownloadFilePdf {
    @Test
    void pdfDownloadTest() throws IOException {

        PDF pdf = getPdf("./src/test/resources/Anonymous.pdf");
        assertThat(pdf, PDF.containsText("Азбука анонимности"));

    }
}