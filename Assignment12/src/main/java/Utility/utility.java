package Utility;

public class utility {
	public static String URL1() 
    {
	String URL1 = "https://jsonplaceholder.typicode.com";
	return URL1;
    }
	
    public static String URL2() 
    {
	String URL2 = "https://help.tableau.com/current/api/rest_api/en-us/REST/rest_api_concepts_example_requests.htm";
	return URL2;
    }
    public static String body(String name, String password) 
    {
	String body = "{\r\n"
			+ "  \"credentials\": {\r\n"
			+ "    \"name\": \""+name+"\",\r\n"
			+ "    \"password\": \""+password+"\",\r\n"
			+ "    \"site\": {\r\n"
			+ "      \"contentUrl\": \"\"\r\n"
			+ "    }\r\n"
			+ "  }\r\n"
			+ "}";
	return body;
    }
}