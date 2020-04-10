package com.company;

public class Main {

    public static void main(String[] args) {
	    Database dataB = new Database();
	    dataB.setConn();

	    ArtistController artistC = new ArtistController(dataB.conn);
	    AlbumController albumC = new AlbumController(dataB.conn);

        artistC.create("Armin Van Buuren","Netherlands");
        artistC.create("Paul Van Dyk", "Germany");

        albumC.create("Embrace", 1, 2015);
        albumC.create("From Then On", 2, 2017);

        artistC.findByName("Armin Van Buuren");
        albumC.findByArtist(1);


    }
}
