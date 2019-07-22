(ns com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnosticsLinkStatus]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus prototype]
    (InterconnectDiagnosticsLinkStatus/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder []
    (InterconnectDiagnosticsLinkStatus/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus []
    (InterconnectDiagnosticsLinkStatus/getDefaultInstance )))

(defn get-circuit-id
  "The unique ID for this link assigned during turn up by Google.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.getCircuitId))))

(defn get-receiving-optical-power
  "An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of
   the received light level.

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.getReceivingOpticalPower))))

(defn get-google-demarc
  "The Demarc address assigned by Google and provided in the LoA.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.getGoogleDemarc))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectDiagnosticsLinkStatus this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-transmitting-optical-power
  "An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of
   the transmitted light level.

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.getTransmittingOpticalPower))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.hashCode))))

(defn get-arp-caches-list
  "A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen on
   this link. This will be empty if the link is bundled

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry>`"
  (^java.util.List [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.getArpCachesList))))

(defn get-lacp-status
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.getLacpStatus))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectDiagnosticsLinkStatus this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus$Builder [^InterconnectDiagnosticsLinkStatus this]
    (-> this (.toBuilder))))

