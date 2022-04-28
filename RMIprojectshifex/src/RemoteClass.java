
import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
public class RemoteClass extends
        UnicastRemoteObject implements RMIinterface {
    RemoteClass() throws RemoteException {
        super();
    }
    public void mixingMusic(String Name) {
       try {
            JFXPanel j=new JFXPanel();
            String urip=new File("shifex.mp4").toURI().toString();
            new MediaPlayer(new Media(urip)).play();    
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
        }
    }
     public void mixingMusdic(String Name) {
       try {
            JFXPanel j=new JFXPanel();
            String urip=new File("Hacee.m4a").toURI().toString();
            new MediaPlayer(new Media(urip)).play();    
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
        }
    
    }
}

