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
package org.eclipse.smarthome.binding.digitalstrom.internal.lib.structure.devices.deviceParameters;

/**
 * The {@link DeviceConstants} contains some constants for digitalSTROM devices.
 *
 * @author Alexander Betker - Initial contribution
 * @author Michael Ochel - updated constants
 * @author Matthias Siegele - updated constants
 */
public interface DeviceConstants {

    /** digitalSTROM dim step for lights (this value is not in percent!) */
    final static short DIM_STEP_LIGHT = 11;

    /** move step for roller shutters (this value is not in percent!) */
    final static short MOVE_STEP_ROLLERSHUTTER = 983;

    /** move step for slats angle by blind/jalousie (this value is not in percent!) */
    final static short ANGLE_STEP_SLAT = 11;

    /** default move step (this value is not in percent!) */
    final static short DEFAULT_MOVE_STEP = 11;

    /** default max output value */
    final static short DEFAULT_MAX_OUTPUTVALUE = 255;

    /** max output value if device (lamp - yellow) is on */
    final static short MAX_OUTPUT_VALUE_LIGHT = 255;

    /** is open (special case: awning/marquee - closed) */
    final static int MAX_ROLLERSHUTTER = 65535;

    /** is closed (special case: awning/marquee - open) */
    final static short MIN_ROLLERSHUTTER = 0;

    /** max slat angle by blind/jalousie */
    final static short MAX_SLAT_ANGLE = 255;

    /** min slat angle by blind/jalousie */
    final static short MIN_SLAT_ANGLE = 0;

    /** you can't dim deeper than this value */
    final static short MIN_DIM_VALUE = 16;

    /** this is the index to get the output value (min-, max value) of almost all devices */
    final static short DEVICE_SENSOR_OUTPUT = 0;

    /** this is the index to get the output value (min-, max value) of shade devices */
    final static short DEVICE_SENSOR_SLAT_POSITION_OUTPUT = 2;

    /** this index is needed to get the angle of the slats (if device is a blind/jalousie) */
    final static short DEVICE_SENSOR_SLAT_ANGLE_OUTPUT = 4;

}
