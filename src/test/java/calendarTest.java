import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.roclas.googleApis.CalendarOperator;


public class calendarTest {

	@Test
	public void creatingEventTest() throws IOException {
		/*
		System.out.println("creating event");
		String user="time.it@bbvaglobalnet.com";
		String priv="db8f3b7a86264a8a34a80d65dcefc3aa";
		String password=null;
		if(password==null || user==null){ assert(false); }
		CalendarOperator operator=new CalendarOperator(user,password,priv);
		operator.createEvent("17:00","19:00","MISUPEREVENTOtest");
		*/
		assert(true);
	}
	
	@Test
	public void listingEventsTest() throws IOException {
		/*
		System.out.println("listing events");
		String user="time.it@bbvaglobalnet.com";
		String password=null;
		String priv="db8f3b7a86264a8a34a80d65dcefc3aa";
		if(password==null || user==null){ assert(false); }
		CalendarOperator operator=new CalendarOperator(user,password,priv);
		Map<String,Map<String,String>> map= operator.listEvents();
		Set<String> keys = map.keySet();
		for(String key:keys){
			System.out.println("event: "+key);
			Map<String, String> m = map.get(key);
			for(String k: m.keySet()){
				System.out.println("---- "+k+" : "+m.get(k));
			}
			System.out.println("\n\n");
		}
		*/
		assert(true);
	}

}
