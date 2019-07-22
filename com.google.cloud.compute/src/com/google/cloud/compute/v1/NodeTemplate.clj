(ns com.google.cloud.compute.v1.NodeTemplate
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplate]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeTemplate`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^com.google.cloud.compute.v1.NodeTemplate prototype]
    (NodeTemplate/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeTemplate$Builder []
    (NodeTemplate/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeTemplate`"
  (^com.google.cloud.compute.v1.NodeTemplate []
    (NodeTemplate/getDefaultInstance )))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#nodeTemplate for node templates.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of the node template. One of the following values: CREATING, READY,
   and DELETING.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getStatus))))

(defn get-node-type-flexibility
  "The flexible properties of the desired node type. Node groups that use this node template will
   create nodes of a type that matches these properties.

   This field is mutually exclusive with the node_type property; you can only define one or the
   other, but not both.

  returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility [^NodeTemplate this]
    (-> this (.getNodeTypeFlexibility))))

(defn get-node-affinity-labels-map
  "Labels to use for node affinity, which will be used in instance scheduling.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^NodeTemplate this]
    (-> this (.getNodeAffinityLabelsMap))))

(defn get-node-type
  "The node type to use for nodes group that are created from this template.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getNodeType))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeTemplate this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeTemplate this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "The name of the resource, provided by the client when initially creating the resource. The
   resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   which means the first character must be a lowercase letter, and all following characters must
   be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeTemplate this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeTemplate this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeTemplate this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-status-message
  "[Output Only] An optional, human-readable explanation of the status.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getStatusMessage))))

(defn get-region
  "[Output Only] The name of the region where the node template resides, such as us-central1.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate this]
    (-> this (.toBuilder))))

