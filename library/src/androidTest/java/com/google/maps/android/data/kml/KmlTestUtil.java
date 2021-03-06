package com.google.maps.android.data.kml;

import androidx.annotation.IdRes;
import androidx.test.platform.app.InstrumentationRegistry;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * Shared utilities for KML tests
 */
public class KmlTestUtil {

    /**
     * Returns an XmlPullParser for the given KML file
     * @param res the resource ID for a KML file
     * @return an XmlPullParser for the given KML file
     * @throws XmlPullParserException, IOException
     */
    static XmlPullParser createParser(@IdRes int res) throws XmlPullParserException, IOException {
        InputStream stream =
                InstrumentationRegistry.getInstrumentation()
                        .getTargetContext()
                        .getResources()
                        .openRawResource(res);
        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);
        XmlPullParser parser = factory.newPullParser();
        parser.setInput(stream, null);
        return parser;
    }
}
