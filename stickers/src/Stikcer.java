import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Stikcer {
    public void create() {
        try {
            //ler a imagem
            BufferedImage originalImage = ImageIO.read(new File("entrada/filme.jpg"));

            // cria uma nova imagem em momória com transparencia e com tamanho novo
            int width = originalImage.getWidth();
            int height = originalImage.getHeight();
            int newHeight = height + 200;

            BufferedImage   newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);

            // copiar a imagem original para nova imagem (em memória)
            Graphics2D graphics = (Graphics2D) newImage.getGraphics();
            graphics.drawImage(originalImage, 0, 0, null);

            // Escrever uma frase na nova imagem

            // Escrever a nova imagem em um arquivo
            ImageIO.write(newImage, "png", new File("saida/filme.png" ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        var sticker = new Stikcer();
        sticker.create();
    }
}
