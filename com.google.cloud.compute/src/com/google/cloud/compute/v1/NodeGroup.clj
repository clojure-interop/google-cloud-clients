(ns com.google.cloud.compute.v1.NodeGroup
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroup]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeGroup`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^com.google.cloud.compute.v1.NodeGroup prototype]
    (NodeGroup/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeGroup$Builder []
    (NodeGroup/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeGroup`"
  (^com.google.cloud.compute.v1.NodeGroup []
    (NodeGroup/getDefaultInstance )))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#nodeGroup for node group.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.getKind))))

(defn get-status
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.getStatus))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroup this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeGroup this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "The name of the resource, provided by the client when initially creating the resource. The
   resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   which means the first character must be a lowercase letter, and all following characters must
   be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeGroup this]
    (-> this (.getApiMessageRequestBody))))

(defn get-node-template
  "The URL of the node template to which this node group belongs.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.getNodeTemplate))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The name of the zone where the node group resides, such as us-central1-a.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeGroup this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup this]
    (-> this (.getCreationTimestamp))))

(defn get-size
  "[Output Only] The total number of nodes in the node group.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeGroup this]
    (-> this (.getSize))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeGroup this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup this]
    (-> this (.toBuilder))))

