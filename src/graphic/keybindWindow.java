package graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class keybindWindow  extends JFrame { //JFrame che mostra i controlli del gioco per un tempo determinato, poi avvia il gioco vero

    JFrame visualizerWindow;

    Font pixelFont;

    JPanel player1Panel;
    JPanel player2Panel;
    JPanel player3Panel;
    JPanel player4Panel;
    JLabel player1Label = new JLabel();
    JLabel player2Label = new JLabel();
    JLabel player3Label = new JLabel();
    JLabel player4Label = new JLabel();

    public keybindWindow(int numPlayers) {
        super("Keybinds");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Chiude solo la finestra
        this.setResizable(false);
        this.setSize(800, 200);
        this.setLayout(new GridLayout(4,1));
        // Posiziona la finestra al centro dello schermo
        this.setLocationRelativeTo(null);

        //Font
        pixelFont = new pixelFont().getPixelFont().deriveFont(24f);

        //Visualizzazione dei controlli
        //Player 1
        player1Panel = new JPanel();
        this.add(player1Panel);
        player1Panel.add(player1Label);
        player1Label.setFont(pixelFont);
        //Player 2
        player2Panel = new JPanel();
        this.add(player2Panel);
        player2Panel.add(player2Label);
        player2Label.setFont(pixelFont);
        //Player 3
        player3Panel = new JPanel();
        this.add(player3Panel);
        player3Panel.add(player3Label);
        player3Label.setFont(pixelFont);
        //Player 4
        player4Panel = new JPanel();
        this.add(player4Panel);
        player4Panel.add(player4Label);
        player4Label.setFont(pixelFont);

        player1Label.setText("Player 1: W A S D per muoversi, B per piazzare la bomba."); //Fuori dalla switch per evitare ripetizioni

        switch (numPlayers){
            case 1:
                player2Label.setText("Il ketchup >>> maionese.");
                player3Label.setText("In Svizzera risulta illegale possedere un solo porcellino d'India.");
                player4Label.setText("Il vero nome degli hashtag è ottotorpe");
                break;
            case 2:
                player2Label.setText("Player 2: I J K L  per muoversi, - per piazzare la bomba.");
                player3Label.setText("Nel film \"Pulp Fiction\" tutti gli orologi segnano le 4:20.");
                player4Label.setText("In Giappone esistono 200 varietà di Kit Kat.");
                break;
            case 3:
                player2Label.setText("Player 2: I J K L  per muoversi, - per piazzare la bomba.");
                player3Label.setText("Player 3: T F G H , Y per piazzare la bomba.");
                player4Label.setText("\"Cereale\" viene da Ceres, la dea greca dell'agricoltura." );
                break;
            case 4:
                player2Label.setText("Player 2: I J K L  per muoversi, - per piazzare la bomba.");
                player3Label.setText("Player 3: T F G H , Y per piazzare la bomba.");
                player4Label.setText("Player 4: 8 4 5 6 per muoversi, 0 per piazzare la bomba.");
                break;
        }

        //Timer
        Timer timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        // Avvia il timer
        timer.start();

        //Modifica icona della finestra
        this.setIconImage(new ImageIcon("graphics"+File.separator+"decoration"+File.separator+"icon.png").getImage());
        this.setVisible(true);
    }
}
