(ns com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnosticsLinkStatus$Builder]))

(defn get-circuit-id
  "The unique ID for this link assigned during turn up by Google.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkStatus$Builder this]
    (-> this (.getCircuitId))))

(defn get-receiving-optical-power
  "An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status
   of the received light level.

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower [^InterconnectDiagnosticsLinkStatus$Builder this]
    (-> this (.getReceivingOpticalPower))))

(defn get-google-demarc
  "The Demarc address assigned by Google and provided in the LoA.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkStatus$Builder this]
    (-> this (.getGoogleDemarc))))

(defn set-google-demarc
  "The Demarc address assigned by Google and provided in the LoA.

  google-demarc - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus$Builder this ^java.lang.String google-demarc]
    (-> this (.setGoogleDemarc google-demarc))))

(defn add-all-arp-caches
  "A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen
   on this link. This will be empty if the link is bundled

  arp-caches - `java.util.List`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus$Builder this ^java.util.List arp-caches]
    (-> this (.addAllArpCaches arp-caches))))

(defn get-transmitting-optical-power
  "An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status
   of the transmitted light level.

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower [^InterconnectDiagnosticsLinkStatus$Builder this]
    (-> this (.getTransmittingOpticalPower))))

(defn set-receiving-optical-power
  "An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status
   of the received light level.

  receiving-optical-power - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower receiving-optical-power]
    (-> this (.setReceivingOpticalPower receiving-optical-power))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus [^InterconnectDiagnosticsLinkStatus$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus$Builder this]
    (-> this (.clone))))

(defn get-arp-caches-list
  "A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen
   on this link. This will be empty if the link is bundled

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry>`"
  (^java.util.List [^InterconnectDiagnosticsLinkStatus$Builder this]
    (-> this (.getArpCachesList))))

(defn add-arp-caches
  "A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen
   on this link. This will be empty if the link is bundled

  arp-caches - `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry arp-caches]
    (-> this (.addArpCaches arp-caches))))

(defn get-lacp-status
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus [^InterconnectDiagnosticsLinkStatus$Builder this]
    (-> this (.getLacpStatus))))

(defn set-transmitting-optical-power
  "An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status
   of the transmitted light level.

  transmitting-optical-power - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower transmitting-optical-power]
    (-> this (.setTransmittingOpticalPower transmitting-optical-power))))

(defn set-lacp-status
  "lacp-status - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus lacp-status]
    (-> this (.setLacpStatus lacp-status))))

(defn set-circuit-id
  "The unique ID for this link assigned during turn up by Google.

  circuit-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus$Builder this ^java.lang.String circuit-id]
    (-> this (.setCircuitId circuit-id))))

