package tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timenow {

	public static String getTimeNow() {
		Date now = new Date(); //��ȡ��ǰʱ��
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dateFormat.format(now);
	}
}
