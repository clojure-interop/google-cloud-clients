(ns com.google.cloud.compute.v1.Region
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Region]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Region`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^com.google.cloud.compute.v1.Region prototype]
    (Region/newBuilder prototype))
  (^com.google.cloud.compute.v1.Region$Builder []
    (Region/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Region`"
  (^com.google.cloud.compute.v1.Region []
    (Region/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#region for regions.

  returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] Status of the region, either UP or DOWN.

  returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getStatus))))

(defn get-zones-list
  "[Output Only] A list of zones available in this region, in the form of resource URLs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Region this]
    (-> this (.getZonesList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Region this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Region this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getName))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this region.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^Region this]
    (-> this (.getDeprecated))))

(defn get-description
  "[Output Only] Textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getDescription))))

(defn get-quotas-list
  "[Output Only] Quotas assigned to this region.

  returns: `java.util.List<com.google.cloud.compute.v1.Quota>`"
  (^java.util.List [^Region this]
    (-> this (.getQuotasList))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Region this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Region this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Region this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region this]
    (-> this (.toBuilder))))

