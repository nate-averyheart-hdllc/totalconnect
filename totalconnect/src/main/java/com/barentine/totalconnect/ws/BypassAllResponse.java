
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="BypassAllResult" type="{https://services.alarmnet.com/TC2/}ZoneBypassResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bypassAllResult"
})
@XmlRootElement(name = "BypassAllResponse")
public class BypassAllResponse {

    @XmlElement(name = "BypassAllResult")
    protected ZoneBypassResults bypassAllResult;

    /**
     * Gets the value of the bypassAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneBypassResults }
     *     
     */
    public ZoneBypassResults getBypassAllResult() {
        return bypassAllResult;
    }

    /**
     * Sets the value of the bypassAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneBypassResults }
     *     
     */
    public void setBypassAllResult(ZoneBypassResults value) {
        this.bypassAllResult = value;
    }

}
