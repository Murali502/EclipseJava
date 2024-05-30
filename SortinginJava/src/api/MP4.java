package api;

import java.util.ArrayList;
import java.util.Collections;

import myUtility.Myutilities;

public class MP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song song1=new Song("take me to your heart","Michael",2014);
		Song song2=new Song("see you again","Wis",2019);
		Song song3=new Song("Love me like you do","Ellie",2021);
		Song song4=new Song("as long as you like me "," Murali",2022);
		ArrayList<Song> musicList =new ArrayList<>();
		
		musicList.add(song1);
		musicList.add(song2);
		musicList.add(song3);
		musicList.add(song4);
		
		Collections.sort(musicList);
		Myutilities.iteratListString(musicList);
		
		
	}

}
