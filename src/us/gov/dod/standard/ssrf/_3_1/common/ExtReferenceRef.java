/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.common;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.ExternalReference;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterNumberUN6;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * ExtReferenceRef refers to an external reference defined in a dataset
 * ExternalReference.
 * <p>
 * Element of {@link Common}
 * <p>
 * Example:
 * <pre>
 * &lt;ExtReferenceRef idx="1" cls="U"&gt;USA::EX:12&lt;/ExtReferenceRef&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtReferenceRef", propOrder = {
  "value"
})
public class ExtReferenceRef implements Comparable<ExtReferenceRef> {

  /**
   * The serial of an existing external reference (defined in an
   * {@link ExternalReference}).
   * <p>
   * <p>
   * External References SHALL NOT be linked to Data Items that are not
   * populated.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "EX".
   * <p>
   * Developer note: This value is an undecorated String instance and is not
   * programmatically validated.
   */
  @XmlValue
  @XmlTypeValidator(type = String.class, value = XmlAdapterSERIAL.class)
  private String value;
  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   */
  @XmlAttribute(name = "cls", required = true)
  private ListCCL cls;
  /**
   * idx - Index (Required)
   * <p>
   * A unique index for each External Reference used by this Dataset. Once an
   * idx is used it SHOULD NOT be modified during the lifetime of the Dataset;
   * e.g., an element with idx=2 will keep idx=2 even if the first occurrence
   * (idx=1) is deleted.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "idx", required = true)
  @XmlTypeValidator(type = String.class, value = XmlAdapterNumberUN6.class)
  private BigInteger idx;

  /**
   * ExtReferenceRef constructor. Automatically sets the {@link #idx} value.
   */
  public ExtReferenceRef() {
    this.idx = SSRFUtility.nextIndex();
  }

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link String} instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getExternalReference()} instead.
   */
  @Deprecated
  public String getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link String} instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setExternalReference(ExternalReference)} instead.
   */
  @Deprecated
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Get the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @return a {@link ListCCL} instance
   */
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value a {@link ListCCL} instance
   */
  public void setCls(ListCCL value) {
    this.cls = value;
  }

  /**
   * Determine if the Cls is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Get a unique index for each External Reference used by this Dataset. * Once
   * an idx is used it SHOULD NOT be modified during the lifetime of the
   * Dataset; e.g., an element with idx=2 will keep idx=2 even if the first
   * occurrence (idx=1) is deleted.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique index for each External Reference used by this Dataset. * Once
   * an idx is used it SHOULD NOT be modified during the lifetime of the
   * Dataset; e.g., an element with idx=2 will keep idx=2 even if the first
   * occurrence (idx=1) is deleted.
   * <p>
   * @param value a {@link BigInteger} instance
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  /**
   * Determine if the Idx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdx() {
    return (this.idx != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExtReferenceRef object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withExternalReference(ExternalReference)} instead.
   */
  @Deprecated
  public ExtReferenceRef withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current ExtReferenceRef object instance
   */
  public ExtReferenceRef withCls(ListCCL value) {
    setCls(value);
    return this;
  }

  /**
   * Set a unique index for each External Reference used by this Dataset. * Once
   * an idx is used it SHOULD NOT be modified during the lifetime of the
   * Dataset; e.g., an element with idx=2 will keep idx=2 even if the first
   * occurrence (idx=1) is deleted.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current ExtReferenceRef object instance
   */
  public ExtReferenceRef withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

  /**
   * Get a string representation of this ExtReferenceRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ExtReferenceRef {"
      + (idx != null ? " idx [" + idx + "]" : "")
      + (cls != null ? " cls [" + cls + "]" : "")
      + (value != null ? " value [" + value + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ExtReferenceRef} requires
   * {@link ListCCL cls}, {@link BigInteger idx} and {@link String value}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCls() && isSetIdx() && isSetValue();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:recommendedValue - Recommended Value (Optional)
   * <p>
   * A value that is most probably correct.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private ExternalReference externalReference;

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link ExternalReference} instance
   * @since 3.1.0
   */
  public ExternalReference getExternalReference() {
    return externalReference;
  }

  /**
   * Determine if the externalReference field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExternalReference() {
    return this.externalReference != null;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link ExternalReference}
   * @return The current ExtReferenceRef object instance
   * @since 3.1.0
   */
  public ExtReferenceRef withExternalReference(ExternalReference value) {
    this.externalReference = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this ExtReferenceRef record.
   * <p>
   * This method builds the exported {@link #value} field with values from the
   * transient {@link #externalReference} field. This method should typically be
   * called after the ExtReferenceRef is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @return The current ExtReferenceRef object instance
   */
  public ExtReferenceRef build() {
    this.value = externalReference != null ? externalReference.getSerial().getSerial() : null;
    return this;
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the index "idx" number.
   * <p>
   * @return an object hash code value
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 83 * hash + Objects.hashCode(this.idx);
    return hash;
  }

  /**
   * Equality is based upon the index "idx" number.
   * <p>
   * @param obj the other object
   * @return TRUE if the objects are the same class and have a matching index
   *         value
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.idx, ((ExtReferenceRef) obj).getIdx());
  }

  /**
   * Comparison and sorting are based upon the index "idx" number.
   * <p>
   * @param o the other object
   * @return the object order
   */
  @Override
  public int compareTo(ExtReferenceRef o) {
    return idx.compareTo(o.getIdx());
  }//</editor-fold>

}
