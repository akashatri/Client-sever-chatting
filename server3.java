
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
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
public class server3 {
    String msg;
    public server3()
    {
        try
        {
            Socket s2=null; //null?
            ServerSocket s3=new ServerSocket(4022);
            System.out.println("server is started");
            s2=s3.accept();
            Scanner s1=new Scanner(System.in);
            DataInputStream i=null;
            DataOutputStream o=null;    
            String r;
            i=new DataInputStream(s2.getInputStream());
            o=new DataOutputStream(s2.getOutputStream());
            do
            {
                msg=i.readUTF();
                System.out.println("client said :"+msg);
                System.out.println("server :");
                r=s1.nextLine();
                o.writeUTF(r);                             
                
            }while(!msg.equals("stop"));
            i.close();
            o.close();
            s2.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        new server3();
            }
}
