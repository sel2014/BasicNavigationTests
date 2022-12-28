package com.cbt.utilities;

public class StringUtility {


    public static void verifyEquals(String expected, String actual){

        if (expected.equalsIgnoreCase(actual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println(expected);
            System.out.println(actual);
        }
    }
}

/*
5. Create	class	StringUtility under	utilities package.
6. Create	a	public static	method	verifyEquals	which	takes	two	string	arguments,
expected	and	actual.
7. The	method	prints	`PASS` if	both	strings	are	equals	to	each	other.	Else	it	prints
`FAIL` and	it	also	prints	the	values	of	both	arguments
 */
