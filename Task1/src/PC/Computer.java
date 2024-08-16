package PC;

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

public class Computer {
    public static final String VENDOR = "Made in China";
    public static final String COMPUTER_NAME = "ASUS VIVOBOOK GO 15";
    Processor processor;
    Hard_Disk disk;
    RAM ram;
    Screen screen;
    Keyboard keyboard;

    public Computer(Processor processor, Hard_Disk disk, RAM ram, Screen screen, Keyboard keyboard) {
        this.processor = processor;
        this.disk = disk;
        this.ram = ram;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public double sumWeight() {
        return disk.getWeight() + ram.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Hard_Disk getDisk() {
        return disk;
    }

    public void setDisk(Hard_Disk disk) {
        this.disk = disk;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer( Processor: " + processor +
                ", hard disk: " + disk +
                ", RAM: " + ram +
                ", screen: " + screen +
                ", keyboard: " + keyboard;
    }

    public static void main(String[] args) {
        Processor processor = new Processor(Clock_Rate.HIGH, CoresNumber.LARGE_NUMBER, Manufacturer.TAIWAN, 0.5);
        Hard_Disk disk = new Hard_Disk(Type.SSD, 512, 0.3);
        RAM ram = new RAM(PC.RAM.Type.DDR5, 16, 0.4);
        Keyboard keyboard = new Keyboard(PC.Keyboard.Type.MECHANICAL, BackLight.YES, 0.5);
        Screen screen = new Screen(PC.Screen.Type.IPS, 15.6, 0.5);

        Computer computer = new Computer(processor, disk, ram, screen, keyboard);
        double weight = computer.sumWeight();
        System.out.println(computer.toString());
        System.out.println(weight);
    }

}
