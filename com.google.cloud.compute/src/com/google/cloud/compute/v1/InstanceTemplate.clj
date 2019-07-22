(ns com.google.cloud.compute.v1.InstanceTemplate
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceTemplate]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceTemplate`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^com.google.cloud.compute.v1.InstanceTemplate prototype]
    (InstanceTemplate/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder []
    (InstanceTemplate/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceTemplate`"
  (^com.google.cloud.compute.v1.InstanceTemplate []
    (InstanceTemplate/getDefaultInstance )))

(defn get-kind
  "[Output Only] The resource type, which is always compute#instanceTemplate for instance
   templates.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceTemplate this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceTemplate this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate this]
    (-> this (.getName))))

(defn get-properties
  "The instance properties for this instance template.

  returns: `com.google.cloud.compute.v1.InstanceProperties`"
  (^com.google.cloud.compute.v1.InstanceProperties [^InstanceTemplate this]
    (-> this (.getProperties))))

(defn get-source-instance-params
  "The source instance params to use to create this instance template.

  returns: `com.google.cloud.compute.v1.SourceInstanceParams`"
  (^com.google.cloud.compute.v1.SourceInstanceParams [^InstanceTemplate this]
    (-> this (.getSourceInstanceParams))))

(defn get-source-instance
  "The source instance used to create the template. You can provide this as a partial or full URL
   to the resource. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance -
   projects/project/zones/zone/instances/instance

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate this]
    (-> this (.getSourceInstance))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] A unique identifier for this instance template. The server defines this
   identifier.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceTemplate this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] The URL for this instance template. The server defines this URL.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceTemplate this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] The creation timestamp for this instance template in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceTemplate this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate this]
    (-> this (.toBuilder))))

