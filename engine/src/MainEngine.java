import exceptionsFromXml.*;
import generatedEx2.CTEEnigma;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class MainEngine {


    private final static String JAXB_XML_GAME_PACKAGE_NAME = "generatedEx2";
    //function that creates the instance of the xml file to a java object
    private static CTEEnigma deserializeFrom(InputStream in) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(JAXB_XML_GAME_PACKAGE_NAME);
        Unmarshaller u = jc.createUnmarshaller();
        return (CTEEnigma) u.unmarshal(in);
    }

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("C:\\Users\\new\\IdeaProjects\\C.T.E-Cracking The Enigma Machine\\engine\\src\\resourcesEx2\\ex2-large.xml");
            CTEEnigma countries = deserializeFrom(inputStream);
        }catch (JaxbException | FileNotFoundException | JAXBException e){
           e.printStackTrace();
        }

    }


}
