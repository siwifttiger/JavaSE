package chapter4.section2;

import java.util.*;
import java.text.DateFormatSymbols;

public class CalendarTest
{
    public static void main(String[] args)
    {
       
        Locale.setDefault(Locale.US);
        
        //�õ�ǰ��ʱ�乹��һ����������
        GregorianCalendar d = new GregorianCalendar();
        
        //��ȡ��\ ��
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);
        
        //��d����Ϊ������ʼ����
        d.set(Calendar.DAY_OF_MONTH,1);
        
        //��ȡ���µ�һ�������ڼ�
        int weekday = d.get(Calendar.DAY_OF_WEEK);
        
        //��ȡ��һ�е�����
        int indent = 0;
        
        int firstDayOfWeek = d.getFirstDayOfWeek();
        while(weekday != firstDayOfWeek)
        {
            indent++;
            d.add(Calendar.DAY_OF_MONTH,-1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }
        
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        //��ӡ��һ�����ڵļ�д
        do
        {
            System.out.printf("%4s",weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }while(weekday != firstDayOfWeek);
        System.out.println();
        
        //������������Ϊ�µ���ʼ��
        d.set(Calendar.DAY_OF_MONTH,1);
        
        for(int i = 0; i < indent; ++i)
            System.out.printf("%4s"," ");
            
        do
        {
            //��ӡ��
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d",day);
            
            //��ǽ��������
            if(day == today)  System.out.print("*");
            else System.out.print(" ");
            //���ں���
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
            
            //��������µ�һ�ܾ�����һ��
            if(weekday == firstDayOfWeek) System.out.println();
        }while(month == d.get(Calendar.MONTH));
        
        if(weekday != firstDayOfWeek) System.out.println();
        
    }
}
