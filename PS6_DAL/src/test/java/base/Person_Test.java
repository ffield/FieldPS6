package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {

	private static PersonDomainModel per1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Date dDate = null;
		try {
			dDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		per1 = new PersonDomainModel();
		per1.setFirstName("Bert");
		per1.setLastName("Gibbons");
		per1.setBirthday(dDate);
		per1.setCity("Townsend");
		per1.setPostalCode(19010);
		per1.setStreet("214 Labrador Lane");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	public void setUp() throws Exception {
	}

	
	public void tearDown() throws Exception {
		PersonDomainModel per;	
		
		per = PersonDAL.getPerson(per1.getPersonID());
		assertNull("The Person shouldn't have been in the database",per);		
	}
	
	@Test
	public void AddPersonTest()
	{		
	}
}