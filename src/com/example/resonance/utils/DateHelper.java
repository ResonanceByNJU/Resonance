package com.example.resonance.utils;

import java.util.Calendar;

/**
 *Class <code>DateUtils.java</code> ������ʱ���йصİ�����.
 *
 * @author never
 * @date 2014-2-9
 */
public class DateHelper {
	/**
	 * Title: getDate
	 * Description:������ڵ�ʱ��
	 * @return ����ʱ����ַ�������ʽ����"2014-2-9 20:16".
	 */
    public static String getDate() {
        Calendar c = Calendar.getInstance();

        String year = String.valueOf(c.get(Calendar.YEAR));
        String month = String.valueOf(c.get(Calendar.MONTH));
        String day = String.valueOf(c.get(Calendar.DAY_OF_MONTH) + 1);
        String hour = String.valueOf(c.get(Calendar.HOUR_OF_DAY));
        String mins = String.valueOf(c.get(Calendar.MINUTE));
        
        
        StringBuffer sbBuffer = new StringBuffer();
        sbBuffer.append(year + "-" + month + "-" + day + " " + hour + ":" + mins); 
        						
        						
        return sbBuffer.toString();
    }
}
