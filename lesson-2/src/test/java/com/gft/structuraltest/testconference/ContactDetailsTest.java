package com.gft.structuraltest.testconference;

import com.gft.structuraltest.testconference.ContactDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.*;
import static org.junit.Assert.*;

/**
 * Created by jokrojek on 14/10/2015.
 */
@RunWith(JUnitParamsRunner.class)
public class ContactDetailsTest {

    @Test
    @Parameters({
            "jacek@wp.pl,false",
            "jacek,true",
            "<script></script>,false",
            "'',false",
            "*,false",
            "\\n,false",
            "OR '1' = '1' ,false",
            "+,false",
            "<html></html>,false",
            "atyhythtyIJOHJFEJKNKJIO,false",
            "12345,false",
            "abdds1212,false",
            "@dasda,false",
            "dsadasd dasdasd,false",
            " dsadfds,false",
            "aęęŻÓ,true",
            "kdiwĘżcofiIDMPćężąa,true",
            "aKSąćKIJFOjfjdsfsdidf,false"
    })
    public void shouldReturnTrueIfFirstNameIsValid(String firstName, boolean result)  {
        assertEquals(ContactDetails.validateFirstName(firstName), result);
    }

    @Test
    @Parameters({
    		"jacek@wp.pl,false",
    		"523587523,true",
    		"234,true",
    		"9632884221633,true",
    		"asaADdsa,false",
    		"     585566222,true",
    		"324 588 325,true",
    		"@852482,false",
    		"<html></html>,false",
    		"<script></script>,false",
            "'',false",
            "*,false",
            "\\n,false",
            "OR '1' = '1' ,false",
            "^22133,false"
    })
    public void shouldReturnTrueIfPhoneNumberIsValid(String phoneNumber, boolean result){
    	assertEquals(ContactDetails.validatePhone(phoneNumber), result);
    }

    @Test
    @Parameters({
    	"jacek@wp.pl,true",
    	" dbe@o2.pl,false",
		"56565@wp.pl,true",
		"523587523,false",
		"234,false",
		"9632884221633,false",
		"asa48@gmail.com,true",
		"@852482,false",
		"<html></html>,false",
		"<script></script>,false",
        "'',false",
        "*,false",
        "\\n,false",
       "OR '1' = '1' ,false",
        "kapuastajestdobra.pl,false"
    })
    public void shouldReturnTrueIfEmailIsValid(String email, boolean result){
    	assertEquals(ContactDetails.validateEmail(email), result);
    }




}

