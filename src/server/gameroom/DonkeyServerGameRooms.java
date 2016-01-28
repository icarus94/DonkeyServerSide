package server.gameroom;

import java.net.Socket;

public class DonkeyServerGameRooms extends Thread {
	
	Socket socketForThisGameRoom;

	public DonkeyServerGameRooms(Socket socketForThisGameRoom) {
		super();
		this.socketForThisGameRoom = socketForThisGameRoom;
	}
	
	

}
