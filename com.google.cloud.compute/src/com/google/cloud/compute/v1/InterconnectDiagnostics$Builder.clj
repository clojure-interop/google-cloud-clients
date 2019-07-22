(ns com.google.cloud.compute.v1.InterconnectDiagnostics$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnostics$Builder]))

(defn set-mac-address
  "The MAC address of the Interconnect's bundle interface.

  mac-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnostics$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder [^InterconnectDiagnostics$Builder this ^java.lang.String mac-address]
    (-> this (.setMacAddress mac-address))))

(defn add-all-arp-caches
  "A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently
   seen by the Google router in the ARP cache for the Interconnect. This will be empty when the
   Interconnect is not bundled.

  arp-caches - `java.util.List`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnostics$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder [^InterconnectDiagnostics$Builder this ^java.util.List arp-caches]
    (-> this (.addAllArpCaches arp-caches))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnostics`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics [^InterconnectDiagnostics$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectDiagnostics`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnostics$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder [^InterconnectDiagnostics$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnostics other]
    (-> this (.mergeFrom other))))

(defn get-mac-address
  "The MAC address of the Interconnect's bundle interface.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnostics$Builder this]
    (-> this (.getMacAddress))))

(defn add-all-links
  "A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on
   the Interconnect.

  links - `java.util.List`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnostics$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder [^InterconnectDiagnostics$Builder this ^java.util.List links]
    (-> this (.addAllLinks links))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnostics$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder [^InterconnectDiagnostics$Builder this]
    (-> this (.clone))))

(defn get-arp-caches-list
  "A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently
   seen by the Google router in the ARP cache for the Interconnect. This will be empty when the
   Interconnect is not bundled.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry>`"
  (^java.util.List [^InterconnectDiagnostics$Builder this]
    (-> this (.getArpCachesList))))

(defn add-arp-caches
  "A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently
   seen by the Google router in the ARP cache for the Interconnect. This will be empty when the
   Interconnect is not bundled.

  arp-caches - `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnostics$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder [^InterconnectDiagnostics$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry arp-caches]
    (-> this (.addArpCaches arp-caches))))

(defn add-links
  "A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on
   the Interconnect.

  links - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnostics$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder [^InterconnectDiagnostics$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus links]
    (-> this (.addLinks links))))

(defn get-links-list
  "A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on
   the Interconnect.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus>`"
  (^java.util.List [^InterconnectDiagnostics$Builder this]
    (-> this (.getLinksList))))

