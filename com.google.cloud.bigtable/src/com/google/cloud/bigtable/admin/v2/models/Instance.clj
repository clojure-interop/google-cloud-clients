(ns com.google.cloud.bigtable.admin.v2.models.Instance
  "Represents an existing Cloud Bigtable instance.

  A Cloud Bigtable instance is mostly just a container for your clusters and nodes, which do all
  of the real work."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models Instance]))

(defn *from-proto
  "Wraps the protobuf. This method is considered an internal implementation detail and not meant
   to be used by applications.

  proto - `com.google.bigtable.admin.v2.Instance`

  returns: `com.google.cloud.bigtable.admin.v2.models.Instance`"
  (^com.google.cloud.bigtable.admin.v2.models.Instance [^com.google.bigtable.admin.v2.Instance proto]
    (Instance/fromProto proto)))

(defn get-id
  "Gets the instance's id.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance this]
    (-> this (.getId))))

(defn get-display-name
  "Gets the instance's friendly name.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance this]
    (-> this (.getDisplayName))))

(defn get-type
  "Gets the instance's current type. Can be DEVELOPMENT or PRODUCTION.

  returns: `com.google.cloud.bigtable.admin.v2.models.Instance$Type`"
  (^com.google.cloud.bigtable.admin.v2.models.Instance$Type [^Instance this]
    (-> this (.getType))))

(defn get-labels
  "Gets the current labels associated with the instance.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Instance this]
    (-> this (.getLabels))))

(defn get-state
  "The current state of the instance.

  returns: `com.google.cloud.bigtable.admin.v2.models.Instance$State`"
  (^com.google.cloud.bigtable.admin.v2.models.Instance$State [^Instance this]
    (-> this (.getState))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Instance this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Instance this]
    (-> this (.hashCode))))

