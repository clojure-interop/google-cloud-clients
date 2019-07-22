(ns com.google.cloud.compute.v1.NodeTemplate$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplate$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-region
  "[Output Only] The name of the region where the node template resides, such as us-central1.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#nodeTemplate for node templates.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of the node template. One of the following values: CREATING, READY,
   and DELETING.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getStatus))))

(defn get-node-type-flexibility
  "The flexible properties of the desired node type. Node groups that use this node template
   will create nodes of a type that matches these properties.

   This field is mutually exclusive with the node_type property; you can only define one or
   the other, but not both.

  returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility [^NodeTemplate$Builder this]
    (-> this (.getNodeTypeFlexibility))))

(defn set-node-type-flexibility
  "The flexible properties of the desired node type. Node groups that use this node template
   will create nodes of a type that matches these properties.

   This field is mutually exclusive with the node_type property; you can only define one or
   the other, but not both.

  node-type-flexibility - `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility node-type-flexibility]
    (-> this (.setNodeTypeFlexibility node-type-flexibility))))

(defn get-node-affinity-labels-map
  "Labels to use for node affinity, which will be used in instance scheduling.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^NodeTemplate$Builder this]
    (-> this (.getNodeAffinityLabelsMap))))

(defn get-node-type
  "The node type to use for nodes group that are created from this template.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getNodeType))))

(defn set-name
  "The name of the resource, provided by the client when initially creating the resource. The
   resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] The type of the resource. Always compute#nodeTemplate for node templates.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "The name of the resource, provided by the client when initially creating the resource. The
   resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeTemplate`"
  (^com.google.cloud.compute.v1.NodeTemplate [^NodeTemplate$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getDescription))))

(defn set-node-type
  "The node type to use for nodes group that are created from this template.

  node-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String node-type]
    (-> this (.setNodeType node-type))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeTemplate`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^com.google.cloud.compute.v1.NodeTemplate other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getSelfLink))))

(defn put-all-node-affinity-labels
  "Labels to use for node affinity, which will be used in instance scheduling.

  node-affinity-labels - `java.util.Map`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.util.Map node-affinity-labels]
    (-> this (.putAllNodeAffinityLabels node-affinity-labels))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-status-message
  "[Output Only] An optional, human-readable explanation of the status.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getStatusMessage))))

(defn set-status
  "[Output Only] The status of the node template. One of the following values: CREATING, READY,
   and DELETING.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn set-status-message
  "[Output Only] An optional, human-readable explanation of the status.

  status-message - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplate$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplate$Builder [^NodeTemplate$Builder this ^java.lang.String status-message]
    (-> this (.setStatusMessage status-message))))

(defn get-region
  "[Output Only] The name of the region where the node template resides, such as us-central1.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplate$Builder this]
    (-> this (.getRegion))))

