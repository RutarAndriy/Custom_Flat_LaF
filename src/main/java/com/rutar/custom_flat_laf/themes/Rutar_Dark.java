package com.rutar.custom_flat_laf.themes;

import com.formdev.flatlaf.*;

// ............................................................................

public class Rutar_Dark extends FlatDarkLaf {

public static final String THEME_NAME = "Rutar_Dark";

///////////////////////////////////////////////////////////////////////////////

@Override
public String getName() { return THEME_NAME; }

// ............................................................................

public static boolean setup() { return setup(new Rutar_Dark()); }

// ............................................................................

public static void installLafInfo()
    { installLafInfo(THEME_NAME, Rutar_Dark.class); }

///////////////////////////////////////////////////////////////////////////////

}
