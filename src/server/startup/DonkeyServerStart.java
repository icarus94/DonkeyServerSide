package server.startup;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

import server.gameroom.DonkeyServerGameRoom;

public class DonkeyServerStart {
	/**
	 * List of game rooms
	 */
	static LinkedList<DonkeyServerGameRoom> serverGameRoomSocket = new LinkedList<DonkeyServerGameRoom>();

	public static void main(String[] args) {
		try {
			/**
			 * Open server socket for listening
			 */
			ServerSocket serverSocketForGameRooms = new ServerSocket(13413);
			
			while(true){
				Socket newSocket=serverSocketForGameRooms.accept();
				serverGameRoomSocket.addFirst(new DonkeyServerGameRoom(newSocket));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
