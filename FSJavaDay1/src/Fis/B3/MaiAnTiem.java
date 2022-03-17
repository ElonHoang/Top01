package Fis.B3;

public class MaiAnTiem {
	private String health;
	private String seeds;
	private String address;
	private String weather;
	public MaiAnTiem() {
		
	}
	public MaiAnTiem(String _health, String _seeds, String _add, String _weather) {
		this.health = _health;
		this.seeds = _seeds;
		this.address = _add;
		this.weather = _weather;
	}
	public String getHealth() {
		return this.health;
	}
	public String getSeeds() {
		return this.seeds;
	}
	public String getAddress() {
		return this.address;
	}
	public String getWeather() {
		return this.weather;
	}
	public void setHealth(String _health) {
		this.health = _health;
	}
	public void setSeeds(String _seeds) {
		this.seeds = _seeds;
	}
	public void setAddress(String _add) {
		this.address = _add;
	}
	public void setWeather(String _weather) {
		this.weather = _weather;
	}
	public String toString() {
		return("Health :" + getHealth() 
				+ "\nSeeds : " + getSeeds()
				+ "\nAddress : " + getAddress()
				+ "\n Weather :" + getAddress() + "\n ________");
	}
}
