(ns com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnosticsLinkLACPStatus]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder [^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus prototype]
    (InterconnectDiagnosticsLinkLACPStatus/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder []
    (InterconnectDiagnosticsLinkLACPStatus/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus []
    (InterconnectDiagnosticsLinkLACPStatus/getDefaultInstance )))

(defn get-neighbor-system-id
  "System ID of the port on the neighbor?s side of the LACP exchange.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkLACPStatus this]
    (-> this (.getNeighborSystemId))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectDiagnosticsLinkLACPStatus this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkLACPStatus this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectDiagnosticsLinkLACPStatus this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-google-system-id
  "System ID of the port on Google?s side of the LACP exchange.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkLACPStatus this]
    (-> this (.getGoogleSystemId))))

(defn get-state
  "The state of a LACP link, which can take one of the following values: - ACTIVE: The link is
   configured and active within the bundle. - DETACHED: The link is not configured within the
   bundle. This means that the rest of the object should be empty.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkLACPStatus this]
    (-> this (.getState))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectDiagnosticsLinkLACPStatus this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectDiagnosticsLinkLACPStatus this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectDiagnosticsLinkLACPStatus this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkLACPStatus$Builder [^InterconnectDiagnosticsLinkLACPStatus this]
    (-> this (.toBuilder))))

