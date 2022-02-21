package day29.usb;

public class PC {
    Usb usbDevice; //PCはUSBを持っている（has-aの関係）
    void setUsbDevice(Usb device){
        this.usbDevice = device;
    }
    void executeUsb(){
        if(this.usbDevice == null){
            System.out.println("usb機器は接続されていません");
            return;
        }
        this.usbDevice.execute();
    }
}
