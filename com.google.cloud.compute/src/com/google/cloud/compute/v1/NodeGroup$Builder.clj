(ns com.google.cloud.compute.v1.NodeGroup$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroup$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#nodeGroup for node group.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup$Builder this]
    (-> this (.getKind))))

(defn get-status
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup$Builder this]
    (-> this (.getStatus))))

(defn set-name
  "The name of the resource, provided by the client when initially creating the resource. The
   resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] The type of the resource. Always compute#nodeGroup for node group.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "The name of the resource, provided by the client when initially creating the resource. The
   resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeGroup`"
  (^com.google.cloud.compute.v1.NodeGroup [^NodeGroup$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup$Builder this]
    (-> this (.getDescription))))

(defn set-node-template
  "The URL of the node template to which this node group belongs.

  node-template - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.String node-template]
    (-> this (.setNodeTemplate node-template))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeGroup`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^com.google.cloud.compute.v1.NodeGroup other]
    (-> this (.mergeFrom other))))

(defn get-node-template
  "The URL of the node template to which this node group belongs.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup$Builder this]
    (-> this (.getNodeTemplate))))

(defn set-zone
  "[Output Only] The name of the zone where the node group resides, such as us-central1-a.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup$Builder this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The name of the zone where the node group resides, such as us-central1-a.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup$Builder this]
    (-> this (.getZone))))

(defn set-size
  "[Output Only] The total number of nodes in the node group.

  size - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.Integer size]
    (-> this (.setSize size))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroup$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-size
  "[Output Only] The total number of nodes in the node group.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeGroup$Builder this]
    (-> this (.getSize))))

(defn set-status
  "status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroup$Builder`"
  (^com.google.cloud.compute.v1.NodeGroup$Builder [^NodeGroup$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

