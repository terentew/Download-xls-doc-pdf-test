package test;

import com.codeborne.selenide.Configuration;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;
import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

public class DownloadFileTxt {
    @Test
    void selenideDownloadText() throws IOException {

        Configuration.downloadsFolder = "downloads";

        open("https://github.com/winnerrr/HW8/blob/main/src/test/resources/Bug.txt");
        File downloadedFile = $("#raw-url").download();
        String fileContent = FileUtils.readFileToString(downloadedFile, StandardCharsets.UTF_8);
        assertThat(fileContent, containsString("Поведение при обнаружении проблем"));
    }
}
