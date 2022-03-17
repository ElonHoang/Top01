package Fis.B3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static boolean valueOfP() {

	}

	public static double goodLane(List<MaiAnTiem> arr) {
		double lane = 0.0;
		if (arr != null) {
			for (MaiAnTiem a : arr) {
				if (200 <= Double.parseDouble(a.getSeeds()) && Double.parseDouble(a.getSeeds()) <= 800) {
					lane = (40 - Math.sqrt(Double.parseDouble(a.getSeeds())) / 20);
				}
			}
		}
		return lane;
	}

	public static double speacialCase(List<MaiAnTiem> arr) {
		if (arr != null) {
			double conv;
			for (MaiAnTiem a : arr) {
				conv = Double.parseDouble(a.getAddress());
				if (conv >= 200 && conv < 300) {

				}
			}
		}
		return conv;
	}

	String type = "";

	public double caltivar(List<MaiAnTiem> arr) {
		double calti = 0.0;
		if (arr != null) {
			for (MaiAnTiem a : arr) {
				double conv = Double.parseDouble(a.getSeeds());

				if (conv % 6 == 0) {
					calti = conv / 2;
					type = "Dua hau";
				} else if (conv % 6 == 1) {
					calti = conv * 2;
					type = "Oi";
				} else if (conv % 6 == 2) {
					calti = -Math.pow(conv % 9, 3) / 5;
					type = "Xoai";
				} else if (conv % 6 == 3) {
					calti = -Math.pow(conv % 30, 2) + 3 * conv;
					type = "Du du";
				} else if (conv % 6 == 4) {
					calti = -conv;
					type = "Mit";
				} else if (conv % 6 == 5) {
					calti = -((conv % 5) + 5);
					type = "Dua";
				}
			}
		}
		return calti;
	}

	public double harvestYield(List<MaiAnTiem> arr) {
		double percent = 0;

		for (MaiAnTiem a : arr) {
			if (arr != null) {
				String fr = a.getWeather();
				double conv = Double.parseDouble(a.getSeeds());
				double sw = conv % 6;
				switch (type) {
				case "Dua":
					if (conv % 6 == 5 && fr.equalsIgnoreCase("Flood")) {
						percent = 0;
					} else if (conv % 6 == 5 && fr.equalsIgnoreCase("Storm")) {
						percent = 5;
					} else if (conv % 6 == 5 && fr.equalsIgnoreCase("Rain")) {
						percent = 10;
					} else if (conv % 6 == 5 && fr.equalsIgnoreCase("Shower")) {
						percent = 15;
					} else if (conv % 6 == 5 && fr.equalsIgnoreCase("Drizzle")) {
						percent = 20;
					} else if (conv % 6 == 5 && fr.equalsIgnoreCase("Cloudy")) {
						percent = 25;
					}
					break;
				case "Mit":
					if (conv % 6 == 4 && fr.equalsIgnoreCase("Flood")) {
						percent = -5;
					} else if (conv % 6 == 4 && fr.equalsIgnoreCase("Storm")) {
						percent = 0;
					} else if (conv % 6 == 4 && fr.equalsIgnoreCase("Rain")) {
						percent = 5;
					} else if (conv % 6 == 4 && fr.equalsIgnoreCase("Shower")) {
						percent = 10;
					} else if (conv % 6 == 4 && fr.equalsIgnoreCase("Drizzle")) {
						percent = 15;
					} else if (conv % 6 == 4 && fr.equalsIgnoreCase("Cloudy")) {
						percent = 20;
					}
					break;
				case "Dua Hau":
					if (conv % 6 == 0 && fr.equalsIgnoreCase("Flood")) {
						percent = -10;
					} else if (conv % 6 == 0 && fr.equalsIgnoreCase("Storm")) {
						percent = -5;
					} else if (conv % 6 == 0 && fr.equalsIgnoreCase("Rain")) {
						percent = 0;
					} else if (conv % 6 == 0 && fr.equalsIgnoreCase("Shower")) {
						percent = 5;
					} else if (conv % 6 == 0 && fr.equalsIgnoreCase("Drizzle")) {
						percent = 10;
					} else if (conv % 6 == 0 && fr.equalsIgnoreCase("Cloudy")) {
						percent = 15;
					}
					break;
				case "Oi":
					if (conv % 6 == 1 && fr.equalsIgnoreCase("Flood")) {
						percent = -15;
					} else if (conv % 6 == 1 && fr.equalsIgnoreCase("Storm")) {
						percent = -10;
					} else if (conv % 6 == 1 && fr.equalsIgnoreCase("Rain")) {
						percent = -5;
					} else if (conv % 6 == 1 && fr.equalsIgnoreCase("Shower")) {
						percent = 0;
					} else if (conv % 6 == 1 && fr.equalsIgnoreCase("Drizzle")) {
						percent = 5;
					} else if (conv % 6 == 1 && fr.equalsIgnoreCase("Cloudy")) {
						percent = 10;
					}
					break;
				case "Xoai":
					if (conv % 6 == 2 && fr.equalsIgnoreCase("Flood")) {
						percent = -20;
					} else if (conv % 6 == 2 && fr.equalsIgnoreCase("Storm")) {
						percent = -15;
					} else if (conv % 6 == 2 && fr.equalsIgnoreCase("Rain")) {
						percent = -10;
					} else if (conv % 6 == 2 && fr.equalsIgnoreCase("Shower")) {
						percent = -5;
					} else if (conv % 6 == 2 && fr.equalsIgnoreCase("Drizzle")) {
						percent = 0;
					} else if (conv % 6 == 2 && fr.equalsIgnoreCase("Cloudy")) {
						percent = 5;
					}
					break;
				case "Du du":
					if (conv % 6 == 3 && fr.equalsIgnoreCase("Flood")) {
						percent = -25;
					} else if (conv % 6 == 3 && fr.equalsIgnoreCase("Storm")) {
						percent = -20;
					} else if (conv % 6 == 3 && fr.equalsIgnoreCase("Rain")) {
						percent = -15;
					} else if (conv % 6 == 3 && fr.equalsIgnoreCase("Shower")) {
						percent = -10;
					} else if (conv % 6 == 3 && fr.equalsIgnoreCase("Drizzle")) {
						percent = -5;
					} else if (conv % 6 == 3 && fr.equalsIgnoreCase("Cloudy")) {
						percent = 0;
					}
					break;
				default:
					break;
				}
			}
		}
		return percent;
	}

	public static double calculateSeed(List<MaiAnTiem> arr) {
		double survival = 0.0;
		if (arr != null) {
			for (MaiAnTiem a : arr) {
				if (Double.parseDouble(a.getSeeds()) < 200) {
					survival = 0;
				} else if (200 <= Double.parseDouble(a.getSeeds()) && Double.parseDouble(a.getSeeds()) <= 800) {
					if (200 <= Double.parseDouble(a.getSeeds()) && Double.parseDouble(a.getSeeds()) < 300) {

					}

				}
			}
		}
		return survival;
	}
	public static double soilSalinity(List<MaiAnTiem> arr) {
		double cal = 0.0;
		if(arr != null) {
			for(MaiAnTiem a : arr) {
				cal = -(Double.parseDouble(a.getAddress()) * Double.parseDouble(a.getSeeds())) / 1000;
			}
		}
		return cal;
	}

	public static void main(String[] args) throws IOException {
		List<MaiAnTiem> list = new ArrayList<>();
		Path read_MAT_list = Paths.get("src/Fis/B3/input.inp");
		Path write = Paths.get("src/Fis/B3/out.out");
		try (BufferedReader br_MAT_list = Files.newBufferedReader(read_MAT_list, StandardCharsets.UTF_8);
				BufferedWriter bw = Files.newBufferedWriter(write, StandardCharsets.UTF_8);) {
			String MAT_list = null;
			int i = 0;
			while ((MAT_list = br_MAT_list.readLine()) != null) {
				String[] writeLine_MAT_list = MAT_list.split("\t");
				if (i > 0) {
					list.add(new MaiAnTiem(writeLine_MAT_list[0], writeLine_MAT_list[1], writeLine_MAT_list[2],
							writeLine_MAT_list[3]));
				}
				i++;
				bw.write(MAT_list);
				bw.newLine();
			}

		}
		for (MaiAnTiem added : list) {
			System.out.println(added);
		}
	}
}
