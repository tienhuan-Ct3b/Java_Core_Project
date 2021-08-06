/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIOCSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Objects.HoaDonBanHang;
import Objects.HoaDonNhapHang;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class FileIOHoaDon {

    private static final String currentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private final String StrHoaDonBanHang = currentDir + separator + "data" + separator + "HoaDonBanHang.json";
    private final String StrHoaDonNhapHang = currentDir + separator + "data" + separator + "HoaDonNhapHang.json";

    public void BanHangWriteToJson(List<HoaDonBanHang> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(StrHoaDonBanHang);

            Gson gson = new Gson();
            Type classOfT = new TypeToken<List<HoaDonBanHang>>() {
            }.getType();

            gson.toJson(list, classOfT, fw);

        } catch (IOException ex) {;
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
            }
        }
    }

    public List<HoaDonBanHang> BanHangReadJson() {
        List<HoaDonBanHang> list = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader(StrHoaDonBanHang);
            Gson gson = new Gson();

            Type classOfT = new TypeToken<List<HoaDonBanHang>>() {
            }.getType();

            list = gson.fromJson(fr, classOfT);

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
            }
        }
        return list;
    }

    public void NhapHangWriteToJson(List<HoaDonNhapHang> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(StrHoaDonNhapHang);

            Gson gson = new Gson();
            Type classOfT = new TypeToken<List<HoaDonNhapHang>>() {
            }.getType();

            gson.toJson(list, classOfT, fw);
        } catch (IOException ex) {
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
            }
        }
    }

    public List<HoaDonNhapHang> NhapHangReadJson() {
        List<HoaDonNhapHang> list = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader(StrHoaDonNhapHang);

            Gson gson = new Gson();

            Type classOfT = new TypeToken<List<HoaDonNhapHang>>() {
            }.getType();

            list = gson.fromJson(fr, classOfT);

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
            }
        }
        return list;
    }
}
