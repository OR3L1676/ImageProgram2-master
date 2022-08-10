import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Filters extends JPanel {
    File output;
    BufferedImage image;


    public File colorShiftRight(File file) throws Exception {
        if (file.exists()) {
            image = ImageIO.read(file);// כדי להשתמש בתמונה
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    Color color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    Color newColor = new Color(green, blue, red);
                    image.setRGB(x, y, newColor.getRGB());
                }
            }
            output = new File("C:\\Users\\User\\Pictures\\imagesToJava\\clipartCOLORSHIFTRIGHT__.png");
            ImageIO.write(image, "png", output);
            return output;
        }
        return null;// סוגר שבודק האם הקובץ קיים
    }// end of the changeColor function

    public File colorShiftLeft(File file) throws Exception {
        if (file.exists()) {
            image = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    Color color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    Color newColor = new Color(blue, red, green);
                    image.setRGB(x, y, newColor.getRGB());
                }
            }
            output = new File("C:\\Users\\User\\Pictures\\imagesToJava\\clipartCOLORSHIFTLEFT__.png");
            ImageIO.write(image, "png", output);
            return output;
        }
        return null;
    }

    public File sepia(File file) throws Exception {
        if (file.exists()) {
            image = ImageIO.read(file);// כדי להשתמש בתמונה
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    Color color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    int avg = (red + green + blue) / 3;
                    int depth = 20;
                    int intensity = 30;
                    red = avg + (depth * 2);
                    green = avg + depth;
                    blue = avg - intensity;
                    if (red > 255) red = 255;
                    if (green > 255) green = 255;
                    if (blue > 255) blue = 255;
                    if (blue < 0) blue = 0;
                    Color newColor = new Color(red, green, blue);
                    image.setRGB(x, y, newColor.getRGB());
                }
            }
            //Saving the modified image
            output = new File("C:\\Users\\User\\Pictures\\imagesToJava\\clipartSOPHIA__.png");
            ImageIO.write(image, "png", output);
            return output;

        }
        return null;
    }

    public File greyScale(File file) throws Exception {
        if (file.exists()) {
            image = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    Color color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    int average = (red + green + blue) / 3;
                    Color newColor = new Color(average, average, average);
                    image.setRGB(x, y, newColor.getRGB());
                }
            }
            output = new File("C:\\Users\\User\\Pictures\\imagesToJava\\clipartGREYSCALE__.png");
            ImageIO.write(image, "png", output);
            return output;

        }
        return null;
    }

    public File contracts(File file) throws Exception {
        if (file.exists()) {
            image = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    Color color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    Color newColor = new Color(255 - red, 255 - green, 255 - blue);
                    image.setRGB(x, y, newColor.getRGB());
                }
            }
            output = new File("C:\\Users\\User\\Pictures\\imagesToJava\\clipartCONTRACTS__.png");
            ImageIO.write(image, "png", output);
            return output;
        }
        return null;
    }

    public File flipImage(File file) throws Exception {
        if (file.exists()) {
            image = ImageIO.read(file);
            BufferedImage outputImage = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    Color color = new Color(pixel);
                    outputImage.setRGB(image.getWidth() - x - 1, y, color.getRGB());
                }
            }
            output = new File("C:\\Users\\User\\Pictures\\imagesToJava\\clipartFLIPIMAGE__.png");
            ImageIO.write(outputImage, "png", output);
            return output;
        }
        return null;
    }

}
