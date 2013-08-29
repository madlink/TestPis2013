//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.29 at 05:15:31 PM UYT 
//


package org.wfmc._2009.xpdl2;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerResultMessage" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerTimer" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ResultError" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerEscalation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerResultCompensation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerConditional" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerResultLink" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerResultCancel" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerResultSignal" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerIntermediateMultiple" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="Trigger" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Message"/>
 *             &lt;enumeration value="Timer"/>
 *             &lt;enumeration value="Error"/>
 *             &lt;enumeration value="Escalation"/>
 *             &lt;enumeration value="Cancel"/>
 *             &lt;enumeration value="Conditional"/>
 *             &lt;enumeration value="Link"/>
 *             &lt;enumeration value="Signal"/>
 *             &lt;enumeration value="Compensation"/>
 *             &lt;enumeration value="Multiple"/>
 *             &lt;enumeration value="ParallelMultiple"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Implementation" default="WebService">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="WebService"/>
 *             &lt;enumeration value="Other"/>
 *             &lt;enumeration value="Unspecified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Target" type="{http://www.wfmc.org/2009/XPDL2.2}Id" />
 *       &lt;attribute name="Interrupting" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
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
    "triggerResultMessage",
    "triggerTimer",
    "resultError",
    "triggerEscalation",
    "triggerResultCompensation",
    "triggerConditional",
    "triggerResultLink",
    "triggerResultCancel",
    "triggerResultSignal",
    "triggerIntermediateMultiple"
})
@XmlRootElement(name = "IntermediateEvent")
public class IntermediateEvent {

    @XmlElement(name = "TriggerResultMessage")
    protected TriggerResultMessage triggerResultMessage;
    @XmlElement(name = "TriggerTimer")
    protected TriggerTimer triggerTimer;
    @XmlElement(name = "ResultError")
    protected ResultError resultError;
    @XmlElement(name = "TriggerEscalation")
    protected TriggerEscalation triggerEscalation;
    @XmlElement(name = "TriggerResultCompensation")
    protected TriggerResultCompensation triggerResultCompensation;
    @XmlElement(name = "TriggerConditional")
    protected TriggerConditional triggerConditional;
    @XmlElement(name = "TriggerResultLink")
    protected TriggerResultLink triggerResultLink;
    @XmlElement(name = "TriggerResultCancel")
    protected java.lang.Object triggerResultCancel;
    @XmlElement(name = "TriggerResultSignal")
    protected TriggerResultSignal triggerResultSignal;
    @XmlElement(name = "TriggerIntermediateMultiple")
    protected TriggerIntermediateMultiple triggerIntermediateMultiple;
    @XmlAttribute(name = "Trigger", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trigger;
    @XmlAttribute(name = "Implementation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String implementation;
    @XmlAttribute(name = "Target")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Interrupting")
    protected Boolean interrupting;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the triggerResultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerResultMessage }
     *     
     */
    public TriggerResultMessage getTriggerResultMessage() {
        return triggerResultMessage;
    }

    /**
     * Sets the value of the triggerResultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerResultMessage }
     *     
     */
    public void setTriggerResultMessage(TriggerResultMessage value) {
        this.triggerResultMessage = value;
    }

    /**
     * Gets the value of the triggerTimer property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTimer }
     *     
     */
    public TriggerTimer getTriggerTimer() {
        return triggerTimer;
    }

    /**
     * Sets the value of the triggerTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTimer }
     *     
     */
    public void setTriggerTimer(TriggerTimer value) {
        this.triggerTimer = value;
    }

    /**
     * Gets the value of the resultError property.
     * 
     * @return
     *     possible object is
     *     {@link ResultError }
     *     
     */
    public ResultError getResultError() {
        return resultError;
    }

    /**
     * Sets the value of the resultError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultError }
     *     
     */
    public void setResultError(ResultError value) {
        this.resultError = value;
    }

    /**
     * Gets the value of the triggerEscalation property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerEscalation }
     *     
     */
    public TriggerEscalation getTriggerEscalation() {
        return triggerEscalation;
    }

    /**
     * Sets the value of the triggerEscalation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerEscalation }
     *     
     */
    public void setTriggerEscalation(TriggerEscalation value) {
        this.triggerEscalation = value;
    }

    /**
     * BPMN: Must be present if if Trigger or ResultType is Compensation.[This event can be attached or throwing.  Thus name of element should be TriggerResultCompensation.]
     * 
     * @return
     *     possible object is
     *     {@link TriggerResultCompensation }
     *     
     */
    public TriggerResultCompensation getTriggerResultCompensation() {
        return triggerResultCompensation;
    }

    /**
     * Sets the value of the triggerResultCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerResultCompensation }
     *     
     */
    public void setTriggerResultCompensation(TriggerResultCompensation value) {
        this.triggerResultCompensation = value;
    }

    /**
     * Gets the value of the triggerConditional property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditional }
     *     
     */
    public TriggerConditional getTriggerConditional() {
        return triggerConditional;
    }

    /**
     * Sets the value of the triggerConditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditional }
     *     
     */
    public void setTriggerConditional(TriggerConditional value) {
        this.triggerConditional = value;
    }

    /**
     * BPMN: Link event connects source and target nodes of the same process or subprocess.  Equivalent to a sequence flow between source and target nodes.
     * 
     * @return
     *     possible object is
     *     {@link TriggerResultLink }
     *     
     */
    public TriggerResultLink getTriggerResultLink() {
        return triggerResultLink;
    }

    /**
     * Sets the value of the triggerResultLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerResultLink }
     *     
     */
    public void setTriggerResultLink(TriggerResultLink value) {
        this.triggerResultLink = value;
    }

    /**
     * Gets the value of the triggerResultCancel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getTriggerResultCancel() {
        return triggerResultCancel;
    }

    /**
     * Sets the value of the triggerResultCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setTriggerResultCancel(java.lang.Object value) {
        this.triggerResultCancel = value;
    }

    /**
     * Gets the value of the triggerResultSignal property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerResultSignal }
     *     
     */
    public TriggerResultSignal getTriggerResultSignal() {
        return triggerResultSignal;
    }

    /**
     * Sets the value of the triggerResultSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerResultSignal }
     *     
     */
    public void setTriggerResultSignal(TriggerResultSignal value) {
        this.triggerResultSignal = value;
    }

    /**
     * BPMN: if the TriggerType is Multiple then this must be present. Only valid for attached event. [EventDetail elements are incorrect.  They should be message, timer, error, conditional, signal, cancel.]
     * 
     * @return
     *     possible object is
     *     {@link TriggerIntermediateMultiple }
     *     
     */
    public TriggerIntermediateMultiple getTriggerIntermediateMultiple() {
        return triggerIntermediateMultiple;
    }

    /**
     * Sets the value of the triggerIntermediateMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerIntermediateMultiple }
     *     
     */
    public void setTriggerIntermediateMultiple(TriggerIntermediateMultiple value) {
        this.triggerIntermediateMultiple = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the implementation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementation() {
        if (implementation == null) {
            return "WebService";
        } else {
            return implementation;
        }
    }

    /**
     * Sets the value of the implementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementation(String value) {
        this.implementation = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the interrupting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInterrupting() {
        if (interrupting == null) {
            return true;
        } else {
            return interrupting;
        }
    }

    /**
     * Sets the value of the interrupting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterrupting(Boolean value) {
        this.interrupting = value;
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
