(ns com.google.cloud.spanner.InstanceInfo
  "Represents a Cloud Spanner Instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner InstanceInfo]))

(defn *new-builder
  "id - `com.google.cloud.spanner.InstanceId`

  returns: `com.google.cloud.spanner.InstanceInfo$Builder`"
  (^com.google.cloud.spanner.InstanceInfo$Builder [^com.google.cloud.spanner.InstanceId id]
    (InstanceInfo/newBuilder id)))

(defn get-instance-config-id
  "Returns the identifier of the instance configuration.

  returns: `com.google.cloud.spanner.InstanceConfigId`"
  (^com.google.cloud.spanner.InstanceConfigId [^InstanceInfo this]
    (-> this (.getInstanceConfigId))))

(defn get-node-count
  "Returns the node count of the instance.

  returns: `int`"
  (^Integer [^InstanceInfo this]
    (-> this (.getNodeCount))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceInfo this]
    (-> this (.toString))))

(defn get-display-name
  "Returns the display name of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceInfo this]
    (-> this (.getDisplayName))))

(defn get-state
  "Returns the current state of the instance.

  returns: `com.google.cloud.spanner.InstanceInfo$State`"
  (^com.google.cloud.spanner.InstanceInfo$State [^InstanceInfo this]
    (-> this (.getState))))

(defn get-labels
  "Returns the cloud labels attached to this instance.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^InstanceInfo this]
    (-> this (.getLabels))))

(defn get-id
  "Returns the identifier of the instance.

  returns: `com.google.cloud.spanner.InstanceId`"
  (^com.google.cloud.spanner.InstanceId [^InstanceInfo this]
    (-> this (.getId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceInfo this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceInfo this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.spanner.InstanceInfo$Builder`"
  (^com.google.cloud.spanner.InstanceInfo$Builder [^InstanceInfo this]
    (-> this (.toBuilder))))

