package org.omg.IOP;


/**
* org/omg/IOP/TAG_RMI_CUSTOM_MAX_STREAM_FORMAT.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ojdkbuild/lookaside/java-1.8.0-openjdk/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, April 23, 2019 6:09:19 AM PDT
*/

public interface TAG_RMI_CUSTOM_MAX_STREAM_FORMAT
{

  /**
     * RMI-IIOP has multiple stream format versions.  A server
     * can specify its maximum version by including the
     * TAG_RMI_CUSTOM_MAX_STREAM_FORMAT tagged component or
     * rely on the default of version 1 for GIOP 1.2 and less
     * and version 2 for GIOP 1.3 and higher.
     *
     * See Java to IDL ptc/02-01-12 1.4.11.
     */
  public static final int value = (int)(38L);
}
