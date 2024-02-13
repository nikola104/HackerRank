/*
import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcelFile {
    public static void main(String[] args) {
        String filePath = "D:\\Download\\prem_leage.xlsx";

        try {
            FileInputStream file = new FileInputStream(filePath);


            Workbook workbook = WorkbookFactory.create(file);


            Sheet sheet = workbook.getSheetAt(0);


            DataFormatter dataFormatter = new DataFormatter();


            for (Row row : sheet) {

                for (Cell cell : row) {

                    String cellValue = dataFormatter.formatCellValue(cell);
                    System.out.print(cellValue + "\t");
                }
                System.out.println();
            }


            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can't find the file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file " + e.getMessage());
        }
    }
}
*/
