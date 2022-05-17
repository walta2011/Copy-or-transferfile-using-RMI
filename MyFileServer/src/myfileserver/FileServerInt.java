package myfileserver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.*;
 
public interface FileServerInt extends Remote{
 
		public boolean login(FileClientInt c) throws RemoteException;
}