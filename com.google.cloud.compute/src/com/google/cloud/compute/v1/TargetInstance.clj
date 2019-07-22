(ns com.google.cloud.compute.v1.TargetInstance
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetInstance]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetInstance`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^com.google.cloud.compute.v1.TargetInstance prototype]
    (TargetInstance/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetInstance$Builder []
    (TargetInstance/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetInstance`"
  (^com.google.cloud.compute.v1.TargetInstance []
    (TargetInstance/getDefaultInstance )))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#targetInstance for target instances.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetInstance this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetInstance this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.getName))))

(defn get-instance
  "A URL to the virtual machine instance that handles traffic for this target instance. When
   creating a target instance, you can provide the fully-qualified URL or a valid partial URL to
   the desired virtual machine. For example, the following are all valid URLs: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance -
   projects/project/zones/zone/instances/instance - zones/zone/instances/instance

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.getInstance))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetInstance this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] URL of the zone where the target instance resides. You must specify this field as
   part of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetInstance this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetInstance this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-nat-policy
  "NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default
   value) is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance this]
    (-> this (.getNatPolicy))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance this]
    (-> this (.toBuilder))))

