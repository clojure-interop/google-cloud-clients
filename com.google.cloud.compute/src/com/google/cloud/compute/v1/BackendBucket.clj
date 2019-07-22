(ns com.google.cloud.compute.v1.BackendBucket
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendBucket]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendBucket`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^com.google.cloud.compute.v1.BackendBucket prototype]
    (BackendBucket/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendBucket$Builder []
    (BackendBucket/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendBucket`"
  (^com.google.cloud.compute.v1.BackendBucket []
    (BackendBucket/getDefaultInstance )))

(defn get-bucket-name
  "Cloud Storage bucket name.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket this]
    (-> this (.getBucketName))))

(defn get-kind
  "Type of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendBucket this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket this]
    (-> this (.toString))))

(defn get-cdn-policy
  "Cloud CDN configuration for this BackendBucket.

  returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy [^BackendBucket this]
    (-> this (.getCdnPolicy))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendBucket this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket this]
    (-> this (.getName))))

(defn get-description
  "An optional textual description of the resource; provided by the client when the resource is
   created.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket this]
    (-> this (.getDescription))))

(defn get-enable-cdn?
  "If true, enable Cloud CDN for this BackendBucket.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BackendBucket this]
    (-> this (.getEnableCdn))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendBucket this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendBucket this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendBucket this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket this]
    (-> this (.toBuilder))))

