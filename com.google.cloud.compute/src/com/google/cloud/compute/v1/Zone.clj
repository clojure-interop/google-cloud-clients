(ns com.google.cloud.compute.v1.Zone
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Zone]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Zone`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^com.google.cloud.compute.v1.Zone prototype]
    (Zone/newBuilder prototype))
  (^com.google.cloud.compute.v1.Zone$Builder []
    (Zone/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Zone`"
  (^com.google.cloud.compute.v1.Zone []
    (Zone/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#zone for zones.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] Status of the zone, either UP or DOWN.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getStatus))))

(defn get-available-cpu-platforms-list
  "[Output Only] Available cpu/platform selections for the zone.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Zone this]
    (-> this (.getAvailableCpuPlatformsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Zone this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Zone this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getName))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this zone.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^Zone this]
    (-> this (.getDeprecated))))

(defn get-description
  "[Output Only] Textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Zone this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Zone this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Zone this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "[Output Only] Full URL reference to the region which hosts the zone.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone this]
    (-> this (.toBuilder))))

