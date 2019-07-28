/**
 * @ClassName LiftOff
 * @Decription TODO
 * @Author Yanru Zhang
 * @Date 2019/7/10 13:00
 * @Version 1.0
 **/
public class LiftOff implements Runnable
{
   protected int countDown = 10;
   private static int taskCount = 0;
   private final int id = taskCount ++;
   public LiftOff()
   {
   }

   public LiftOff(int countDown)
   {
       this.countDown = countDown;
   }

   public String status()
   {
       return "#" + id +"("+(countDown > 0 ? countDown : "LiftOff!" )+")，";
   }

   public void run()
   {
       System.out.println("start run, countDown="+countDown+"@");
       while (countDown -- >0)
       {
           System.out.println(status());
           Thread.yield();
       }
   }
}
