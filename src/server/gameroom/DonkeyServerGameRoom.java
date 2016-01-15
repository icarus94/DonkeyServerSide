package server.gameroom;

import java.net.Socket;

public class DonkeyServerGameRoom extends Thread {
	
	Socket socketForThisGameRoom;

	public DonkeyServerGameRoom(Socket socketForThisGameRoom) {
		super();
		this.socketForThisGameRoom = socketForThisGameRoom;
	}
	
	

}
