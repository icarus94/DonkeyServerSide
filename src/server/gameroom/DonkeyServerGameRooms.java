package server.gameroom;

import java.net.Socket;

public class DonkeyServerGameRooms extends Thread {
	
	Socket socketForThisGameRoom;
	DonkeyPlayRoom playRoomFor4;
	

	public DonkeyServerGameRooms(Socket socketForThisGameRoom) {
		super();
		this.socketForThisGameRoom = socketForThisGameRoom;
	}
	
	public void run(){
		
	}
	

}
