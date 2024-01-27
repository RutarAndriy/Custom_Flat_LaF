package com.rutar.custom_flat_laf.themes;

import com.formdev.flatlaf.*;

// ............................................................................

public class Rutar_Light extends FlatLightLaf {

public static final String THEME_NAME = "Rutar_Light";

///////////////////////////////////////////////////////////////////////////////

@Override
public String getName() { return THEME_NAME; }

// ............................................................................

public static boolean setup() { return setup(new Rutar_Light()); }

// ............................................................................

public static void installLafInfo()
    { installLafInfo(THEME_NAME, Rutar_Light.class); }

///////////////////////////////////////////////////////////////////////////////

}
