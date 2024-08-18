package PC;

import PC.Disk.Hard_Disk;
import PC.Keyboard.Keyboard;
import PC.Proc.Processor;
import PC.RAM.RAM;
import PC.Screen.Screen;

public class Computer {
    private Processor processor;
    private Hard_Disk disk;
    private RAM ram;
    private Screen screen;
    private Keyboard keyboard;
    private final String VENDOR;
    private final String COMPUTER_NAME;

    public Computer(Processor processor,
                    Hard_Disk disk,
                    RAM ram,
                    Screen screen,
                    Keyboard keyboard,
                    String VENDOR, String COMPUTER_NAME) {
        this.processor = processor;
        this.disk = disk;
        this.ram = ram;
        this.screen = screen;
        this.keyboard = keyboard;
        this.VENDOR = VENDOR;
        this.COMPUTER_NAME = COMPUTER_NAME;
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

    public String getVENDOR() {
        return VENDOR;
    }

    public String getCOMPUTER_NAME() {
        return COMPUTER_NAME;
    }

    public double getWeight() {
        return processor.getWeight() +
                disk.getWeight() +
                ram.getWeight() +
                screen.getWeight() +
                keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", disk=" + disk +
                ", ram=" + ram +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                ", VENDOR='" + VENDOR + '\'' +
                ", COMPUTER_NAME='" + COMPUTER_NAME + '\'' +
                '}';
    }

}
