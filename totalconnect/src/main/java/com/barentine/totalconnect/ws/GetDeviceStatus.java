
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
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceTypeandId" type="{https://services.alarmnet.com/TC2/}ArrayOfDeviceTypeAndID" minOccurs="0"/>
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
    "sessionId",
    "locationId",
    "deviceTypeandId"
})
@XmlRootElement(name = "GetDeviceStatus")
public class GetDeviceStatus {

    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "LocationId")
    protected long locationId;
    @XmlElement(name = "DeviceTypeandId")
    protected ArrayOfDeviceTypeAndID deviceTypeandId;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(long value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the deviceTypeandId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceTypeAndID }
     *     
     */
    public ArrayOfDeviceTypeAndID getDeviceTypeandId() {
        return deviceTypeandId;
    }

    /**
     * Sets the value of the deviceTypeandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceTypeAndID }
     *     
     */
    public void setDeviceTypeandId(ArrayOfDeviceTypeAndID value) {
        this.deviceTypeandId = value;
    }

}