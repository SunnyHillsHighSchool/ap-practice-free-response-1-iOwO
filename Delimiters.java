import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
    //store delimiters
    ArrayList<String> delims = new ArrayList<String>();
    //loop through tokens list
    for(int x = 0; x < tokens.length; x++) 
    {
      //check if something is a delimiter
      if(tokens[x].equals(openDel)||tokens[x].equals(closeDel)) 
      {
        //add delimiters to list
        delims.add(tokens[x]);
      }
    }
    //return list with only delimiters
		return delims;
	}

	public boolean isBalanced(ArrayList<String> delims)
	{ 
    //store how many open or closed delimiters
    int countOpen = 0;
    int countClosed = 0;
    //loop through list
    for(int x = 0; x < delims.size(); x++) 
    {
      //count open and closed lists
      if(delims.get(x).equals(openDel))
      {
        countOpen++;
      }
      if(delims.get(x).equals(closeDel))
      {
        countClosed++;
      }
    }
    //return true or false if the amount is equal.
    if(countOpen == countClosed) 
    {
      return true;
    }
    return false; 
	}
}