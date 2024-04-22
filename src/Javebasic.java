import java.awt.print.Printable;
import java.util.ArrayList;

import org.checkerframework.common.value.qual.StaticallyExecutable;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class Javebasic {

	public static void main(String[] args) {
//		int num=5;
//		double deci=8.2;
//		char a='f';
//		String my="I need to get job as early as possible";
		
//		System.out.println(my+  num+a);
//		//Arrays
//		int[] arr=new int[5];   //first way to create array
//		arr[0]=100;
//		arr[1]=200;
//		arr[2]=300;
//		arr[3]=400;
//				
//		System.out.println(arr[1]);
//		System.out.println(arr[4]);
//		
//		int[] arr1= {10,20,30,40,50};     //2nd way to declare an array
//		System.out.println(arr1[3]);
		
		//for loop
		
//		for (int i=0; i<arr.length; i++)
//		{
//					System.out.println(arr1[i]);
//					System.out.println(arr[i]);
//		}
//		String[] name= {"ishika","frooty","laddu"};
//		for(int i=0; i<name.length; i++ )
//		{
//			System.out.println(name[i]);
//		}
	    //enhanced for loop and if else conditions
		
		
		//Dynamically create an array 
		ArrayList<String> a=new ArrayList<String>();   //Arraylist-->Class,a-->object, Arraylist()-->class name,inside the class>methods
        a.add("manasa");
        a.add("vin");
        a.add("joya");
        a.add("maya");
        a.add("froty");
     
        System.out.println(a.get(0));
        for (int i=0;i<a.size();i++)
        {
        	System.out.println(a.get(i));
        }
        System.out.println("*******************");
        for(String val :a)
        {
        	System.out.println(val);
        }
       // String itemString IsConstructor presentr.println(a.contains("joya");
        
     
	}

}
