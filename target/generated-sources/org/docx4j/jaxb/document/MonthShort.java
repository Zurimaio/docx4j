//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.19 at 02:20:48 PM GMT+10:00 
//


package org.docx4j.jaxb.document;

import javax.annotation.Generated;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.jvnet.jaxb2_commons.ppp.Child;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "monthShort")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2007-12-19T02:20:48+10:00", comments = "JAXB RI v2.1.5-b01-fcs")
public class MonthShort
    implements Locatable, Child
{

    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2007-12-19T02:20:48+10:00", comments = "JAXB RI v2.1.5-b01-fcs")
    private Object parent;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2007-12-19T02:20:48+10:00", comments = "JAXB RI v2.1.5-b01-fcs")
    protected Locator locator;

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2007-12-19T02:20:48+10:00", comments = "JAXB RI v2.1.5-b01-fcs")
    public Object getParent() {
        return this.parent;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2007-12-19T02:20:48+10:00", comments = "JAXB RI v2.1.5-b01-fcs")
    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2007-12-19T02:20:48+10:00", comments = "JAXB RI v2.1.5-b01-fcs")
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2007-12-19T02:20:48+10:00", comments = "JAXB RI v2.1.5-b01-fcs")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2007-12-19T02:20:48+10:00", comments = "JAXB RI v2.1.5-b01-fcs")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
