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
package us.gov.dod.standard.ssrf._3_1.channelplan;

import java.math.BigDecimal;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterUN16_9;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * ChannelFreq contains one frequency in the channel plan.
 * <p>
 * Element of {@link Channel}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelFreq", propOrder = {
  "value"
})
public class ChannelFreq extends AMetadata<ChannelFreq> {

  /**
   * A frequency in the channel plan.
   * <p>
   * Format is UN(16,9) [0..1.0E9](MHz)
   */
  @XmlValue
  @XmlJavaTypeAdapter(type = String.class, value = XmlAdapterUN16_9.class)
  private BigDecimal value;

  /**
   * Get the frequency in the channel plan. (MHz)
   * <p>
   * @return a {@link BigDecimal} instance
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Set the frequency in the channel plan. (MHz)
   * <p>
   * @param value a {@link BigDecimal} instance
   */
  public void setValue(BigDecimal value) {
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
   * Set the frequency in the channel plan. (MHz)
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current ChannelFreq object instance
   */
  public ChannelFreq withValue(BigDecimal value) {
    setValue(value);
    return this;
  }

  /**
   * Get the string representation of this ChannelFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ChannelFreq {"
      + " extReferences [" + extReferences + "]"
      + " cls [" + cls + "]"
      + " recommendedValue [" + recommendedValue + "]"
      + " quality [" + quality + "]"
      + " legacyReleasability [" + legacyReleasability + "]"
      + " value [" + value + "]"
      + " remarks [" + remarkRef + "]"
      + " idref [" + idref + "]"
      + " availability [" + availability + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ChannelFreq} requires {@link ListCCL cls} and
   * {@link BigDecimal value}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

}