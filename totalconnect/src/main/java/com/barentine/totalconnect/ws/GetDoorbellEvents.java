
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
 *         &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MaxRecords" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="EventTypeFilter" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ShowHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastEventIdReceived" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "deviceId",
    "maxRecords",
    "eventTypeFilter",
    "showHidden",
    "startDateTime",
    "endDateTime",
    "dateFormat",
    "timeFormat",
    "sortOrder",
    "lastEventIdReceived"
})
@XmlRootElement(name = "GetDoorbellEvents")
public class GetDoorbellEvents {

    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "LocationId")
    protected long locationId;
    @XmlElement(name = "DeviceId")
    protected long deviceId;
    @XmlElement(name = "MaxRecords")
    protected short maxRecords;
    @XmlElement(name = "EventTypeFilter")
    protected long eventTypeFilter;
    @XmlElement(name = "ShowHidden")
    protected boolean showHidden;
    @XmlElement(name = "StartDateTime")
    protected String startDateTime;
    @XmlElement(name = "EndDateTime")
    protected String endDateTime;
    @XmlElement(name = "DateFormat")
    protected short dateFormat;
    @XmlElement(name = "TimeFormat")
    protected short timeFormat;
    @XmlElement(name = "SortOrder")
    protected int sortOrder;
    @XmlElement(name = "LastEventIdReceived")
    protected long lastEventIdReceived;

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
     * Gets the value of the deviceId property.
     * 
     */
    public long getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     */
    public void setDeviceId(long value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     */
    public short getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     */
    public void setMaxRecords(short value) {
        this.maxRecords = value;
    }

    /**
     * Gets the value of the eventTypeFilter property.
     * 
     */
    public long getEventTypeFilter() {
        return eventTypeFilter;
    }

    /**
     * Sets the value of the eventTypeFilter property.
     * 
     */
    public void setEventTypeFilter(long value) {
        this.eventTypeFilter = value;
    }

    /**
     * Gets the value of the showHidden property.
     * 
     */
    public boolean isShowHidden() {
        return showHidden;
    }

    /**
     * Sets the value of the showHidden property.
     * 
     */
    public void setShowHidden(boolean value) {
        this.showHidden = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTime(String value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     */
    public short getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     */
    public void setDateFormat(short value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     */
    public short getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     */
    public void setTimeFormat(short value) {
        this.timeFormat = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     */
    public void setSortOrder(int value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the lastEventIdReceived property.
     * 
     */
    public long getLastEventIdReceived() {
        return lastEventIdReceived;
    }

    /**
     * Sets the value of the lastEventIdReceived property.
     * 
     */
    public void setLastEventIdReceived(long value) {
        this.lastEventIdReceived = value;
    }

}
