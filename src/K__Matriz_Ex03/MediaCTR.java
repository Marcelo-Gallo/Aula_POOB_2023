package K__Matriz_Ex03;
public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    
    public String mostraMatriz(MediaDTO mediaDTO){
        return mediaDAO.mostraMatriz(mediaDTO);
    }
    
}
