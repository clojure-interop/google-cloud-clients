(ns com.google.cloud.compute.v1.BackendBucket$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendBucket$Builder]))

(defn set-cdn-policy
  "Cloud CDN configuration for this BackendBucket.

  cdn-policy - `com.google.cloud.compute.v1.BackendBucketCdnPolicy`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^com.google.cloud.compute.v1.BackendBucketCdnPolicy cdn-policy]
    (-> this (.setCdnPolicy cdn-policy))))

(defn set-description
  "An optional textual description of the resource; provided by the client when the resource is
   created.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-bucket-name
  "Cloud Storage bucket name.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket$Builder this]
    (-> this (.getBucketName))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-bucket-name
  "Cloud Storage bucket name.

  bucket-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^java.lang.String bucket-name]
    (-> this (.setBucketName bucket-name))))

(defn get-kind
  "Type of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket$Builder this]
    (-> this (.getKind))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "Type of the resource.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-cdn-policy
  "Cloud CDN configuration for this BackendBucket.

  returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy [^BackendBucket$Builder this]
    (-> this (.getCdnPolicy))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.BackendBucket`"
  (^com.google.cloud.compute.v1.BackendBucket [^BackendBucket$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional textual description of the resource; provided by the client when the resource is
   created.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket$Builder this]
    (-> this (.getDescription))))

(defn get-enable-cdn?
  "If true, enable Cloud CDN for this BackendBucket.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BackendBucket$Builder this]
    (-> this (.getEnableCdn))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.BackendBucket`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^com.google.cloud.compute.v1.BackendBucket other]
    (-> this (.mergeFrom other))))

(defn set-enable-cdn
  "If true, enable Cloud CDN for this BackendBucket.

  enable-cdn - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this ^java.lang.Boolean enable-cdn]
    (-> this (.setEnableCdn enable-cdn))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.BackendBucket$Builder`"
  (^com.google.cloud.compute.v1.BackendBucket$Builder [^BackendBucket$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucket$Builder this]
    (-> this (.getCreationTimestamp))))

