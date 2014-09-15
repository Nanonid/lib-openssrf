/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_0.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * Java class for EarthStation complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="EarthStation"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 * &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10"
 * minOccurs="0"/> &lt;element name="LocationRef"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 * &lt;/sequence> &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarthStation", propOrder = {
  "name",
  "type",
  "locationRef"
})
public class EarthStation {

  @XmlElement(name = "Name", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString name;
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString type;
  @XmlElement(name = "LocationRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString locationRef;

  /**
   * Gets the value of the name property.
   * <p>
   * @return 
   */
  public TString getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value 
   */
  public void setName(TString value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Gets the value of the type property.
   * <p>
   * @return 
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value 
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the locationRef property.
   * <p>
   * @return 
   */
  public TString getLocationRef() {
    return locationRef;
  }

  /**
   * Sets the value of the locationRef property.
   * <p>
   * @param value 
   */
  public void setLocationRef(TString value) {
    this.locationRef = value;
  }

  public boolean isSetLocationRef() {
    return (this.locationRef != null);
  }

  public EarthStation withName(String value) {
    setName(new TString(value));
    return this;
  }

  public EarthStation withType(String value) {
    setType(new TString(value));
    return this;
  }

  public EarthStation withLocationRef(String value) {
    setLocationRef(new TString(value));
    return this;
  }

}
