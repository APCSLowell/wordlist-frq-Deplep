import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    for(int i = 0; i < myList.size(); i += 1){
      if(myList.get(i).length == len){
        count += 1;
      }
    }
    return count;
  }

  public void removeWordsOfLength(int len)
  {
    while(i < myList.size()){
      if(myList.get(i).length() == len){
        myList.remove(i);
      } else {
        i += 1;
      }
    }
  }
}
