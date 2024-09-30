import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.*;
import java.util.Date;

public class Clock extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeformat;
    JLabel timeLabel;
    JLabel DayLabel;
    String time;
    String day;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel DateLabel;

    String Date;

    Clock()
    {
        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        //this.setResizable(false);
        timeformat=new SimpleDateFormat("hh:mm:ss a");
        timeLabel=new JLabel();
        timeLabel.setFont(new Font("verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00ff0));
        timeLabel.setBackground(Color.BLACK);
        dayFormat=new SimpleDateFormat("EEEE");
        DayLabel=new JLabel();
        DayLabel.setFont(new Font("Ink Free",Font.PLAIN,50));
        DayLabel.setBackground(Color.orange);
        DayLabel.setForeground(Color.BLACK);
        dateFormat=new SimpleDateFormat("MMMM dd, yyyy");
        DateLabel=new JLabel();
        DateLabel.setFont(new Font("Ink Free",Font.PLAIN,30));
        DateLabel.setBackground(Color.orange);
        DateLabel.setForeground(Color.BLACK);
        this.add(timeLabel);
        this.add(DayLabel);
        this.add(DateLabel);

        this.setVisible(true);
        setTime();
    }
    public void setTime()
    {
        while(true) {
            time = timeformat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            day =dayFormat.format(Calendar.getInstance().getTime());
            DayLabel.setText(day);
            Date=dateFormat.format(Calendar.getInstance().getTime());
            DateLabel.setText(Date);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

}
