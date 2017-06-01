package chapter4.section2;

import java.util.*;
import java.text.DateFormatSymbols;

public class CalendarTest
{
    public static void main(String[] args)
    {
       
        Locale.setDefault(Locale.US);
        
        //用当前的时间构造一个日历对象
        GregorianCalendar d = new GregorianCalendar();
        
        //获取日\ 月
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);
        
        //将d设置为该月起始日期
        d.set(Calendar.DAY_OF_MONTH,1);
        
        //获取该月第一天是星期几
        int weekday = d.get(Calendar.DAY_OF_WEEK);
        
        //获取第一行的缩进
        int indent = 0;
        
        int firstDayOfWeek = d.getFirstDayOfWeek();
        while(weekday != firstDayOfWeek)
        {
            indent++;
            d.add(Calendar.DAY_OF_MONTH,-1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }
        
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        //打印第一行星期的简写
        do
        {
            System.out.printf("%4s",weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }while(weekday != firstDayOfWeek);
        System.out.println();
        
        //重新设置日期为月的起始日
        d.set(Calendar.DAY_OF_MONTH,1);
        
        for(int i = 0; i < indent; ++i)
            System.out.printf("%4s"," ");
            
        do
        {
            //打印日
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d",day);
            
            //标记今天的日期
            if(day == today)  System.out.print("*");
            else System.out.print(" ");
            //日期后移
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
            
            //如果到了新的一周就另起一行
            if(weekday == firstDayOfWeek) System.out.println();
        }while(month == d.get(Calendar.MONTH));
        
        if(weekday != firstDayOfWeek) System.out.println();
        
    }
}
