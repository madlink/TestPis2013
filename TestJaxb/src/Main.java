import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.omg.spec.bpmn._20100524.di.BPMNDiagram;

public class Main {

	public static void main(String[] args) {
		System.out.println("El XPDL!!");
		// leer un xpdl
		readXPDL();
		
		System.out.println();
		
		System.out.println("El BPMN!!");
		// leer un bpmn <--- tendria que escribir uno pero mi interes era ver si las clases se mapeaban bine :)
		readBPMN();

	}
	
	/**
	 * How to read XPDL
	 */
	public static void readXPDL(){
		String path = "Proceso Ad Hoc.xpdl";
		XMLInputFactory factory = XMLInputFactory.newInstance(); // Factory para obtener xmlreaders
		try {
			JAXBContext xpdlContext = JAXBContext.newInstance(org.wfmc._2009.xpdl2.PackageType.class); // Contexto JAXB con la clase que corresponde al root del xml 
			Unmarshaller unmarshallerXpdl = xpdlContext.createUnmarshaller();
			File file = new File(path);
			if(file.exists()){
				XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(path)); // XML reader que usara JAXB el cual apunta al archivo a leer
				JAXBElement<org.wfmc._2009.xpdl2.PackageType> jaxbPackage = unmarshallerXpdl.unmarshal(reader,org.wfmc._2009.xpdl2.PackageType.class); //Aca es cuando efectivamente des-serializa
				
				org.wfmc._2009.xpdl2.PackageType packageType = jaxbPackage.getValue(); // Aca obtengo el elemento root del xml 
				org.wfmc._2009.xpdl2.PackageHeader header = packageType.getPackageHeader();
				System.out.println(packageType.getName());
				System.out.println("Vendor: " + header.getVendor().getValue());
				System.out.println("Version: " + header.getXPDLVersion().getValue());
				System.out.println("Documentation: " + header.getDocumentation().getValue());
				
			}else{
				System.out.println(file.getAbsolutePath());					
			}
			
		} catch (JAXBException | FileNotFoundException | XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * How to read BPMN
	 */
	public static void readBPMN(){
		String path = "process.bpmn20.xml";
		XMLInputFactory factory = XMLInputFactory.newInstance(); // Factory para obtener xmlreaders
		try {
			JAXBContext xpdlContext = JAXBContext.newInstance(org.omg.spec.bpmn._20100524.model.TDefinitions.class); // Contexto JAXB con la clase que corresponde al root del xml 
			Unmarshaller unmarshallerXpdl = xpdlContext.createUnmarshaller();
			File file = new File(path);
			if(file.exists()){
				XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(path)); // XML reader que usara JAXB el cual apunta al archivo a leer
				JAXBElement<org.omg.spec.bpmn._20100524.model.TDefinitions> jaxbPackage = unmarshallerXpdl.unmarshal(reader,org.omg.spec.bpmn._20100524.model.TDefinitions.class); //Aca es cuando efectivamente des-serializa
				
				org.omg.spec.bpmn._20100524.model.TDefinitions definitions = jaxbPackage.getValue(); // Aca obtengo el elemento root del xml 
				java.util.List<BPMNDiagram> diagrams = definitions.getBPMNDiagram();
				System.out.println(definitions.getTargetNamespace());
				
				for(BPMNDiagram diagram: diagrams){
					
					System.out.println("Id: " + diagram.getId());
					
				}
				
				
			}else{
				System.out.println(file.getAbsolutePath());					
			}
			
		} catch (JAXBException | FileNotFoundException | XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
