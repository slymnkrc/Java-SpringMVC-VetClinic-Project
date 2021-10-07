//--------------------------------------- Project Information - Start ---------------------------------------//
/*
    Name: Eymen ERUYAR
    Project Name: Vet Klinik
    Page: Util Page
    Version: v1.0
    GitHub: https://github.com/eymeneruyar
    Date: 18.09.2021
*/
//--------------------------------------- Project Information - End -----------------------------------------//
package vetcilinic.Utils;

import org.apache.log4j.Logger;

public class Util {

    public static final String UPLOAD_DIR = "src/main/resources/static/uploadImages/";

    public static void logger(String data,Class logClass){
        Logger.getLogger(logClass).error(data);
    }

    public static boolean isEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

}
