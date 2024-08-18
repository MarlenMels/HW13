import PC.Computer;
import PC.Disk.Hard_Disk;
import PC.Disk.Type;
import PC.Keyboard.BackLight;
import PC.Keyboard.Keyboard;
import PC.Proc.Clock_Rate;
import PC.Proc.CoresNumber;
import PC.Proc.Manufacturer;
import PC.Proc.Processor;
import PC.RAM.RAM;
import PC.Screen.Screen;

public class Main{
    public static void main(String[] args) {
        Processor processor = new Processor(Clock_Rate.THREE_THOUSAND_HERTZ, CoresNumber.EIGHT_CORES, Manufacturer.AMD, 0.5);
        Hard_Disk disk = new Hard_Disk(Type.SSD, 512, 0.5);
        RAM ram = new RAM(PC.RAM.Type.DDR5, 16,0.5);
        Screen monitor = new Screen(PC.Screen.Type.IPS, 15, 0.5 );
        Keyboard keyboard = new Keyboard(PC.Keyboard.Type.WIRELESS, BackLight.YES, 0.5);
        Computer computer = new Computer(processor, disk, ram, monitor, keyboard, "Made in China", "Asus VivoBook go 15");
        System.out.println(computer);
    }

}