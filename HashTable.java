import java.util.*;
import java.io.*;
import java.awt.*;

public class HashTable
{
   public static Hashtable hash;
   public void putKey()
   {
      Scanner k = new Scanner(System.in);
      Scanner nameFile;
      hash = new Hashtable() ;
      //insert elements in hashTable
      try
      {
         nameFile = new Scanner(new FileInputStream("picture.txt"));
         while(nameFile.hasNextLine())
         {
            String namePic = nameFile.nextLine();//extract name from file
            int key = CreateKey(namePic);//Create the hash key
            
            System.out.println(key+" "+namePic);
            
            while(true)
            {
               if (!hash.contains(key))//if the key is already in the hashtable we increment it by one 
               {
                  hash.put(key,namePic);//put hash key and picture in in hash table
                  break;
               }
               key++;//incrementation
            }   
         }
      }
      catch(FileNotFoundException e)//execute if file not found
      {
         System.out.println("File not found");
      }
      
            
   }
   
   public static int CreateKey(String name)//Create the Key
      {
      int key = 0;
      for(int i = 0; i<= name.length()-1; i++)
      {
         char letter = name.charAt(i);
         key = key + letter;//convert every letter of name to numeric value and add it all together 
      }
      int hashKey = (key%31)+1;
      return hashKey;
      }

     public static String searchPic(String name, Hashtable hash)
     {
         while(true)
         {
            if (hash.containsValue(name))
            {
               System.out.println(name);
               return name;//return name if in hash table
            }
            else 
            {
               System.out.println("notFound");
               return "notFound";//return this if not
            }
         }
     }
   
   
 }