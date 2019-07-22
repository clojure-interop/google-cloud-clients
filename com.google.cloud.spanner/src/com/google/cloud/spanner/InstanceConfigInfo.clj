(ns com.google.cloud.spanner.InstanceConfigInfo
  "Represents a Cloud Spanner instance config resource."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner InstanceConfigInfo]))

(defn ->instance-config-info
  "Constructor.

  id - `com.google.cloud.spanner.InstanceConfigId`
  display-name - `java.lang.String`"
  (^InstanceConfigInfo [^com.google.cloud.spanner.InstanceConfigId id ^java.lang.String display-name]
    (new InstanceConfigInfo id display-name)))

(defn get-id
  "returns: `com.google.cloud.spanner.InstanceConfigId`"
  (^com.google.cloud.spanner.InstanceConfigId [^InstanceConfigInfo this]
    (-> this (.getId))))

(defn get-display-name
  "Returns the display name of this instance config.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceConfigInfo this]
    (-> this (.getDisplayName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceConfigInfo this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceConfigInfo this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceConfigInfo this]
    (-> this (.toString))))

