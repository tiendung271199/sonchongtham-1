package spring.util;

public class StringUtil {

	// rút gọn chuỗi (title blog)
	public static String setTitleCompact(String title) {
		StringBuilder sb = new StringBuilder(title);
		if (sb.length() > 10) {
			sb.delete(10, sb.length()).append("...");
		}
		return sb.toString();
	}

}
