import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		Date date = new Date();
		System.out.println(date.toString());

		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		try {
			Date shinyaDate = sdf.parse(shinyaBirthday);
			Date minamiDate = sdf.parse(minamiBirthday);
			Date earlierDate = (shinyaDate.compareTo(minamiDate) < 0) ? shinyaDate : minamiDate;
            System.out.println(sdf.format(earlierDate));

		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		Date furuyamaDate = sdf.parse(furuyamaBirthday);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(furuyamaDate);
        calendar.add(Calendar.YEAR, 5);
        calendar.add(Calendar.MONTH, 2);
        System.out.println(sdf.format(calendar.getTime()));

    } catch (ParseException e) {
        System.out.println(e.getMessage());
    }
	}
}