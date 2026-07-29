import javax.swing.*;
import java.awt.*;
public class TelaPerfil {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("perfil do usuario");
		janela.setSize(350,400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(null);
		
		ImageIcon ImagemOriginal = new ImageIcon("TrollFace.jpg");
		Image imagemRedimensionada = ImagemOriginal.getImage().getScaledInstance(120, 120,Image.SCALE_SMOOTH);
		JLabel foto = new JLabel(new ImageIcon(imagemRedimensionada));
		
		foto.setBounds(20,20,120,120);
		janela.add(foto);
		
		JButton btnWhatsapp = new JButton("whatsapp");
		btnWhatsapp.setBounds(20,160,150,35);
		janela.add(btnWhatsapp);
		
		btnWhatsapp.addActionListener(e -> abrirNavegador ("https://wa.me/5541999998888"));
		
		JButton btnInstagram = new JButton("instagram");
		btnInstagram.setBounds(20,200,150,35);
		janela.add(btnInstagram);
		
		btnInstagram.addActionListener(e -> abrirNavegador ("https://www.instagram.com/"));
		
		JButton btnSpotify = new JButton("spotify");
		btnSpotify.setBounds(20,240,150,35);
		janela.add(btnSpotify);
		
		btnSpotify.addActionListener(e -> abrirNavegador ("https://open.spotify.com/intl-pt/artist/1E0YoYzep0Ou0Pma61XYeD"));
		 
		janela.setVisible(true);
	}
		
		private static void abrirNavegador(String url) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			} catch (Exception e) {
				System.out.print("erro ao abrir a URL");
				
			
		}

	}

}

