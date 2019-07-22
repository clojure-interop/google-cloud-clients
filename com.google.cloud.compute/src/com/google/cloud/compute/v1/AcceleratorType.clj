(ns com.google.cloud.compute.v1.AcceleratorType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AcceleratorType]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AcceleratorType`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^com.google.cloud.compute.v1.AcceleratorType prototype]
    (AcceleratorType/newBuilder prototype))
  (^com.google.cloud.compute.v1.AcceleratorType$Builder []
    (AcceleratorType/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AcceleratorType`"
  (^com.google.cloud.compute.v1.AcceleratorType []
    (AcceleratorType/getDefaultInstance )))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#acceleratorType for accelerator types.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AcceleratorType this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AcceleratorType this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType this]
    (-> this (.getName))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this accelerator type.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^AcceleratorType this]
    (-> this (.getDeprecated))))

(defn get-description
  "[Output Only] An optional textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AcceleratorType this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined fully-qualified URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The name of the zone where the accelerator type resides, such as us-central1-a.
   You must specify this field as part of the HTTP request URL. It is not settable as a field in
   the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AcceleratorType this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AcceleratorType this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType this]
    (-> this (.toBuilder))))

(defn get-maximum-cards-per-instance
  "[Output Only] Maximum accelerator cards allowed per instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AcceleratorType this]
    (-> this (.getMaximumCardsPerInstance))))

