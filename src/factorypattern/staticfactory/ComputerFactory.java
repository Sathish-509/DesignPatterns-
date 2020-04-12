package factorypattern.staticfactory;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		switch(type) {
			case "pc": return new PC(ram, hdd, cpu);
			case "server": return new Server(ram, hdd, cpu);
			default: return null;
		}
	}
}
