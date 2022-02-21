package day29.usb;

public class PCApp {
    public static void main(String[] args) {
        PC pc = new PC();
        Usb[] usbDevices = {
            new UsbMemory(), //Usb型にUsbMemory型を代入
            new UsbFan()
        };
        pc.setUsbDevice(usbDevices[0]);
        pc.executeUsb();
        pc.setUsbDevice(usbDevices[1]);
        pc.executeUsb();
    }
}
