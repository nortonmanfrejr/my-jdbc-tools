package br.com.connectorDB;

import javax.swing.*;

public class Connection{

    public static void main(String[] args){

        try{
            new ConnectionFactory().getConnection("root","123456");
            JOptionPane.showMessageDialog(null, "Connection Accepted.");
        } catch (Exception Error){
            JOptionPane.showMessageDialog(null, "Connection Failure: " + Error);
        }
    }
}
