(ns com.google.cloud.compute.v1.NodeType$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeType$Builder]))

(defn set-description
  "[Output Only] An optional textual description of the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#nodeType for node types.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType$Builder this]
    (-> this (.getKind))))

(defn get-cpu-platform
  "[Output Only] The CPU platform used by this node type.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType$Builder this]
    (-> this (.getCpuPlatform))))

(defn set-guest-cpus
  "[Output Only] The number of virtual CPUs that are available to the node type.

  guest-cpus - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.Integer guest-cpus]
    (-> this (.setGuestCpus guest-cpus))))

(defn set-local-ssd-gb
  "[Output Only] Local SSD available to the node type, defined in GB.

  local-ssd-gb - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.Integer local-ssd-gb]
    (-> this (.setLocalSsdGb local-ssd-gb))))

(defn get-guest-cpus
  "[Output Only] The number of virtual CPUs that are available to the node type.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeType$Builder this]
    (-> this (.getGuestCpus))))

(defn get-local-ssd-gb
  "[Output Only] Local SSD available to the node type, defined in GB.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeType$Builder this]
    (-> this (.getLocalSsdGb))))

(defn set-name
  "[Output Only] Name of the resource.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] The type of the resource. Always compute#nodeType for node types.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this node type.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^NodeType$Builder this]
    (-> this (.getDeprecated))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeType`"
  (^com.google.cloud.compute.v1.NodeType [^NodeType$Builder this]
    (-> this (.build))))

(defn get-description
  "[Output Only] An optional textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeType`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^com.google.cloud.compute.v1.NodeType other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] The name of the zone where the node type resides, such as us-central1-a.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType$Builder this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The name of the zone where the node type resides, such as us-central1-a.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType$Builder this]
    (-> this (.getZone))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this]
    (-> this (.clone))))

(defn get-memory-mb
  "[Output Only] The amount of physical memory available to the node type, defined in MB.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeType$Builder this]
    (-> this (.getMemoryMb))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeType$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-memory-mb
  "[Output Only] The amount of physical memory available to the node type, defined in MB.

  memory-mb - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.Integer memory-mb]
    (-> this (.setMemoryMb memory-mb))))

(defn set-deprecated
  "[Output Only] The deprecation status associated with this node type.

  deprecated - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^com.google.cloud.compute.v1.DeprecationStatus deprecated]
    (-> this (.setDeprecated deprecated))))

(defn set-cpu-platform
  "[Output Only] The CPU platform used by this node type.

  cpu-platform - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeType$Builder`"
  (^com.google.cloud.compute.v1.NodeType$Builder [^NodeType$Builder this ^java.lang.String cpu-platform]
    (-> this (.setCpuPlatform cpu-platform))))

