
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class client3 {
    String result;
    public client3()
    {
        try
        {
            Socket s2=new Socket("127.0.0.1",4022);
            Scanner s1=new Scanner(System.in);
            DataInputStream i;
            DataOutputStream o;
            int s=0;
            String msg;
            System.out.println("enter message");
            do
            {
                i=new DataInputStream(s2.getInputStream());
                o=new DataOutputStream(s2.getOutputStream());
                System.out.println("client :");
                msg=s1.nextLine(); 
               
                 
                 o.writeUTF(msg);
                result=i.readUTF();
                System.out.println("server replied "+result);
                
            }while(!result.equals("stop"));
            o.close();
            i.close();
            s2.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        new client3();
    }
}
