/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author James.Russo
 */
import java.util.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
public class Practice {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress IP= InetAddress.getLocalHost();
        System.out.println(IP.getHostAddress());
    }
    
}
