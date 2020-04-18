package app;

import repo.AlbumRepository;

public class AlbumManager {
    public static void main(String[] args){
        AlbumRepository albumRepository = new AlbumRepository();
        albumRepository.findById(1);
    }
}
