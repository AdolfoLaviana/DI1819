/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author dstarsln
 */
public class FechaUtils {

    public static SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy");
    //public static SimpleDateFormat sdfHora = new SimpleDateFormat("hh:mm");

    public static Date pasarStringADate(String fecha) {

        try {

            Date date = sdfFecha.parse(fecha);
            return date;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static String pasarDateAString(Date fecha) {
        String fechaString = sdfFecha.format(fecha);

        return fechaString;
    }
}
