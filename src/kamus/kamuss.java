
package kamus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import kamu.kamu;


public class kamuss {
    File f = null;
    FileReader fRead = null;
    BufferedReader bRead = null;

    FileWriter fWrite = null;
    BufferedWriter bWrite = null;

    kamu m;

    public kamuss() {
        
        f = new File("indonesia.txt");
        
    }

    public List<kamu> getAll() {
        List<kamu> list = new ArrayList<kamu>();
        try {
            fRead = new FileReader(f);
            bRead = new BufferedReader(fRead);
            String x = bRead.readLine();
            while (x != null) {
                m = new kamu();
                String[] temp = x.split(",");
                m.setindo(temp[0]);
                m.setinggris(temp[1]);
                list.add(m);
                x = bRead.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        } catch (IOException ex) {
            System.out.println("Inputan Eror");
        } finally {
            try {
                fRead.close();
                bRead.close();
            } catch (IOException ex) {
            }
            return list;
        }
    }

    public void updatekm(List<kamu> ls) {
        try {
            fWrite = new FileWriter(f,true);
            bWrite = new BufferedWriter(fWrite);
            for (kamu km : ls) {
                String temp = "";
                temp += km.getindo();
                temp += "," + km.getinggris();
                bWrite.write(temp);
                bWrite.newLine();
            }
            bWrite.close();
            JOptionPane.showMessageDialog(null, "Berhasil tambah data");
        } catch (IOException ex) {
            System.out.println("Eror");
        }
    }
}
