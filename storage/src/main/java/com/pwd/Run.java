package com.pwd;


import java.io.UnsupportedEncodingException;

public class Run {
    public static void main(String[] args) throws UnsupportedEncodingException {
        WinCred wc = new WinCred();
        // Create a credential
        wc.setCredential("Application Name", "Username", "Password");
        // Get a credential
        WinCred.Credential cred = wc.getCredential("zxczxc");
        String username = cred.username;
        String password = cred.password;

        System.out.println(username);
        System.out.println(password);
        // Delete a credential
        wc.deleteCredential("Application Name");
    }
}
