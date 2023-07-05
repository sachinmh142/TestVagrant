package org.testVagrant.com.TestVagrant;

import java.util.LinkedList;
import java.util.List;


public class App 
{
	static LinkedList<String> songList;
	
	public static void main(String[] args) {
		
		
		//Using linked list , because it has additional methods than arrayList Collection
		//both are dynamic becz of additional built in methods using this 
		
		songList=new LinkedList<String>();
		songList.add("s1");
		songList.add("s2");
		songList.add("s3");
		printPlayList(songList);
		
		 
		sortingplaylist(songList,"s4");
		printPlayList(songList);
		
		sortingplaylist(songList,"s2");
		printPlayList(songList);
		
		sortingplaylist(songList,"s1");
		printPlayList(songList);
		
		
	}
	
	
	public static void printPlayList(List<String> list)
	{
		System.out.println("Song Queue as follows : "+list);
	}
	
	public static void sortingplaylist(LinkedList<String> list, String newSong)
	{

          
          list.removeFirst();
    	  list.addLast(newSong);
    	  
//        if(!list.contains(newSong))
//        {
//      	  list.removeFirst();
//      	  list.addLast(newSong);
//        }else
//        {
//      	  list.removeFirst();
//      	  list.addLast(newSong);
//        }
	}
	
	
}
