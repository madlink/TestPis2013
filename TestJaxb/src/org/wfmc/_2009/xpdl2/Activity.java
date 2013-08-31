//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.31 at 05:20:55 PM UYT 
//


package org.wfmc._2009.xpdl2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;
import org.wfmc._2002.xpdl1.FinishMode;
import org.wfmc._2002.xpdl1.StartMode;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Limit" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Route"/>
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Implementation"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}BlockActivity"/>
 *             &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}BlockActivity"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Event"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Transaction" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Performers" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Performer" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}StartMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}FinishMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Priority" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Deadline" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Deadline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}SimulationInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Icon" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Documentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TransitionRestrictions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ExtendedAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}FormalParameters" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ActualParameters" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}InputSets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}OutputSets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}IORules" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Loop" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Assignments" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Object" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}NodeGraphicsInfos" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *             &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.wfmc.org/2009/XPDL2.2}Id" />
 *       &lt;attribute name="IsForCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StartActivity" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Status" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Ready"/>
 *             &lt;enumeration value="Active"/>
 *             &lt;enumeration value="Cancelled"/>
 *             &lt;enumeration value="Aborting"/>
 *             &lt;enumeration value="Aborted"/>
 *             &lt;enumeration value="Completing"/>
 *             &lt;enumeration value="Completed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="StartMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Automatic"/>
 *             &lt;enumeration value="Manual"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FinishMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Automatic"/>
 *             &lt;enumeration value="Manual"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="StartQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="CompletionQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="IsATransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElementRefs({
        @XmlElementRef(name = "Limit", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Limit.class, required = false),
        @XmlElementRef(name = "TransitionRestrictions", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = TransitionRestrictions.class, required = false),
        @XmlElementRef(name = "Assignments", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Assignments.class, required = false),
        @XmlElementRef(name = "ExtendedAttributes", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = ExtendedAttributes.class, required = false),
        @XmlElementRef(name = "Object", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.Object.class, required = false),
        @XmlElementRef(name = "Deadline", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.Deadline.class, required = false),
        @XmlElementRef(name = "ActualParameters", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = ActualParameters.class, required = false),
        @XmlElementRef(name = "OutputSets", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = OutputSets.class, required = false),
        @XmlElementRef(name = "Performer", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Performer.class, required = false),
        @XmlElementRef(name = "Loop", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Loop.class, required = false),
        @XmlElementRef(name = "BlockActivity", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = org.wfmc._2002.xpdl1.BlockActivity.class, required = false),
        @XmlElementRef(name = "Transaction", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Transaction.class, required = false),
        @XmlElementRef(name = "Priority", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Priority.class, required = false),
        @XmlElementRef(name = "Description", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Description.class, required = false),
        @XmlElementRef(name = "StartMode", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = StartMode.class, required = false),
        @XmlElementRef(name = "NodeGraphicsInfos", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = NodeGraphicsInfos.class, required = false),
        @XmlElementRef(name = "Deadline", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = org.wfmc._2002.xpdl1.Deadline.class, required = false),
        @XmlElementRef(name = "FinishMode", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = FinishMode.class, required = false),
        @XmlElementRef(name = "Route", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Route.class, required = false),
        @XmlElementRef(name = "Event", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Event.class, required = false),
        @XmlElementRef(name = "Extensions", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BlockActivity", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.BlockActivity.class, required = false),
        @XmlElementRef(name = "IORules", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = IORules.class, required = false),
        @XmlElementRef(name = "FormalParameters", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = FormalParameters.class, required = false),
        @XmlElementRef(name = "DataFields", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = DataFields.class, required = false),
        @XmlElementRef(name = "Icon", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Icon.class, required = false),
        @XmlElementRef(name = "Performers", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Performers.class, required = false),
        @XmlElementRef(name = "Documentation", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Documentation.class, required = false),
        @XmlElementRef(name = "SimulationInformation", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = SimulationInformation.class, required = false),
        @XmlElementRef(name = "Implementation", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Implementation.class, required = false),
        @XmlElementRef(name = "InputSets", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = InputSets.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "IsForCompensation")
    protected Boolean isForCompensation;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "StartActivity")
    protected Boolean startActivity;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "StartMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startMode;
    @XmlAttribute(name = "FinishMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String finishMode;
    @XmlAttribute(name = "StartQuantity")
    protected BigInteger startQuantity;
    @XmlAttribute(name = "CompletionQuantity")
    protected BigInteger completionQuantity;
    @XmlAttribute(name = "IsATransaction")
    protected Boolean isATransaction;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "BlockActivity" is used by two different parts of a schema. See: 
     * line 38 of file:/home/pis2013/TestPis2013/TestJaxb/xsd/bpmnxpdl_40a.xsd
     * line 37 of file:/home/pis2013/TestPis2013/TestJaxb/xsd/bpmnxpdl_40a.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Limit }
     * {@link TransitionRestrictions }
     * {@link Assignments }
     * {@link ExtendedAttributes }
     * {@link org.wfmc._2009.xpdl2.Object }
     * {@link org.wfmc._2009.xpdl2.Deadline }
     * {@link ActualParameters }
     * {@link OutputSets }
     * {@link Performer }
     * {@link Loop }
     * {@link org.wfmc._2002.xpdl1.BlockActivity }
     * {@link Transaction }
     * {@link Priority }
     * {@link Description }
     * {@link StartMode }
     * {@link NodeGraphicsInfos }
     * {@link org.wfmc._2002.xpdl1.Deadline }
     * {@link FinishMode }
     * {@link Route }
     * {@link java.lang.Object }
     * {@link Event }
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link org.wfmc._2009.xpdl2.BlockActivity }
     * {@link IORules }
     * {@link FormalParameters }
     * {@link DataFields }
     * {@link Icon }
     * {@link Performers }
     * {@link Documentation }
     * {@link SimulationInformation }
     * {@link Implementation }
     * {@link InputSets }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isForCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsForCompensation() {
        if (isForCompensation == null) {
            return false;
        } else {
            return isForCompensation;
        }
    }

    /**
     * Sets the value of the isForCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForCompensation(Boolean value) {
        this.isForCompensation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the startActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartActivity() {
        return startActivity;
    }

    /**
     * Sets the value of the startActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartActivity(Boolean value) {
        this.startActivity = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "None";
        } else {
            return status;
        }
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the startMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMode() {
        return startMode;
    }

    /**
     * Sets the value of the startMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMode(String value) {
        this.startMode = value;
    }

    /**
     * Gets the value of the finishMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishMode() {
        return finishMode;
    }

    /**
     * Sets the value of the finishMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishMode(String value) {
        this.finishMode = value;
    }

    /**
     * Gets the value of the startQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartQuantity() {
        if (startQuantity == null) {
            return new BigInteger("1");
        } else {
            return startQuantity;
        }
    }

    /**
     * Sets the value of the startQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartQuantity(BigInteger value) {
        this.startQuantity = value;
    }

    /**
     * Gets the value of the completionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompletionQuantity() {
        if (completionQuantity == null) {
            return new BigInteger("1");
        } else {
            return completionQuantity;
        }
    }

    /**
     * Sets the value of the completionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompletionQuantity(BigInteger value) {
        this.completionQuantity = value;
    }

    /**
     * Gets the value of the isATransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsATransaction() {
        if (isATransaction == null) {
            return false;
        } else {
            return isATransaction;
        }
    }

    /**
     * Sets the value of the isATransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsATransaction(Boolean value) {
        this.isATransaction = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
