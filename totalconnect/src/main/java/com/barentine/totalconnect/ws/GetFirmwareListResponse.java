
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
 *         &lt;element name="GetFirmwareListResult" type="{https://services.alarmnet.com/TC2/}CameraFirmwareListResult" minOccurs="0"/>
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
    "getFirmwareListResult"
})
@XmlRootElement(name = "GetFirmwareListResponse")
public class GetFirmwareListResponse {

    @XmlElement(name = "GetFirmwareListResult")
    protected CameraFirmwareListResult getFirmwareListResult;

    /**
     * Gets the value of the getFirmwareListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CameraFirmwareListResult }
     *     
     */
    public CameraFirmwareListResult getGetFirmwareListResult() {
        return getFirmwareListResult;
    }

    /**
     * Sets the value of the getFirmwareListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraFirmwareListResult }
     *     
     */
    public void setGetFirmwareListResult(CameraFirmwareListResult value) {
        this.getFirmwareListResult = value;
    }

}