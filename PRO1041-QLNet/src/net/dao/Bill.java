/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.dao;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Bill {
   public static void createBill(String filePath, String tenMay, String ngayTao,
                                  String gioBatDau, String gioKetThuc, String tongGio, String tongTien) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 14, BaseColor.BLACK);
            document.add(new Paragraph("HOA DON QUAN NET", font));
            document.add(new Paragraph(" ")); // dòng trống
            
            document.add(new Paragraph("name: " + tenMay));
            document.add(new Paragraph("date: " + ngayTao));
            document.add(new Paragraph("start time: " + gioBatDau));
            document.add(new Paragraph("end time: " + gioKetThuc));
            document.add(new Paragraph("total time: " + tongGio));
            document.add(new Paragraph("total money: " + tongTien + " VNĐ"));

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
