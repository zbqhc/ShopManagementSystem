package tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timenow {

	public static String getTimeNow() {
		Date now = new Date(); //获取当前时间
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dateFormat.format(now);
	}
}
