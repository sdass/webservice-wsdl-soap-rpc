
package com.subra.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Sun Aug 13 17:59:34 EDT 2017
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "multiplyResponse", namespace = "http://subra.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplyResponse", namespace = "http://subra.com/")

public class MultiplyResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

