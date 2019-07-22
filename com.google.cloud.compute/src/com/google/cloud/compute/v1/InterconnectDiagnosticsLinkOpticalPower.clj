(ns com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnosticsLinkOpticalPower]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder [^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower prototype]
    (InterconnectDiagnosticsLinkOpticalPower/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder []
    (InterconnectDiagnosticsLinkOpticalPower/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower []
    (InterconnectDiagnosticsLinkOpticalPower/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectDiagnosticsLinkOpticalPower this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkOpticalPower this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectDiagnosticsLinkOpticalPower this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-value
  "Value of the current receiving or transmitting optical power, read in dBm. Take a known good
   optical value, give it a 10% margin and trigger warnings relative to that value. In general, a
   -7dBm warning and a -11dBm alarm are good optical value estimates for most links.

  returns: `java.lang.Float`"
  (^java.lang.Float [^InterconnectDiagnosticsLinkOpticalPower this]
    (-> this (.getValue))))

(defn get-state
  "The status of the current value when compared to the warning and alarm levels for the receiving
   or transmitting transceiver. Possible states include: - OK: The value has not crossed a warning
   threshold. - LOW_WARNING: The value has crossed below the low warning threshold. -
   HIGH_WARNING: The value has crossed above the high warning threshold. - LOW_ALARM: The value
   has crossed below the low alarm threshold. - HIGH_ALARM: The value has crossed above the high
   alarm threshold.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkOpticalPower this]
    (-> this (.getState))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectDiagnosticsLinkOpticalPower this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectDiagnosticsLinkOpticalPower this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectDiagnosticsLinkOpticalPower this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder [^InterconnectDiagnosticsLinkOpticalPower this]
    (-> this (.toBuilder))))

