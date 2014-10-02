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
package us.gov.dod.standard.ssrf._3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Message describes the receipt and disposition of a group of Datasets in a
 * single transmittal. The receiving system SHOULD verify the correct datasets
 * were received. If a dataset fails validation, a separate Administrative
 * dataset SHOULD be returned to the sender informing them of the error.
 * <p>
 * Sub-Element is {@link DatasetRefs}
 * <p>
 * Example:
 * <pre>
 * &lt;Message cls="U"&gt;
 *   &lt;Serial cls="U"&gt;TUR::MS:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;Results of Your 2012-01-05 Data Request&lt;/Name&gt;
 *   &lt;SecondaryDatasets cls="U"&gt;No&lt;/SecondaryDatasets&gt;
 *   &lt;DatasetRef cls="U"&gt;POL::AN:456&lt;DatasetRef&gt;
 *     &lt;DatasetRef cls="U"&gt;DEU::AL:456&lt;DatasetRef&gt;
 *       &lt;DatasetRef cls="U"&gt;NED::TX:456&lt;DatasetRef&gt;
 *         &lt;DatasetRef cls="U"&gt;USA::RX:456&lt;DatasetRef&gt;
 *         &lt;/Message&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
  "name",
  "secondaryDatasets",
  "datasetRef"
})
public class Message extends Common<Message> {

  /**
   * Name - Message Name (Optional)
   * <p>
   * A human-readable name for the message.
   * <p>
   * Format is S40
   */
  @XmlElement(name = "Name", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString name;
  /**
   * In Data Item SecondaryDatasets, indicate if datasets referenced by the
   * primary dataset are included.
   */
  @XmlElement(name = "SecondaryDatasets", required = false)
  private TString secondaryDatasets;
  /**
   * DatasetRefs (Required)
   * <p>
   * DatasetRefs lists the serial for each primary Dataset included in a single
   * Message.
   */
  @XmlElement(name = "DatasetRef", required = true, nillable = true)
  private List<DatasetRef> datasetRef;

  /**
   * Get a human-readable name for the message.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set a human-readable name for the message.
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get In Data Item SecondaryDatasets, indicate if datasets referenced by the
   * primary dataset are included.
   * <p>
   * @return the SecondaryDatasets value in a {@link TString} data type
   */
  public TString getSecondaryDatasets() {
    return secondaryDatasets;
  }

  /**
   * Set In Data Item SecondaryDatasets, indicate if datasets referenced by the
   * primary dataset are included.
   * <p>
   * @param value the SecondaryDatasets value in a {@link TString} data type
   */
  public void setSecondaryDatasets(TString value) {
    this.secondaryDatasets = value;
  }

  /**
   * Determine if the SecondaryDatasets is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSecondaryDatasets() {
    return (this.secondaryDatasets != null ? this.secondaryDatasets.isSetValue() : false);
  }

  /**
   * Get the DatasetRefs
   * <p>
   * Complex element DatasetRefs lists the serial for each primary Dataset
   * included in a single Message.
   * <p>
   * @return a {@link List<DatasetRef>} instance
   */
  public List<DatasetRef> getDatasetRef() {
    if (datasetRef == null) {
      datasetRef = new ArrayList<>();
    }
    return this.datasetRef;
  }

  /**
   * Determine if the DatasetRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDatasetRef() {
    return ((this.datasetRef != null) && (!this.datasetRef.isEmpty()));
  }

  /**
   * Clear the DatasetRef field. This sets the field to null.
   */
  public void unsetDatasetRef() {
    this.datasetRef = null;
  }

  /**
   * Set a human-readable name for the message.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Message object instance
   */
  public Message withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set In Data Item SecondaryDatasets, indicate if datasets referenced by the
   * primary dataset are included.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Message object instance
   */
  public Message withSecondaryDatasets(ListCBO value) {
    setSecondaryDatasets(new TString(value.value()));
    return this;
  }

  /**
   * Set the DatasetRefs
   * <p>
   * Complex element DatasetRefs lists the serial for each primary Dataset
   * included in a single Message.
   * <p>
   * @param values One or more instances of type {@link DatasetRef...}
   * @return The current Message object instance
   */
  public Message withDatasetRef(DatasetRef... values) {
    if (values != null) {
      getDatasetRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the DatasetRefs
   * <p>
   * Complex element DatasetRefs lists the serial for each primary Dataset
   * included in a single Message.
   * <p>
   * @param values A collection of {@link DatasetRef} instances
   * @return The current Message object instance
   */
  public Message withDatasetRef(Collection<DatasetRef> values) {
    if (values != null) {
      getDatasetRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Message instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Message {"
      + " name [" + name + "]"
      + " secondaryDatasets [" + secondaryDatasets + "]"
      + " datasetRef [" + datasetRef + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Message} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}