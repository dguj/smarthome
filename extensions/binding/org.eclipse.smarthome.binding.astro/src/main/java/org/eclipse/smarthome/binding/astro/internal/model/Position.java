/**
 * Copyright (c) 2014,2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.binding.astro.internal.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Holds the calculated azimuth and elevation.
 *
 * @author Gerhard Riegler - Initial contribution
 */
public class Position {
    private double azimuth;
    private double elevation;

    public Position() {
    }

    public Position(double azimuth, double elevation) {
        this.azimuth = azimuth;
        this.elevation = elevation;
    }

    /**
     * Returns the azimuth.
     */
    public double getAzimuth() {
        return azimuth;
    }

    /**
     * Sets the azimuth.
     */
    public void setAzimuth(double azimuth) {
        this.azimuth = azimuth;
    }

    /**
     * Returns the elevation.
     */
    public double getElevation() {
        return elevation;
    }

    /**
     * Sets the elevation.
     */
    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("azimuth", azimuth)
                .append("elevation", elevation).toString();
    }

}
