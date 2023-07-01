package rentMyCam.io;

import java.util.ArrayList;

public class ViewAllCams {

	public static void View(ArrayList<Camera> list) {
		int i=1;
		System.out.println("CamID\tBrand\tModel\tPrice(per day)\tStatus");
		System.out.println("=============================================================");
		for(Camera c : list) {	
		System.out.println(i+"\t"+c.CamName+"\t"+c.Model+"\t"+c.Rent+"\t\tavailable");
			i=i+1;
		}
		LoginPage.Menu(list);
	}

}
