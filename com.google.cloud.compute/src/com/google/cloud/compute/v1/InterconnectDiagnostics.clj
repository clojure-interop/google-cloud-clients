(ns com.google.cloud.compute.v1.InterconnectDiagnostics
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnostics]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectDiagnostics`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnostics$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder [^com.google.cloud.compute.v1.InterconnectDiagnostics prototype]
    (InterconnectDiagnostics/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder []
    (InterconnectDiagnostics/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnostics`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics []
    (InterconnectDiagnostics/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectDiagnostics this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnostics this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectDiagnostics this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectDiagnostics this]
    (-> this (.getApiMessageRequestBody))))

(defn get-mac-address
  "The MAC address of the Interconnect's bundle interface.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnostics this]
    (-> this (.getMacAddress))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectDiagnostics this]
    (-> this (.hashCode))))

(defn get-arp-caches-list
  "A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently
   seen by the Google router in the ARP cache for the Interconnect. This will be empty when the
   Interconnect is not bundled.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry>`"
  (^java.util.List [^InterconnectDiagnostics this]
    (-> this (.getArpCachesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectDiagnostics this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-links-list
  "A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on
   the Interconnect.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus>`"
  (^java.util.List [^InterconnectDiagnostics this]
    (-> this (.getLinksList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnostics$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics$Builder [^InterconnectDiagnostics this]
    (-> this (.toBuilder))))

