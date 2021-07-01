/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkdata;

import lap12.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;
import javax.xml.crypto.Data;

/**
 *
 * @author Đặng Quốc
 */
public class KiemTra {

    public boolean check(JTextField txt, StringBuilder sb, String text) {
        if (txt.getText().equals("")) {
            sb.append("Bạn chưa Nhập " + text + "\n");
            return false;
        }
        return true;
    }

    public boolean checkSo(JTextField txt, StringBuilder sb, String Text) {

        if (!check(txt, sb, Text)) {
            return false;
        }
        try {
            int so = Integer.parseInt(txt.getText());
            return true;
        } catch (Exception e) {
            sb.append(Text + " là Số Bạn Ơi<3\n");
            return false;
        }
    }

    public boolean checkNXB(JTextField txt, StringBuilder sb, String text) {
        if (!check(txt, sb, text)) {
            return false;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dateForm = sdf.parse(txt.getText());
            Date dateNow = new Date();
            if (dateForm.before(dateNow)) { // ktra date nhập có trc date hiện tại hay không
                return true;
            }else{
                sb.append("Ngày xuất bản không được là tương lai(*!*)\n");
                return false;
            }
        } catch (Exception e) {
            sb.append(text + " nhập đúng định dạng đi<3\n");
            return false;
        }       
    }
}
