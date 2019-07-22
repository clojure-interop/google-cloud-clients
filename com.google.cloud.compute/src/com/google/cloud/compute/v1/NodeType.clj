(ns com.google.cloud.compute.v1.NodeType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeType]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeType`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^com.google.cloud.compute.v1.NodeType prototype]
    (NodeType/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeType$Builder []
    (NodeType/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeType`"
  (^com.google.cloud.compute.v1.NodeType []
    (NodeType/getDefaultInstance )))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#nodeType for node types.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType this]
    (-> this (.getKind))))

(defn get-cpu-platform
  "[Output Only] The CPU platform used by this node type.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType this]
    (-> this (.getCpuPlatform))))

(defn get-guest-cpus
  "[Output Only] The number of virtual CPUs that are available to the node type.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeType this]
    (-> this (.getGuestCpus))))

(defn get-local-ssd-gb
  "[Output Only] Local SSD available to the node type, defined in GB.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeType this]
    (-> this (.getLocalSsdGb))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeType this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeType this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeType this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType this]
    (-> this (.getName))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this node type.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^NodeType this]
    (-> this (.getDeprecated))))

(defn get-description
  "[Output Only] An optional textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeType this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The name of the zone where the node type resides, such as us-central1-a.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeType this]
    (-> this (.hashCode))))

(defn get-memory-mb
  "[Output Only] The amount of physical memory available to the node type, defined in MB.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeType this]
    (-> this (.getMemoryMb))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeType this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType this]
    (-> this (.toBuilder))))

