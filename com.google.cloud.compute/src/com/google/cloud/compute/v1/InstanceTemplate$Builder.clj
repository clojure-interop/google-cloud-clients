(ns com.google.cloud.compute.v1.InstanceTemplate$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceTemplate$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] The creation timestamp for this instance template in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-source-instance-params
  "The source instance params to use to create this instance template.

  source-instance-params - `com.google.cloud.compute.v1.SourceInstanceParams`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^com.google.cloud.compute.v1.SourceInstanceParams source-instance-params]
    (-> this (.setSourceInstanceParams source-instance-params))))

(defn get-kind
  "[Output Only] The resource type, which is always compute#instanceTemplate for instance
   templates.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate$Builder this]
    (-> this (.getKind))))

(defn set-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] The resource type, which is always compute#instanceTemplate for instance
   templates.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] A unique identifier for this instance template. The server defines this
   identifier.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-properties
  "The instance properties for this instance template.

  returns: `com.google.cloud.compute.v1.InstanceProperties`"
  (^com.google.cloud.compute.v1.InstanceProperties [^InstanceTemplate$Builder this]
    (-> this (.getProperties))))

(defn get-source-instance-params
  "The source instance params to use to create this instance template.

  returns: `com.google.cloud.compute.v1.SourceInstanceParams`"
  (^com.google.cloud.compute.v1.SourceInstanceParams [^InstanceTemplate$Builder this]
    (-> this (.getSourceInstanceParams))))

(defn get-source-instance
  "The source instance used to create the template. You can provide this as a partial or full
   URL to the resource. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance -
   projects/project/zones/zone/instances/instance

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate$Builder this]
    (-> this (.getSourceInstance))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceTemplate`"
  (^com.google.cloud.compute.v1.InstanceTemplate [^InstanceTemplate$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] A unique identifier for this instance template. The server defines this
   identifier.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] The URL for this instance template. The server defines this URL.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceTemplate`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^com.google.cloud.compute.v1.InstanceTemplate other]
    (-> this (.mergeFrom other))))

(defn set-properties
  "The instance properties for this instance template.

  properties - `com.google.cloud.compute.v1.InstanceProperties`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^com.google.cloud.compute.v1.InstanceProperties properties]
    (-> this (.setProperties properties))))

(defn set-source-instance
  "The source instance used to create the template. You can provide this as a partial or full
   URL to the resource. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance -
   projects/project/zones/zone/instances/instance

  source-instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this ^java.lang.String source-instance]
    (-> this (.setSourceInstance source-instance))))

(defn get-self-link
  "[Output Only] The URL for this instance template. The server defines this URL.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceTemplate$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplate$Builder [^InstanceTemplate$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] The creation timestamp for this instance template in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceTemplate$Builder this]
    (-> this (.getCreationTimestamp))))

