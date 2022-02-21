package day29.usb;

public class UsbFan implements Usb{
    @Override
    public void execute(){
        System.out.println("ファンが回ります");
    }
}
