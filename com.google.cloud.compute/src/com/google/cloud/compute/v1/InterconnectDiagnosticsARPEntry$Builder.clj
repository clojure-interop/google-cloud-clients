(ns com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnosticsARPEntry$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder [^InterconnectDiagnosticsARPEntry$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry other]
    (-> this (.mergeFrom other))))

(defn get-ip-address
  "The IP address of this ARP neighbor.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsARPEntry$Builder this]
    (-> this (.getIpAddress))))

(defn set-ip-address
  "The IP address of this ARP neighbor.

  ip-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder [^InterconnectDiagnosticsARPEntry$Builder this ^java.lang.String ip-address]
    (-> this (.setIpAddress ip-address))))

(defn get-mac-address
  "The MAC address of this ARP neighbor.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsARPEntry$Builder this]
    (-> this (.getMacAddress))))

(defn set-mac-address
  "The MAC address of this ARP neighbor.

  mac-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder [^InterconnectDiagnosticsARPEntry$Builder this ^java.lang.String mac-address]
    (-> this (.setMacAddress mac-address))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry [^InterconnectDiagnosticsARPEntry$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder [^InterconnectDiagnosticsARPEntry$Builder this]
    (-> this (.clone))))

