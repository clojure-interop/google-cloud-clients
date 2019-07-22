(ns com.google.cloud.compute.v1.DeprecationStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DeprecationStatus]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.DeprecationStatus$Builder`"
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder [^com.google.cloud.compute.v1.DeprecationStatus prototype]
    (DeprecationStatus/newBuilder prototype))
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder []
    (DeprecationStatus/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus []
    (DeprecationStatus/getDefaultInstance )))

(defn get-replacement
  "The URL of the suggested replacement for a deprecated resource. The suggested replacement
   resource must be the same kind of resource as the deprecated resource.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.getReplacement))))

(defn get-obsolete
  "An optional RFC3339 timestamp on or after which the state of this resource is intended to
   change to OBSOLETE. This is only informational and the status will not change unless the client
   explicitly changes it.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.getObsolete))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DeprecationStatus this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DeprecationStatus this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-state
  "The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED.
   Operations which communicate the end of life date for an image, can use ACTIVE. Operations
   which create a new resource using a DEPRECATED resource will return successfully, but with a
   warning indicating the deprecated resource and recommending its replacement. Operations which
   use OBSOLETE or DELETED resources will be rejected and result in an error.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.getState))))

(defn get-deprecated
  "An optional RFC3339 timestamp on or after which the state of this resource is intended to
   change to DEPRECATED. This is only informational and the status will not change unless the
   client explicitly changes it.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.getDeprecated))))

(defn get-deleted
  "An optional RFC3339 timestamp on or after which the state of this resource is intended to
   change to DELETED. This is only informational and the status will not change unless the client
   explicitly changes it.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.getDeleted))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DeprecationStatus this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DeprecationStatus this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DeprecationStatus this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DeprecationStatus$Builder`"
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder [^DeprecationStatus this]
    (-> this (.toBuilder))))

