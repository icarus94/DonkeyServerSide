package server.startup;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

import server.gameroom.DonkeyServerGameRooms;

public class DonkeyServerStart {
	/**
	 * List of game rooms
	 */
	static LinkedList<DonkeyServerGameRooms> serverGameRoomSocket = new LinkedList<DonkeyServerGameRooms>();

	public static void main(String[] args) {
		try {
			/**
			 * Open server socket for listening
			 */
			ServerSocket serverSocketForGameRooms = new ServerSocket(13413);
			
			while(true){
				Socket newSocket=serverSocketForGameRooms.accept();
				serverGameRoomSocket.addFirst(new DonkeyServerGameRooms(newSocket));
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Server is down!");
		}

	}

}
